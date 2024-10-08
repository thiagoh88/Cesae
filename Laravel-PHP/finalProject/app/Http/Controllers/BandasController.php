<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class BandasController extends Controller
{

    public function allBandas(){
        $bandas = $this->getBandas();
        return view('bandas.bandas', compact('bandas'));
    }

    protected function getbandas(){
        $bandas = DB::table('bandas')
        ->join('albums', 'albums.id', 'bandas.albums_id')
        ->select('bandas.*', 'albums.name as albums_name')
        ->get();
        return $bandas;
    }
    public function viewBandas(){
        $bandas = Bandas::all();
        return view('bandas.bandas', compact('bandas'));
    }
    public function createBandas()
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('bandas.createBandas');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function deleteBandas($id){
        DB::table('bandas')->where('id', $id)->delete();
        return back();
    }
    public function showForm()
    {
        $albums = Albums::all();

        return view('bandas.show_form', compact('albums'));
    }
    public function store(Request $request)
    {
        $request->validate([
            'name' => 'string|max:50|required',
            'image' => 'image|mimes:jpeg,png,jpg,gif|max:2048|required', // Validação da imagem
        ]);

        if ($request->hasFile('image')) {
            $imageName = time() . '.' . $request->image->extension();
            $request->image->storeAs('imagens', $imageName, 'public');
            DB::table('tasks')->insert([
                'name' => $request->nome,
                'image' => $foto,
                'created_at' => now(),
                'updated_at' => now(),
            ]);
        }
        return redirect()->back()->with('success', 'Tarefa criada com sucesso!');
    }
}
