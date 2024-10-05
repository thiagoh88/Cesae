@extends('layout')

@section('content')
    <div class="container">
        <h1>Criar Nova Banda</h1>

        @if($errors->any())
            <div class="error-message">
                @foreach ($errors->all() as $error)
                    <div style="color: red;">{{ $error }}</div>
                @endforeach
            </div>
        @endif

        <form action="{{ route('music.store') }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="nome">Nome da Banda:</label>
                <input type="text" id="nome" name="nome" required>
            </div>
            <div class="form-group">
                <label for="foto">Foto da Banda:</label>
                <input type="file" id="foto" name="foto" accept="image/*" required>
            </div>
            <button type="submit" class="button">Criar Banda</button>
        </form>

        <form action="{{ route('music.bandas') }}" method="GET">
            <button type="submit" class="button back-button">Voltar</button>
        </form>
    </div>

    <style>
        .form-group {
            margin-bottom: 1rem;
        }
        input[type="text"], input[type="file"] {
            width: 100%;
            padding: 0.8rem;
            border: 1px solid #ddd;
            border-radius: 4px;
            font-size: 1rem;
        }
        .button {
            padding: 1rem 2rem;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 1rem;
            cursor: pointer;
            transition: background-color 0.3s;
        }
        .button:hover {
            background-color: #0056b3;
        }
        .back-button {
            background-color: #dc3545;
            margin-top: 1rem;
        }
        .back-button:hover {
            background-color: #c82333;
        }
    </style>
@endsection
