@extends('layout')

@section('content')
    <div class="central-container">
        <h1>Not Defined</h1>

        <form action="{{ url('/bandas') }}" method="GET" class="input-group">
            <input type="text" name="search" placeholder="Search" required>
            <input type="submit" class="button-open" value="Go!">
        </form>

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

                            <a href="{{ route('music.albums', $banda) }}" class="button-open">Open</a>
                            <form action="{{ route('music.deleteBandas', $banda) }}" method="POST" style="display:inline;">
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
            <form action="{{ route('music.createBandas') }}" method="GET">
                @csrf
                <button type="submit" class="button">Add</button>
            </form>
            <form action="{{ route('admin.dashboard') }}" method="GET">
                @csrf
                <button type="submit" class="button back-button">Back</button>
            </form>
        </div>
    </div>
@endsection

