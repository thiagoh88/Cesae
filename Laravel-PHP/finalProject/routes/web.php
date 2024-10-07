<?php

use App\Http\Controllers\BandasController;
use App\Http\Controllers\DashboardController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

// Login
Route::get('/', function () {return view('auth.login');});
// Dashboard
Route::get('/admin/dashboard', [DashboardController::class, 'index'])->name('admin.dashboard');

// USER
Route::get('/admin/users/users', [UserController::class, 'viewUser'])->name('users.users');
Route::get('/admin/users/create', [UserController::class, 'createUser'])->name('users.create')->middleware('auth');
Route::post('/admin/user/store', [UserController::class, 'store'])->name('user.store');
Route::delete('/admin/{users}', [UserController::class, 'deleteUsers'])->name('users.deleteUsers')->middleware('auth');

// BANDAS
Route::get('/bandas/bandas', [BandasController::class, 'viewBandas'])->name('bandas.bandas');
Route::get('/bandas/createBandas', [BandasController::class, 'createBandas'])->name('bandas.createBandas')->middleware('auth');
Route::post('/bandas/store', [BandasController::class, 'store'])->name('bandas.store');
Route::delete('/bandas/{bandas}/', [BandasController::class, 'deleteBandas'])->name('bandas.deleteBandas')->middleware('auth');



// ALBUMS
//Route::get('/albums/all_albums', [AlbumsController::class, 'allAlbums'])->name('albums.all');
//Route::get('/albums/view/{id}', [AlbumsController::class, 'viewAlbums'])->name('albums.view');
//Route::get('/albums/delete/{id}', [AlbumsController::class, 'deleteAlbums'])->name('albums.delete');
//Route::get('/albums/show-form', [AlbumsController::class, 'showForm'])->name('albums.form');
//Route::post('/albums/store', [AlbumsController::class, 'store'])->name('albums.store');
