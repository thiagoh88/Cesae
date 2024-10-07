<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;

class UserController extends Controller
{
    public function createUser()
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('admin.users.create');
        }
        return back()->with('error', 'ADMIN ONLY');
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

        return redirect()->route('admin.dashboard')->with('success', 'Está feito!');
    }

    public function viewUser(){

            $users = User::all();
            return view('admin.users.users', compact('users'));
        }
    public function deleteUsers($userId)
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            $user = User::find($userId);
            $user->delete();
            return redirect()->route('users.users')->with('success', 'Está feito!');
        }
        return back()->with('error', 'ADMIN ONLY');
    }
    }

