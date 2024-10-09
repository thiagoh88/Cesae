@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Criar Novo Álbum</h1>

        <form action="{{ route('albums.store') }}" method="POST" enctype="multipart/form-data">
            @csrf

            <div class="form-group">
                <label for="nome">Nome do Álbum:</label>
                <input type="text" name="nome" id="nome" required>
            </div>

            <div class="form-group">
                <label for="imagem">Imagem do Álbum:</label>
                <input type="file" name="imagem" id="imagem" accept="image/*" required>
            </div>

            <div class="form-group">
                <label for="banda_id">Banda:</label>
                <select name="banda_id" id="banda_id" required>
                    @foreach($Albums as $album)
                        <option value="{{ $Album->id }}">{{ $Album->nome }}</option>
                    @endforeach
                </select>
            </div>
            <a href="{{ route('albums.create', ['bandaId' => $banda->id]) }}" class="button">Add Album</a>
            <a href="{{ route('albums.albums') }}" class="button back-button">Voltar</a>
        </form>
    </div>
@endsection
