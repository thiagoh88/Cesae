<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Foundation\Auth\User;
use Illuminate\Support\Facades\Hash;
use Maatwebsite\Excel\Facades\Excel;
class UserController extends Controller
{



public function welCome(){
        return view('users.welcome1');
    }


//USERS

public function addUser(){
        return view('users.add_user');
    }

public function allUser(){
        $search = request()->search;
        $users = $this->getUsers($search);
        return view('users.all_user',compact('users'));
    }

protected function getUsers($search){
        if ($search){
            $users = User::where('name','like', "%{$search}%")->get();
        }else{
            $users = User::all();
        }
        return $users;
    }

public function createUser(Request $request){
        $action = '';
// update
        if(isset($request->id)){
            $action = 'actualizado';
            $request->validate([
                'name' => 'required|string|max:50',
            ]);
            User::where('id',$request->id)->update([
                'name'=> $request->name,
                'phone'=> $request->phone,
                'address'=> $request->address,

            ]);
// insert
        }else{
           $action = 'adicionado';
           $request->validate([
        'name' => 'string|max:50',
        'password'=> 'min:6'
          ]);

             User::insert([
        'name' => $request->name,
        'email' => $request->email,
        'password' => Hash::make($request->password)
    ]);
        };
    return redirect()->route('users.allUser')->with('message', 'Contacto adicionado com sucesso' . $action . 'atualizado com sucesso!');
    }

public function viewUser($id){
            $users = DB::table('users')->where('id', $id)->first();
    return view('users.view_user',compact('users'));
        }

public function deleteUser($id){
            DB::table('tasks')->where('user_id', $id)->delete();
            $users = DB::table('users')->where('id', $id)->delete();
            return back();
                }


public function gerenateExcel(){
    return Excel::download(new ExportUsers, 'users.xlsx');
}

}
