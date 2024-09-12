<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function addUser(){

        // DB::table('users')->insert([
        //     'name'=> 'quim',
        //     'email'=> 'quim@quim',
        //     'password'=> '1234'
        // ]);

        // DB::table('tasks')->where('id',1)->update([
        //     'description' => 'operações à base de dados'
        // ]);

        // DB::table('users')->updateOrInsert([
        //     'email' => 'thiagoh88@gmail.com'],
        //     [
        //     'name' => 'thiago',
        //     'password' => '1234',
        //     'updated_at' => now(),
        //     ]);

        return view('users.add_user');
    }
    public function allUser(){
        $users = $this->getUsers();
        return view('users.all_user',compact('users'));
    }
    public function welCome(){
        return view('users.welcome1');
    }

    protected function getUsers(){
        $users = DB::table('users')->get();
//$myUsers = DB::table('users')->where('name', 'thiago')->first();
        return $users;
    }

    public function viewUser($id){

$users = DB::table('users')->where('id', $id)->first();
return view('users.view_user',compact('users'));
    }

    public function deleteUser($id){
        $users = DB::table('tasks')->where('user_id', $id)->delete();
        $users = DB::table('users')->where('id', $id)->delete();

        return back();
            }

    public function viewTask($id){

        $tasks = DB::table('tasks')->where('tasks.id', $id)->join('users', 'users.id', '=', 'tasks.user_id')->select('tasks.*','users.name as users_name')->first();

        return view('users.view_task',compact('tasks'));

           }

           public function deleteTask($id){
             DB::table('tasks')->where('id', $id)->delete();


            return back();
                }

}
