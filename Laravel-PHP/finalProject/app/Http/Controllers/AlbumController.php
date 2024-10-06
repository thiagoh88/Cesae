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
    public function createAlbum($bandaId)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('music.createAlbums', compact('bandaId'));
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function storeAlbum(Request $request, $bandaId)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'imagem' => 'required|image|mimes:jpeg,png,jpg,gif,svg|max:2048',
            'data_lancamento' => 'required|date',
        ]);
        $banda = Banda::find($bandaId);

        if (!$banda) {
            return redirect()->back()->with('error', 'Banda não encontrada');
        }
        $album = new Album();
        $album->nome = $request->input('nome');
        $album->imagem = $request->file('imagem')->store('imagens');
        $album->data_lancamento = $request->input('data_lancamento');
        $album->banda_id = $banda->id;
        $album->save();

        return redirect()->route('music.banda.show', ['id' => $bandaId])->with('success', 'Álbum adicionado com sucesso!');
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
