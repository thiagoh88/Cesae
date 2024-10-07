<?php

namespace App\Http\Controllers;

use App\Models\Albums;
use App\Models\Bandas;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class AlbumsController extends Controller
{

    public function allAlbums(){
        $albums = $this->getAlbums();
        return view('albums.show_albums', compact('albums'));
    }
    protected function getAlbums(){
        $albums = DB::table('albums')
            ->join('bandas', 'bandas.id', 'albums.banda_id')
            ->select('albums.*', 'bandas.name as bandas_name')
            ->get();
        return $albums;
    }
    public function viewAlbums($id){
        $albums = DB::table('albums')->where('albums.id', $id)->join('bandas', 'bandas.id', 'albums.banda_id')
        ->select('albums.*', 'bandas.name as banda_name')->first();

        return view('albums.view_albums', compact('albums'));
    }
    public function deleteAlbums($id){
        DB::table('lbums')->where('id', $id)->delete();

        return back();
    }
    public function showForm()
    {
        $bandas = Bandas::all();

        return view('albums.show_form', compact('bandas'));
    }
    public function store(Request $request)
    {
       $request->validate([
            'name'=> 'string|max:50|required',

       ]);

       DB::table('albums')->insert([
        'name' => $request->nome,
       ]);
       return redirect()->route('albums.all')->with('message','adicionada com sucesso');
    }
}
