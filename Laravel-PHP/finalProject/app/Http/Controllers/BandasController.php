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
        foreach ($bandas as $banda) {
            $numeroAlbuns = Albums::where('banda_id', $banda->id)->count();
            $banda->numero_albuns = $numeroAlbuns;
            $banda->save();
        }
        $bandas = Bandas::all();
        return view('bandas.bandas', compact('bandas'));
    }
    public function store(Request $request)
    {
        $request->validate([
            'nome' => 'required|string|max:255',
            'foto' => 'required|image|mimes:jpeg,png,jpg,gif|max:2048',
        ]);
        $data = [
            'nome' => $request->nome,
            'created_at' => now(),
            'updated_at' => now(),
        ];
        if ($request->hasFile('foto')) {
            $data['foto'] = $request->file('foto')->store('imagens', 'public');
        }
        Bandas::insert($data);

        return redirect()->route('bandas.bandas')->with('success');
    }
    public function deleteBandas($id){

        if (auth()->check() && auth()->user()->admin == 1) {
            DB::table('bandas')->where('id', $id)->delete();
            return back();
        }
        return back()->with('error', 'ADMIN ONLY');
    }
}
