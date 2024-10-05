<?php

namespace App\Http\Controllers;

use App\Models\Banda;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Storage;

class BandaController extends Controller
{
    public function index() {
        $bandas = Banda::all();
        return view('music.bandas', compact('bandas'));
    }
    public function create()
    {
        return view('music.createBandas');
    }
    public function store(Request $request)
    {

        $request->validate([
            'nome' => 'required|string|max:255',
            'foto' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);


        $fotoPath = $request->file('foto')->store('finalProject/storage/imagens', 'public');

        Banda::create([
            'nome' => $request->nome,
            'foto' => $fotoPath,
            'numero_albuns' => 0,
        ]);

        return redirect()->route('music.bandas')->with('success', 'Tá Feito!');
    }

    public function destroy(Banda $banda)
    {

        Storage::disk('public')->delete($banda->foto);


        $banda->delete();


        return redirect()->route('music.bandas')->with('success', 'Tá Feito!');
    }

}

