<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class AlbumsController extends Controller
{
    public function createAlbums()
{
    $Albums = Albums::all();
    $banda = Banda::findOrFail($bandaId);
    return view('albums.createAlbums', compact('banda'));
}
    public function viewAlbums($bandaId)
{
    $albums = Albums::where('banda_id', $bandaId)->get();
    return view('albums.albums', compact('albums'));
}
    public function deleteAlbums($id){
        DB::table('Albums')->where('id', $id)->delete();

        return back();
    }
    public function store(Request $request)
{
    $request->validate([
        'nome' => 'required|string|max:255',
        'imagem' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        'banda_id' => 'required|exists:bandas,id',
    ]);

    $album = new Albums();
    $album->nome = $request->nome;

    if ($request->hasFile('imagem')) {
        $path = $request->file('imagem')->store('albums', 'public');
        $album->imagem = $path;
    }

    $album->banda_id = $request->banda_id;
    $album->save();

    return redirect()->route('albums.albums')->with('success', 'Álbum criado com sucesso!');
}

}
