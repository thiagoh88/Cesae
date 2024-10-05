@extends('layout')

@section('content')
    <div class="central-container">
        <h1>Inside of - {{ $banda->nome }}</h1>

        <table class="table">
            <thead>
            <tr>
                <th>Name</th>
                <th>Image</th>
                <th>Date</th>
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            @foreach($albuns as $album)
                <tr>
                    <td>{{ $album->nome }}</td>
                    <td><img src="{{ asset('storage/' . $album->imagem) }}" alt="{{ $album->nome }}" width="100" style="border-radius: 5px;"></td>
                    <td>{{ $album->data_lancamento }}</td>
                    <td>
                        <form action="{{ route('music.deleteAlbum', $album) }}" method="POST" style="display:inline;">
                            @csrf
                            @method('DELETE')
                            <button type="submit" class="button-delete">Delete</button>
                        </form>
                    </td>
                </tr>
            @endforeach
            </tbody>
        </table>

        <div class="button-group">
            <form action="{{ route('music.createAlbums', $banda) }}" method="GET">
                @csrf
                <button type="submit" class="button">Add Album</button>
            </form>
        </div>
    </div>
@endsection
