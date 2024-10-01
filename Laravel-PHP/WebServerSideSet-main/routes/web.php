<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\IndexController;
use App\Http\Controllers\PrendasController;

Route::get('/', function () {
    return view('welcome');
})->name('route.welcome');

Route::get('/cursos/{name}', function ($name) {
    return '<h1>Olá Mundo'.$name.'</h1>';
});

Route::get('/users/export',[UserController::class, 'generateExcel']);

// HOME

Route::get('home', [IndexController::class, 'indexHome'])->name('home');

Route::get('/users/welcome1', [UserController::class, 'welCome'])->name('users.welcome1');

// TASKS

Route::get('/users/add_tasks', [TaskController::class, 'addTask'])->name('users.add_tasks');

Route::post('/users/create-tasks', [TaskController::class, 'createTasks'])->name('tasks.create');

Route::get('/users/view_task/{id}', [TaskController::class, 'viewTask'])->name('users.view_task');

Route::get('/users/all_tasks', [TaskController::class, 'allTasks'])->name('users.all_tasks');

Route::get('/tasks/delete/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');

// USERS

Route::get('/users/add_user', [UserController::class, 'addUser'])->name('users.add');

Route::post('/users/create-user', [UserController::class, 'createUser'])->name('users.create');

Route::get('/users/view_user/{id}', [UserController::class, 'viewUser'])->name('users.view_user');

Route::get('/users/all_user', [UserController::class, 'allUser'])->name('users.allUser');

Route::get('/users/delete/{id}', [UserController::class, 'deleteUser'])->name('users.delete');

// PRENDAS

Route::get('/users/add_prendas', [PrendasController::class, 'addPrendas'])->name('users.add_prendas');

Route::post('/users/create-prendas', [PrendasController::class, 'createPrendas'])->name('prendas.create');

Route::get('/users/view_prendas/{id}', [PrendasController::class, 'viewPrendas'])->name('users.view_prendas');

Route::get('/users/all_prendas', [PrendasController::class, 'allPrendas'])->name('users.allPrendas');

Route::get('/prendas/delete/{id}', [PrendasController::class, 'deletePrendas'])->name('prendas.delete');



Route::fallback(function(){
    return '<h3>Estás perdido, <a href='.route('home').'>voltar.</a></h3>';
});
