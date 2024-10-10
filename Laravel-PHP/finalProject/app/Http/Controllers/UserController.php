<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
    public function createUser()
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('admin.users.create');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    public function viewUser(){

        $users = User::all();
        return view('admin.users.users', compact('users'));
    }
    public function store(Request $request)
    {
        $request->validate([
            'name' => 'required|string|max:255',
            'email' => 'required|string|email|max:255|unique:users',
            'password' => 'required|string|min:8|confirmed',
            'admin' => 'required|boolean'
        ]);

        User::create([
            'name' => $request->name,
            'email' => $request->email,
            'password' => bcrypt($request->password),
            'admin' => $request->admin,
        ]);

        return redirect()->route('admin.dashboard')->with('success');
    }


    public function deleteUsers($userId)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            DB::table('users')->where('id', '=', $userId)->delete();
            return back();
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    }

