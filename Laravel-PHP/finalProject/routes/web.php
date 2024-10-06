<?php
use Laravel\Fortify\Features;
use App\Http\Controllers\ForgotPasswordController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AdminDashboardController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\BandaController;
use App\Http\Controllers\AlbumController;


// Login
Route::get('/', function () {return view('auth.login');});

// Dashboard
Route::get('/admin/dashboard', [AdminDashboardController::class, 'index'])->name('admin.dashboard')->middleware('auth');

// User
Route::get('/admin/user/users', [UserController::class, 'showUsers'])->name('user.users')->middleware('auth');
Route::get('/admin/user/create', [UserController::class, 'create'])->name('user.create')->middleware('auth');
Route::delete('/admin/{users}', [UserController::class, 'deleteUsers'])->name('user.deleteUsers');
Route::post('/admin/user/store', [UserController::class, 'store'])->name('user.store')->middleware('auth');

// Bandas
Route::get('/music/bandas', [BandaController::class, 'index'])->name('music.bandas')->middleware('auth');
Route::get('/music/createBandas', [BandaController::class, 'create'])->name('music.createBandas')->middleware('auth');
Route::delete('/music/{banda}', [BandaController::class, 'deleteBandas'])->name('music.deleteBandas');
Route::post('/music/store', [BandaController::class, 'store'])->name('music.store')->middleware('auth');
Route::get('/bandas/{id}', [BandaController::class, 'show'])->name('music.banda.show');

// Albums
Route::get('/music/albums', [AlbumController::class, 'index'])->name('music.albums');
Route::get('/bandas/{id}/albums/create', [AlbumController::class, 'createAlbum'])->name('music.createAlbums')->middleware('auth');
Route::delete('/music/{album}', [AlbumController::class, 'deleteAlbum'])->name('music.deleteAlbum');
Route::post('/bandas/{id}/store', [AlbumController::class, 'storeAlbum'])->name('music.storeAlbum')->middleware('auth');



//-------------------------------------------------------------------------------------------------------------------------------------------//

    Route::middleware(['guest'])->group(function () {
    Route::get('forgot-password', function () {
        return view('auth.forgot-password');
    })->middleware(['guest'])->name('password.request');
    Route::get('reset-password/{token}', function ($token) {
        return view('auth.reset-password', ['token' => $token]);
    })->middleware(['guest'])->name('password.reset');
    Route::put('/user/{id}/updateRole', [UserController::class, 'updateRole'])->middleware('auth')->name('user.updateRole');
    Route::post('reset-password', [\App\Http\Controllers\ResetPasswordController::class, 'reset'])->name('password.update');
    Route::post('forgot-password', [ForgotPasswordController::class, 'sendResetLinkEmail'])->name('password.email');
    });
