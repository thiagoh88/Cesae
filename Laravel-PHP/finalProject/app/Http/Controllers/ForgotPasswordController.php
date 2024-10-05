<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Password;

class ForgotPasswordController extends Controller
{
    /**
     * Envia o link de redefinição de senha para o e-mail fornecido.
     */
    public function sendResetLinkEmail(Request $request)
    {
        // Valida o e-mail
        $request->validate(['email' => 'required|email']);

        // Tenta enviar o link de redefinição de senha
        $status = Password::sendResetLink(
            $request->only('email')
        );

        // Retorna a resposta dependendo do resultado do envio
        return $status === Password::RESET_LINK_SENT
            ? back()->with(['status' => __($status)])
            : back()->withErrors(['email' => __($status)]);
    }
}
