@extends('layouts.main')
@section('content')
    <!-- já estou a carregar o obj $user -->

    <form method="POST" action="{{ route('user.create') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $user->id }}" id="">

        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Name</label>
            <input type="text" value="{{ $user->name }}" name="name" class="form-control" required>
            @error('name')
                name inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input disabled type="email" value="{{ $user->email }}" name="email" class="form-control"
                id="exampleInputEmail1" aria-describedby="emailHelp">
            @error('email')
                email inválido
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Morada</label>
            <input type="text" value="{{ $user->address }}" name="address" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('address')
                Morada inválida
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Telefone</label>
            <input type="text" value="{{ $user->phone }}" name="phone" class="form-control" id="exampleInputEmail1"
                aria-describedby="emailHelp">
            @error('phone')
                Telefone inválida
            @enderror
        </div>

        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
@endsection
