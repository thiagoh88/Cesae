<?php
@extends('layouts.app') <!-- Extende o layout principal -->

@section('content')
    <div class="container">
        <h1>Bandas</h1>
        <a href="{{ route('bandas.create') }}" class="btn btn-primary">Adicionar Nova Banda</a>
        <table class="table">
            <thead>
            <tr>
                <th>Nome</th>
                <th>Foto</th>
                <th>Álbuns</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            @foreach($bandas as $banda)
                <tr>
                    <td>{{ $banda->nome }}</td>
                    <td>
                        @if($banda->foto)
                            <img src="{{ asset('storage/' . $banda->foto) }}" alt="Foto da banda" width="100">
                        @else
                            <p>Sem foto</p>
                        @endif
                    </td>
                    <td>{{ $banda->numero_albuns }}</td>
                    <td>
                        <a href="{{ route('bandas.show', $banda->id) }}" class="btn btn-info">Ver Álbuns</a>
                        @can('isAdmin')
                            <a href="{{ route('bandas.edit', $banda->id) }}" class="btn btn-warning">Editar</a>
                            <form action="{{ route('bandas.destroy', $banda->id) }}" method="POST" style="display:inline-block;">
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
