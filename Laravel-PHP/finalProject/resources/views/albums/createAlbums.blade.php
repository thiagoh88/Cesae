@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Criar Novo Álbum</h1>

        <form action="{{ route('albums.store', ['bandaId' => $banda->id]) }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="nome">Nome do Álbum:</label>
                <input type="text" name="nome" id="nome" required>
            </div>
            <div class="form-group">
                <label for="imagem">Imagem do Álbum:</label>
                <input type="file" name="imagem" id="imagem" accept="image/*" required>
            </div>
            <a href="" type="submit" class="button">Add Album</a>
            <a href="{{ route('albums.albums', ['bandaId' => $banda->id]) }}" class="button back-button">Voltar</a>
        </form>
    </div>
@endsection
