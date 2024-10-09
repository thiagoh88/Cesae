@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Bandas</h1>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Image</th>
                    <th>Number</th>
                    <th>Action</th>
                </tr>
            </thead>
            <tbody>
                @foreach($bandas as $banda)
                    <tr>
                        <td><h4>{{ $banda->nome }}</h4></td>
                        <td><img src="{{ asset('storage/' . $banda->foto) }}" alt="{{ $banda->nome }}" width="100" style="border-radius: 5px;"></td>
                        <td>{{ $banda->numero_albuns }}</td>
                        <td>
                            <a href="{{ route('albums.view', $banda) }}" class="button">View Albums</a>
                            <form action="{{ route('bandas.deleteBandas', $banda) }}" method="POST" style="display:inline;">
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
            <a href="{{ route('bandas.createBandas') }}">
                <button type="button" class="button">Add</button>
            </a>
            <a href="{{ route('admin.dashboard') }}">
                <button type="button" class="button back-button">Back</button>
            </a>
        </div>
    </div>
@endsection
