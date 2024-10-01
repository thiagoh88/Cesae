<?php


use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\BandaController;
use App\Http\Controllers\AlbumController;

// Rota para a URL raiz, redireciona para o dashboard
Route::get('/', function () {
    return redirect()->route('dashboard'); // Redireciona para a rota do dashboard
});

// Rota para o Dashboard (acessível apenas por usuários autenticados)
Route::get('/dashboard', [UserController::class, 'dashboard'])->middleware('auth')->name('dashboard');

// Rotas para Bandas
Route::prefix('bands')->name('bands.')->group(function () {
    Route::get('/', [BandaController::class, 'index'])->name('index'); // Lista todas as bandas
    Route::get('/create', [BandaController::class, 'create'])->name('create'); // Formulário para criar uma nova banda
    Route::post('/', [BandaController::class, 'store'])->name('store'); // Armazena uma nova banda
    Route::get('/{id}', [BandaController::class, 'show'])->name('show'); // Detalhes de uma banda
    Route::get('/{id}/edit', [BandaController::class, 'edit'])->name('edit'); // Formulário para editar uma banda
    Route::put('/{id}', [BandaController::class, 'update'])->name('update'); // Atualiza uma banda
    Route::delete('/{id}', [BandaController::class, 'destroy'])->name('destroy'); // Exclui uma banda
});

// Rotas para Álbuns
Route::prefix('albums')->name('albums.')->group(function () {
    Route::get('/', [AlbumController::class, 'index'])->name('index'); // Lista todos os álbuns
    Route::get('/create', [AlbumController::class, 'create'])->name('create'); // Formulário para criar um novo álbum
    Route::post('/', [AlbumController::class, 'store'])->name('store'); // Armazena um novo álbum
    Route::get('/{id}', [AlbumController::class, 'show'])->name('show'); // Detalhes de um álbum
    Route::get('/{id}/edit', [AlbumController::class, 'edit'])->name('edit'); // Formulário para editar um álbum
    Route::put('/{id}', [AlbumController::class, 'update'])->name('update'); // Atualiza um álbum
    Route::delete('/{id}', [AlbumController::class, 'destroy'])->name('destroy'); // Exclui um álbum
});

// Rota para login (certifique-se de ter o Auth configurado)
Auth::routes();

Auth::routes();

Route::get('/home', [App\Http\Controllers\HomeController::class, 'index'])->name('home');
