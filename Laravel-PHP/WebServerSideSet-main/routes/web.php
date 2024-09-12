<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\IndexController;

Route::get('/', function () {
    return view('welcome');
})->name('route.welcome');

Route::get('/cursos/{name}', function ($name) {
    return '<h1>Olá Mundo'.$name.'</h1>';
});

Route::get('home', [IndexController::class, 'indexHome'])->name('home');

Route::get('/users/welcome1', [UserController::class, 'welCome'])->name('users.welcome1');

Route::get('/users/add_user', [UserController::class, 'addUser'])->name('users.add');

Route::get('/users/all_user', [UserController::class, 'allUser'])->name('users.allUser');

Route::get('/users/all_tasks', [TaskController::class, 'allTasks'])->name('users.all_tasks');

Route::get('/users/view_user/{id}', [UserController::class, 'viewUser'])->name('users.view_user');

Route::get('/users/view_task/{id}', [UserController::class, 'viewTask'])->name('users.view_task');

Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

Route::get('/users/delete/{id}', [UserController::class, 'deleteTask'])->name('users.delete');



Route::fallback(function(){
    return '<h3>Estás perdido, <a href='.route('home').'>voltar.</a></h3>';
});
