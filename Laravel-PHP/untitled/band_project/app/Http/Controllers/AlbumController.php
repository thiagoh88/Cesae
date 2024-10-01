<?php

namespace App\Http\Controllers;

use App\Models\Album;
use App\Models\Banda;
use Illuminate\Http\Request;

class AlbumController extends Controller
{
    public function create($banda_id) {
        $banda = Banda::findOrFail($banda_id);
        return view('albums.create', compact('banda'));
    }

    public function store(Request $request, $banda_id) {
        $album = new Album;
        $album->banda_id = $banda_id;
        $album->nome = $request->nome;
        $album->data_lancamento = $request->data_lancamento;
        // lógica para salvar a imagem
        $album->save();
        return redirect()->route('bandas.show', $banda_id);
    }
}
