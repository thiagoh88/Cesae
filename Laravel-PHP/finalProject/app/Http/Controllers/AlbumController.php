<?php

namespace App\Http\Controllers;

use App\Models\Album;
use App\Models\Banda;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Storage;

class AlbumController extends Controller
{
    public function index(Banda $banda) {
        $albuns = $banda->albuns;
        return view('music.albums', compact('banda', 'albuns'));
    }
    public function createAlbum(Banda $banda)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('music.createAlbums', compact('banda'));
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function storeAlbum(Request $request, Banda $banda)
    {
        $validated = $request->validate([
            'nome' => 'required|string|max:255',
            'imagem' => 'required|image',
            'data_lancamento' => 'required|date',
        ]);
        $path = $request->file('imagem')->store('imagens', 'public');
        Album::create([
            'nome' => $validated['nome'],
            'imagem' => $path,
            'data_lancamento' => $validated['data_lancamento'],
            'banda_id' => $banda->id, // Certifique-se de que $banda não é null
        ]);
        return redirect()->route('music.albums', $banda)->with('success', 'Album adicionado com sucesso!');
    }
    public function deleteAlbum(Album $album)
    {
        if (Storage::disk('public')->exists($album->imagem)) {
            Storage::disk('public')->delete($album->imagem);
        }
        $album->delete();

        return redirect()->back()->with('success', 'Album deletado com sucesso!');
    }

}
