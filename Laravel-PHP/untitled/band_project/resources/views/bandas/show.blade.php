<?php
@extends('layouts.app')

@section('content')
    <div class="container">
        <h1>Álbuns de {{ $banda->nome }}</h1>
        <a href="{{ route('albums.create', $banda->id) }}" class="btn btn-primary">Adicionar Novo Álbum</a>
        <table class="table">
            <thead>
            <tr>
                <th>Nome</th>
                <th>Imagem</th>
                <th>Data de Lançamento</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            @foreach($albums as $album)
                <tr>
                    <td>{{ $album->nome }}</td>
                    <td>
                        @if($album->imagem)
                            <img src="{{ asset('storage/' . $album->imagem) }}" alt="Capa do álbum" width="100">
                        @else
                            <p>Sem imagem</p>
                        @endif
                    </td>
                    <td>{{ $album->data_lancamento }}</td>
                    <td>
                        @can('isAdmin')
                            <a href="{{ route('albums.edit', $album->id) }}" class="btn btn-warning">Editar</a>
                            <form action="{{ route('albums.destroy', $album->id) }}" method="POST" style="display:inline-block;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="btn btn-danger">Excluir</button>
                            </form>
                        @endcan
                    </td>
                </tr>
            @endforeach
            </tbody>
        </table>
    </div>
@endsection
