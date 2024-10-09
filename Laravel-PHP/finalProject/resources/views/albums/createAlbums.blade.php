@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Add Álbum</h1>
        <form action="{{ route('albums.store', ['bandaId' => $banda->id]) }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="nome">Name</label>
                <input type="text" name="nome" id="nome" required>
            </div>
            <div class="button-group">
                <div class="form-group">
                <label for="imagem">Image</label>
                <input type="file" name="imagem" id="imagem" required>
            </div>
            <button type="submit" class="button">Add</button>
            </div>
        </form>
    </div>
    <div class="button-group">
            <a href="{{ route('albums.albums', ['bandaId' => $banda->id]) }}" class="button back-button">Voltar</a>
    </div>
@endsection
