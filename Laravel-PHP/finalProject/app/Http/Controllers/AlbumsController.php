<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;
use Illuminate\Support\Carbon;
use Illuminate\Support\Facades\DB;

class AlbumsController extends Controller
{
    public function createAlbums($bandaId)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            $banda = Bandas::find($bandaId);
            return view('albums.createAlbums', compact('banda'));
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function viewAlbums($bandaId)
    {
        $banda = Bandas::find($bandaId);
        $albums = Albums::where('banda_id', $bandaId)->get();
        return view('albums.albums', compact('banda', 'albums'));
    }
    public function store(Request $request, $bandaId)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'imagem' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
            'data_lancamento' => 'required|date',
        ]);
        $data = [
            'nome' => $request->nome,
            'banda_id' => $bandaId,
            'data_lancamento' =>$request->data_lancamento,
            'created_at' => now(),
            'updated_at' => now(),
        ];
        if ($request->hasFile('imagem')) {
            $data['imagem'] = $request->file('imagem')->store('imagens', 'public');
        }
        Albums::insert($data);

        return redirect()->route('albums.albums', ['bandaId' => $bandaId])->with('success');
    }
    public function deleteAlbums($bandaId, $albumId)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            DB::table('albums')->where('banda_id', $bandaId)->where('id', $albumId)->delete();
            return redirect()->route('albums.albums', ['bandaId' => $bandaId])->with('success');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
}
