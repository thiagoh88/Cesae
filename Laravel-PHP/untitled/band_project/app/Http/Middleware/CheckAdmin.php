<?php

namespace App\Http\Middleware;

use Closure;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\Auth;

class CheckAdmin
{
    /**
     * Handle an incoming request.
     *
     * @param  \Illuminate\Http\Request  $request
     * @param  \Closure  $next
     * @return mixed
     */
    public function handle(Request $request, Closure $next)
    {
        // Verifica se o usuário está autenticado e se é admin
        if (Auth::check() && Auth::user()->perfil === 'admin') {
            return $next($request); // Se for admin, continua para a próxima requisição
        }

        return redirect('/'); // Se não for admin, redireciona para a página inicial
    }
}
