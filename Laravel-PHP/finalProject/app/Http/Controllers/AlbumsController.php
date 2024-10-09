<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;

class AlbumsController extends Controller
{
    public function viewAlbums($bandaId)
    {
        $banda = Bandas::findOrFail($bandaId);
        $albums = Albums::where('banda_id', $bandaId)->get();
        return view('albums.albums', compact('banda', 'albums'));
    }

    public function createAlbums($bandaId)
    {

        $banda = Bandas::findOrFail($bandaId);
        return view('albums.createAlbums', compact('banda'));
    }

    public function store(Request $request, $bandaId)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'imagem' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);

        $album = new Albums();
        $album->nome = $request->nome;
        $album->banda_id = $bandaId;

        if ($request->hasFile('imagem')) {
            $album->imagem = $request->file('imagem')->store('imagens', 'public');

        }

        $album->save();

        return redirect()->route('albums.albums', ['bandaId' => $bandaId])->with('success', 'Álbum adicionado com sucesso!');
    }
    public function edit($bandaId, $albumId)
    {
        $banda = Bandas::findOrFail($bandaId);
        $album = Albums::findOrFail($albumId);
        return view('albums.editAlbums', compact('banda', 'album'));
    }
    public function update(Request $request, $bandaId, $albumId)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'imagem' => 'nullable|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);

        $album = Albums::findOrFail($albumId);
        $album->nome = $request->nome;

        if ($request->hasFile('imagem')) {
            $album->imagem = $request->file('imagem')->store('imagens', 'public');
        }

        $album->save();

        return redirect()->route('albums.view', ['bandaId' => $bandaId])->with('success', 'Álbum atualizado com sucesso!');
    }
    public function deleteAlbums($bandaId, $albumId)
    {
        $album = Albums::findOrFail($albumId);
        $album->delete();

        return redirect()->route('albums.view', ['bandaId' => $bandaId])->with('success', 'Álbum deletado com sucesso!');
    }
}
