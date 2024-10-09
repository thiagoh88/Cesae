<?php
use App\Http\Controllers\AlbumsController;
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
Route::get('/bandas/{bandaId}/albums', [AlbumsController::class, 'viewAlbums'])->name('albums.albums');
Route::get('/bandas/{bandaId}/albums/create', [AlbumsController::class, 'createAlbums'])->name('albums.createAlbums')->middleware('auth');
Route::post('/bandas/{bandaId}/albums', [AlbumsController::class, 'store'])->name('albums.store');
Route::delete('/bandas/{bandaId}/albums/{albumId}', [AlbumsController::class, 'deleteAlbums'])->name('albums.deleteAlbums')->middleware('auth');


//Route::get('/bandas/{bandaId}/albums/create', [AlbumsController::class, 'create'])->name('albums.create');
