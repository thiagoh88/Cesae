@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Add Album to {{ $banda->nome }}</h1>
        @if($errors->any())
            <div class="error-message">
                @foreach ($errors->all() as $error)
                    <div style="color: red;">{{ $error }}</div>
                @endforeach
            </div>
        @endif
        <form action="{{ route('music.storeAlbum', $banda->id) }}" method="POST" enctype="multipart/form-data">
            @csrf
            <div class="form-group">
                <label for="nome">Album Name:</label>
                <input type="text" id="nome" name="nome" required>
            </div>
            <div class="form-group">
                <label for="imagem">Album Image:</label>
                <input type="file" id="imagem" name="imagem" accept="image/*" required>
            </div>
            <div class="form-group">
                <label for="data_lancamento">Release Date:</label>
                <input type="date" id="data_lancamento" name="data_lancamento" required>
            </div>
            <div class="button-group">
            <button type="submit" class="button">Add Album</button>
        </form>
        <form action="{{ route('music.albums', $banda) }}" method="GET">
            @csrf
            <button type="submit" class="button back-button">Back</button>
        </form>
    </div>
    </div>
@endsection
