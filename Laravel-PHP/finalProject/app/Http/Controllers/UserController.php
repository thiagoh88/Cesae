<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Hash;

class UserController extends Controller
{
    public function create()
    {
        if (auth()->check() && auth()->user()->admin == 1) {
            return view('admin.user.create');
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

    public function showUsers()
    {
        $users = User::all();
        return view('admin.user.users', compact('users'));
    }
    public function updateRole(Request $request, $id)
{
    $request->validate([
        'admin' => 'required|in:0,1',
    ]);

    $user = User::findOrFail($id);
    $user->admin = $request->admin;
    $user->save();

    return redirect()->back()->with('success', 'Cargo do usuário atualizado com sucesso.');
}

    public function deleteUsers($userId)
    {
        $user = User::find($userId);
            $user->delete();
        return redirect()->route('user.users')->with('success', 'Está feito!');

    }

}
