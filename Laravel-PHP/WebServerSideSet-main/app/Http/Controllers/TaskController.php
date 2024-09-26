<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        //
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
    public function store(Request $request)
    {
        //
    }

    /**
     * Display the specified resource.
     */
    public function show(string $id)
    {
        //
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
    public function update(Request $request, string $id)
    {
        //
    }

    /**
     * Remove the specified resource from storage.
     */
    public function destroy(string $id)
    {
        //
    }

    public function allTasks(){
        $tasks = $this->getAllTasks();
        return view('users.all_tasks',compact('tasks'));
            }

    protected function getAllTasks(){
        $tasks = DB::table('tasks')->join('users', 'users.id', '=', 'tasks.user_id')->select('tasks.*','users.name as users_name')->get();

        return $tasks;
            }
            public function createTasks(Request $request){
                $request->validate([
                    'name' => 'required|string|max:50',
                    'description' => 'required|string|max:100',
                    'user_id' => 'required|string|max:50'
                ]);

                    DB::table('tasks')
                    ->insert([
                        'name' => $request->name,
                        'description' => $request->description,
                        'user_id' => $request->user_id
                    ]);

                    return redirect()->route('users.all_tasks')->with('message', 'Tasks adicionado com sucesso');
            }


            public function addTask(){
                $users = User::all();
                return view('users.add_tasks', compact('users'));
            }
            public function deleteTask($id){
               DB::table('tasks')->where('id', $id)->delete();
               $tasks = DB::table('tasks')->where('id', $id)->delete();

              return back();
                   }

                   public function viewTask($id){

                    $tasks = DB::table('tasks')->where('tasks.id', $id)->join('users', 'id', '=', 'tasks.user_id')->select('tasks.*','users.name as users_name')->first();

                    return view('users.view_task',compact('tasks'));

                       }

                }

