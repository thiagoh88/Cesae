@extends('layout')

@section('content')
    <div class="container">
        <h1>Álbuns de {{ $banda->nome }}</h1>
        <table class="table">
            <thead>
            <tr>
                <th>Nome</th>
                <th>Imagem</th>
                <th>Data de Lançamento</th>
            </tr>
            </thead>
            <tbody>
            @foreach($albuns as $album)
                <tr>
                    <td>{{ $album->nome }}</td>
                    <td><img src="{{ $album->imagem }}" alt="{{ $album->nome }}" width="100"></td>
                    <td>{{ $album->data_lancamento }}</td>
                </tr>
            @endforeach
            </tbody>
        </table>
    </div>
@endsection
