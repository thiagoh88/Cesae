<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class BandasController extends Controller
{
    public function createBandas()
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('bandas.createBandas');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function viewBandas(){
        $bandas = Bandas::all();
        return view('bandas.bandas', compact('bandas'));
    }

    public function deleteBandas($id){
        DB::table('bandas')->where('id', $id)->delete();
        return back();
    }
    public function store(Request $request)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'foto' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);

        $banda = new Bandas();
        $banda->nome = $request->nome;


        if ($request->hasFile('foto')) {
            $path = $request->file('foto')->store('imagens', 'public');
            $banda->foto = $path;
        }

        $banda->save();

        return redirect()->route('bandas.bandas')->with('success', 'Banda criada com sucesso!');
    }
  }
