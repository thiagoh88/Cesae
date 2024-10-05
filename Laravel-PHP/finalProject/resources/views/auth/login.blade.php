@extends('layout')

@section('content')
    <div class="container">
        <h1>TP Project</h1>

        @if ($errors->any())
            <div class="error-message">
                <strong>{{ $errors->first() }}</strong>
            </div>
        @endif

        <!-- Formulário de Login -->
        <form method="POST" action="{{ route('login') }}">
            @csrf
            <div class="form-group">
                <label for="email">Email:</label>
                <input type="email" id="email" name="email" required autofocus>
            </div>
            <div class="form-group">
                <label for="password">Senha:</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="button">Entrar</button>
        </form>

        <p>
            <a href="{{ route('password.request') }}">Esqueci minha senha</a>
        </p>
    </div>

    <!-- Barra inferior com status de login -->
    <div class="status-bar">
        @if(Auth::check())
            <p>Você já está logado como: {{ Auth::user()->name }}.</p>
            <form action="{{ route('logout') }}" method="POST">
                @csrf
                <button type="submit" class="button logout-button">Logout</button>
            </form>
        @else
            <p>Você ainda não está logado.</p>
        @endif
    </div>
@endsection

@push('styles')
    <style>
        .container {
            background-color: rgba(255, 255, 255, 0.9);
            padding: 2rem;
            border-radius: 8px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
            text-align: center;
        }

        h1 {
            margin-bottom: 1.5rem;
            color: #333;
        }

        .form-group {
            margin-bottom: 1rem;
        }

        label {
            display: block;
            margin-bottom: 0.5rem;
            color: #555;
        }

        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 0.8rem;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 1rem;
        }

        input[type="email"]:focus,
        input[type="password"]:focus {
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }

        button {
            width: 100%;
            padding: 0.8rem;
            background-color: #007bff;
            color: #fff;
            border: none;
            border-radius: 4px;
            font-size: 1rem;
            cursor: pointer;
            transition: background-color 0.3s ease;
        }

        button:hover {
            background-color: #0056b3;
        }

        .error-message {
            color: red;
            text-align: center;
            margin-top: 1rem;
        }

        p a {
            color: #007bff;
            text-decoration: none;
            transition: color 0.3s;
        }

        p a:hover {
            color: #0056b3;
        }

        /* Barra inferior com status */
        .status-bar {
            margin-top: 2rem;
            padding: 1rem;
            background-color: rgba(255, 255, 255, 0.8);
            text-align: center;
            border-radius: 8px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.1);
            width: 100%;
            max-width: 400px;
        }

        .status-bar p {
            margin: 0 0 1rem 0;
            color: #333;
            font-size: 1rem;
        }

        .logout-button {
            background-color: #dc3545;
        }

        .logout-button:hover {
            background-color: #c82333;
        }
    </style>
@endpush
