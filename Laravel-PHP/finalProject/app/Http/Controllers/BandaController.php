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
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('music.createBandas');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function store(Request $request)
    {

        $request->validate([
            'nome' => 'required|string|max:255',
            'foto' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);
        if ($request->hasFile('foto')) {
            $filePath = $request->file('foto')->store('imagens', 'public');
        }
        $banda = new Banda();
        $banda->nome = $request->input('nome');
        $banda->foto = $filePath;
        $banda->save();

        return redirect()->route('music.bandas')->with('success', 'Tá Feito!');
    }

    public function deleteBandas(Banda $banda)
    {

        Storage::disk('public')->delete($banda->foto);


        $banda->delete();


        return redirect()->route('music.bandas')->with('success', 'Tá Feito!');
    }

}

