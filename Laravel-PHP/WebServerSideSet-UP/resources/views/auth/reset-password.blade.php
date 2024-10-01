@extends('layouts.main')
@section('content')
    <h1>Login do User!</h1>
    <form method="POST" action="{{ route('password.email') }}">
        @csrf
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Email address</label>
            <input type="email" name="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                required>
            @error('email')
                email inválido
            @enderror
            <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div>
        </div>
        <button type="submit" class="btn btn-primary">Enviar Email</button>

    </form>
@endsection
