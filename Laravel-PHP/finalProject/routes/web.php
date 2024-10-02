<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AdminDashboardController;
use App\Http\Controllers\UserController;

Route::get('/', function () {
    return view('auth.login');
});

Route::get('/admin/dashboard', [AdminDashboardController::class, 'index'])->name('admin.dashboard')->middleware('auth');
Route::get('/admin/user/create', [UserController::class, 'create'])->name('user.create')->middleware('auth');
Route::post('/admin/user/store', [UserController::class, 'store'])->name('user.store')->middleware('auth');

