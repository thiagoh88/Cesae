<?php

use App\Http\Controllers\DashboardController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('route.welcome');

Route::get('/cursos/{name}', function ($name) {
    return '<h1>Olá Mundo'.$name.'</h1>';
});

Route::get('/home', [IndexController::class, 'callHome'])->name('home');

//rota que mostra a visualização do formulário
Route::get('/users/add_user', [UserController::class, 'addUser'])->name('users.add');

//rota post para onde iremos enviar os dados
Route::post('/users/create-user', [UserController::class, 'createUser'])->name('user.create');

Route::get('/users/all_users', [UserController::class, 'allUsers'])->name('users.all');



Route::get('/users/view/{id}', [UserController::class, 'viewUser'])->name('users.view');

Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');


//tarefas
//busca todas as tarefas
Route::get('/tasks/all_tasks', [TaskController::class, 'allTasks'])->name('tasks.all')->middleware('auth');

//vê uma tarefa
Route::get('/tasks/view/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');

//apaga uma tarefa
Route::get('/tasks/delete/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');


//rota de get, mostra um form
Route::get('/tasks/show-form', [TaskController::class, 'showForm'])->name('tasks.form');

//rota de post, recebe os dados do formulário e vai inserir na base de dados
Route::post('/tasks/store', [TaskController::class, 'store'])->name('tasks.store');

Route::get('dashboard', [DashboardController::class, 'index'])->name('dashboard')->middleware('auth');




Route::fallback(function(){
    return '<h3>Estás perdido, <a href='.route('home').'>voltaaaaa...</a></h3>';
});
