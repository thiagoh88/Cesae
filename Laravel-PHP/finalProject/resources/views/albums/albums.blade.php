@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Álbuns da Banda: {{ $banda->nome }}</h1>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Image</th>
                    <th>Date</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                @foreach($albums as $album)
                    <tr>
                        <td>{{ $album->nome }}</td>
                        <td><img src="{{ asset('storage/' . $album->imagem) }}" alt="{{ $album->nome }}" width="100" style="border-radius: 5px;"></td>
                        <td>{{ $album->data_lancamento }}</td>
                        <td><form action="{{ route('albums.deleteAlbums', ['bandaId' => $banda->id, 'albumId' => $album->id]) }}" method="POST" style="display:inline;">
                                @csrf
                                @method('DELETE')
                                <button type="submit" class="button-delete">Delete</button></form></td>
                    </tr>
                @endforeach
            </tbody>
        </table>
        <div class="button-group">
           <a href="{{ route('albums.createAlbums', ['bandaId' => $banda->id]) }}"><button type="button" class="button">Add Álbum</button></a>
            <a href="{{ route('bandas.bandas') }}"><button type="button" class="button back-button"c>Back</button></a>
        </div>
    </div>
@endsection
