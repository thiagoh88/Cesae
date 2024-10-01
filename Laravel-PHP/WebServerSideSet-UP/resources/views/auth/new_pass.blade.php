@extends('layouts.main')
@section('content')
    <!-- já estou a carregar o obj $user -->

    <form method="POST" action="{{ route('password.update') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" value="{{ request()->email }}" name="email" class="form-control"
                id="exampleInputEmail1" aria-describedby="emailHelp">
            @error('email')
                email inválido
            @enderror
        </div>

        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password</label>
            <input type="password" name="password" class="form-control" id="exampleInputPassword1" required>
            @error('password')
                {{ $message }}
            @enderror
        </div>
        <div class="mb-3">
            <label for="exampleInputPassword1" class="form-label">Password Confirmation</label>
            <input type="password" name="password_confirmation" class="form-control" id="exampleInputPassword1" required>
            @error('password_confirmation')
                password inválida. deve ter no mínimo 6caracteres
            @enderror
        </div>
        <input type="hidden" name="token" value="{{ request()->route('token') }}" id="">

        <button type="submit" class="btn btn-primary">Actualizar Pass</button>
    </form>
@endsection
