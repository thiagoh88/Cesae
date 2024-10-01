<?php
@extends('layouts.app')

@section('content')
    <div class="container">
        <h1>Adicionar Novo Álbum para {{ $banda->nome }}</h1>
        <form action="{{ route('albums.store', $banda->id) }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="nome">Nome do Álbum</label>
                <input type="text" class="form-control" id="nome" name="nome" required>
            </div>
            <div class="form-group">
                <label for="imagem">Imagem do Álbum</label>
                <input type="file" class="form-control" id="imagem" name="imagem">
            </div>
            <div class="form-group">
                <label for="data_lancamento">Data de Lançamento</label>
                <input type="date" class="form-control" id="data_lancamento" name="data_lancamento" required>
            </div>
            <button type="submit" class="btn btn-success">Salvar</button>
        </form>
    </div>
@endsection
