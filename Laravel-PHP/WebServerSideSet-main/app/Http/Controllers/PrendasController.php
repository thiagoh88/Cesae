<?php

namespace App\Http\Controllers;

use App\Models\User;
use App\Models\Prendas;
use Illuminate\Http\Request;
use Illuminate\Routing\Controller;
use Illuminate\Support\Facades\DB;

class PrendasController extends Controller
{
public function addPrendas(){
    $users = User::all();
    return view('users.add_prendas', compact('users'));
}
public function allPrendas(){
    $search = request()->search;
    $prendas = $this->getPrendas($search);
    return view('users.all_prendas',compact('prendas'));
}
protected function getPrendas($search){
    if ($search){
        $prendas = Prendas::where('users.name','like',"%{$search}%")->join('users', 'users.id', '=', 'prendas.id_user')->select('prendas.*','users.name as users_name')->get();
    }else{
        $prendas = DB::table('prendas')->join('users', 'users.id', '=', 'prendas.id_user')->select('prendas.*','users.name as users_name')->get();
    }
    return $prendas;
}
public function viewPrendas($id){
    $prendas = DB::table('prendas')->where('id', $id)->first();
return view('users.view_prendas',compact('prendas'));
}
public function deletePrendas($id){
    DB::table('prendas')->where('id', $id)->delete();
    $prendas = DB::table('prendas')->where('id', $id)->delete();
    return back();
        }
public function createPrendas(Request $request){
            $action = '';
    // update
            if(isset($request->id)){
                $action = 'actualizado';
                $request->validate([
                    'nome' => 'required|string|max:9999',
                    'valorprevisto' => 'required|string|max:9999',
                    'valorgasto' => 'required|string|max:9999'
                ]);
                Prendas::where('id',$request->id)->update([
                    'nome'=> $request->nome,
                    'valorprevisto' => $request->valorprevisto,
                    'valorgasto' => $request->valorgasto,
              ]);
    // insert
            }else{

               $action = 'adicionado';
               $request->validate([
            'nome' => 'required|string|max:9999',
            'valorprevisto' => 'required|string|max:9999',
            'valorgasto' => 'required|string|max:9999',
            'id_user' => 'required|string|max:9999'
              ]);

                 Prendas::insert([
            'nome' => $request->nome,
            'valorprevisto' => $request->valorprevisto,
            'valorgasto' => $request->valorgasto,
            'id_user' => $request->id_user
        ]);
            };
        return redirect()->route('users.allPrendas')->with('message', 'Prenda adicionada com sucesso' . $action . 'atualizado com sucesso!');
        }
}
