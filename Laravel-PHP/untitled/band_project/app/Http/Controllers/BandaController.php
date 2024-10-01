<?php

namespace App\Http\Controllers;

use App\Models\Album;
use App\Models\Banda;
use Illuminate\Http\Request;

class BandaController extends Controller
{
    public function index() {
        $bandas = Banda::all();
        return view('bandas.index', compact('bandas'));
    }

    public function show($id) {
        $banda = Banda::findOrFail($id);
        $albums = Album::where('banda_id', $id)->get();
        return view('bandas.show', compact('banda', 'albums'));
    }

    public function create() {
        return view('bandas.create');
    }

    public function store(Request $request) {
        $banda = new Banda;
        $banda->nome = $request->nome;
        // lógica para salvar a foto
        $banda->save();
        return redirect()->route('bandas.index');
    }

    public function edit($id) {
        $banda = Banda::findOrFail($id);
        return view('bandas.edit', compact('banda'));
    }

    public function update(Request $request, $id) {
        $banda = Banda::findOrFail($id);
        $banda->nome = $request->nome;
        // lógica para atualizar a foto
        $banda->save();
        return redirect()->route('bandas.index');
    }

    public function destroy($id) {
        $banda = Banda::findOrFail($id);
        $banda->delete();
        return redirect()->route('bandas.index');
    }
    public function __construct() {
        $this->middleware('can:isAdmin')->except(['index', 'show']);
    }

}

