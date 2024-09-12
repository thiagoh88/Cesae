<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('route.welcome');

Route::get('/cursos/{name}', function ($name) {
    return '<h1>Olá Mundo'.$name.'</h1>';
});

Route::get('/home', function(){
   return view('general.home');
})->name('home');


Route::get('/users/add_user', function(){
    return view('users.add_user');
})->name('users.add');

Route::fallback(function(){
    return '<h3>Estás perdido, <a href='.route('home').'>voltaaaaa...</a></h3>';
});
