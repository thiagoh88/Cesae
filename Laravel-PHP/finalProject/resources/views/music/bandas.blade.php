@extends('layout')

@section('content')
    <div class="container">
        <h1>Bandas Cadastradas</h1>

        <form action="{{ url('/bandas') }}" method="GET" class="input-group">
            <input type="text" name="search" placeholder="Buscar banda..." required>
            <input type="submit" value="Buscar">
        </form>

        <table>
            <thead>
            <tr>
                <th>Nome</th>
                <th>Foto</th>
                <th>Número de Álbuns</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            @foreach($bandas as $banda)
                <tr>
                    <td>{{ $banda->nome }}</td>
                    <td><img src="{{ asset('storage/' . $banda->foto) }}" alt="{{ $banda->nome }}" width="100" style="border-radius: 5px;"></td>
                    <td>{{ $banda->numero_albuns }}</td>
                    <td>
                        <div class="button-group">
                            <a href="{{ route('music.albums', $banda) }}" class="button">Ver Álbuns</a>
                            <form action="{{ route('music.deleteBandas', $banda) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="button delete-button">Excluir</button>
                            </form>
                        </div>
                    </td>
                </tr>
            @endforeach
            </tbody>
        </table>

        <div class="button-group">
            <form action="{{ route('music.createBandas') }}" method="GET">
                @csrf
                <button type="submit" class="button">Adicionar Banda</button>
            </form>
            <form action="{{ route('admin.dashboard') }}" method="GET">
                @csrf
                <button type="submit" class="button">Voltar</button>
            </form>
        </div>
    </div>
@endsection

@push('styles')
    <style>
        body {
            background-image: url('https://www.creativefabrica.com/wp-content/uploads/2023/04/20/Abstract-Digital-Background-Graphics-67690116-1.jpg');
            background-size: cover;
            background-position: center;
            font-family: 'Roboto', sans-serif;
            display: flex;
            align-items: center;
            justify-content: center;
            height: auto;
            background-color: #f0f0f0;
            margin: 0;
        }
        table {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
            background: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 10px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
        h1 {
            color: rgb(0, 0, 0);
        }
        .button {
            padding: 15px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 8px;
            font-size: 1.1rem;
            cursor: pointer;
            transition: all 0.3s ease;
            width: 100%;
            max-width: 400px;
            margin: 0 auto;
        }
        .button:hover {
            background-color: #0056b3;
            transform: scale(1.05);
        }
        .delete-button {
            background-color: #dc3545;
        }
        .delete-button:hover {
            background-color: #c82333;
        }
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: auto;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
        }
        .button-group {
            display: flex;
            flex-direction: column;
            gap: 15px; /* Espaçamento entre os botões */
            width: 100%;
        }
    </style>
@endpush
