@extends('layout')

@section('content')
    <div class="central-container">
        <h1>Álbuns da Banda: {{ $banda->nome }}</h1>

        @if($errors->any())
            <div class="error-message">
                @foreach ($errors->all() as $error)
                    <div style="color: red;">{{ $error }}</div>
                @endforeach
            </div>
        @endif

        <table>
            <thead>
                <tr>
                    <th>Nome</th>
                    <th>Imagem</th>
                    <th>Ações</th>
                </tr>
            </thead>
            <tbody>
                @foreach($albums as $album)
                    <tr>
                        <td>{{ $album->nome }}</td>
                        <td>
                            <img src="{{ asset('storage/' . $album->imagem) }}" alt="{{ $album->nome }}" width="100" style="border-radius: 5px;">
                        </td>
                        <td>
                            <a href="{{ route('albums.edit', ['bandaId' => $banda->id, 'albumId' => $album->id]) }}" class="button">Editar</a>
                            <form action="{{ route('albums.delete', ['bandaId' => $banda->id, 'albumId' => $album->id]) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="button-delete">Deletar</button>
                            </form>
                        </td>
                    </tr>
                @endforeach
            </tbody>
        </table>

        <div class="button-group">
            <a href="{{ route('albums.create', ['bandaId' => $banda->id]) }}" class="button">Adicionar Álbum</a>
            <a href="{{ route('bandas.bandas') }}" class="button back-button">Voltar</a>
        </div>
    </div>
@endsection
