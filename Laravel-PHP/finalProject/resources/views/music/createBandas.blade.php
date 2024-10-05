@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Add</h1>
        @if($errors->any())

            <div class="error-message">
                @foreach ($errors->all() as $error)
                    <div style="color: red;">{{ $error }}</div>
                @endforeach
            </div>
        @endif
        <form action="{{ route('music.store') }}" method="POST" enctype="multipart/form-data">
            @csrf

            <div class="form-group">
                <label for="nome">Name:</label>
                <input type="text" id="nome" name="nome" required>
            </div>
            <div class="button-group">
            <div class="form-group">
                <label for="foto">Foto da Banda:</label>
                <input type="file" id="foto" name="foto" accept="imagens/*" required>
            </div>
            <button type="submit" class="button">Add</button>
        </form>
        <form action="{{ route('music.bandas') }}" method="GET">
            <button type="submit" class="button back-button">Back</button>
        </form>
    </div>
@endsection
