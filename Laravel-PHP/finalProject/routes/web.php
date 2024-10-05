<?php
use Laravel\Fortify\Features;
use App\Http\Controllers\ForgotPasswordController;
use Illuminate\Support\Facades\Route;
use App\Http\Controllers\AdminDashboardController;
use App\Http\Controllers\UserController;
use App\Http\Controllers\BandaController;
use App\Http\Controllers\AlbumController;

Route::get('/', function () {
    return view('auth.login');
});


Route::get('/admin/dashboard', [AdminDashboardController::class, 'index'])->name('admin.dashboard')->middleware('auth');
Route::get('/admin/user/create', [UserController::class, 'create'])->name('user.create')->middleware('auth');
Route::get('/admin/user/users', [UserController::class, 'showUsers'])->name('user.users')->middleware('auth');
Route::post('/admin/user/store', [UserController::class, 'store'])->name('user.store')->middleware('auth');

Route::get('/music/bandas', [BandaController::class, 'index'])->name('music.bandas')->middleware('auth');
Route::get('/music/createBandas', [BandaController::class, 'create'])->name('music.createBandas')->middleware('auth');
Route::post('/music/store', [BandaController::class, 'store'])->name('music.store')->middleware('auth');
Route::delete('/music/{banda}', [BandaController::class, 'destroy'])->name('music.deleteBandas');
Route::get('/music/{bandas}/albuns', [AlbumController::class, 'index'])->name('music.albums');

Route::put('/user/{id}/updateRole', [UserController::class, 'updateRole'])->middleware('auth')->name('user.updateRole');
Route::middleware(['guest'])->group(function () {




//-------------------------------------------------------------------------------------------------------------------------------------------//

    Route::get('forgot-password', function () {
        return view('auth.forgot-password');
    })->middleware(['guest'])->name('password.request');

    Route::get('reset-password/{token}', function ($token) {
        return view('auth.reset-password', ['token' => $token]);
    })->middleware(['guest'])->name('password.reset');
    Route::post('reset-password', [\App\Http\Controllers\ResetPasswordController::class, 'reset'])->name('password.update');
    Route::post('forgot-password', [ForgotPasswordController::class, 'sendResetLinkEmail'])->name('password.email');

});
