@extends('layouts.main')
@section('content')
    <h1>Olá, aqui vais poder adicionar users!</h1>
    <form method="POST" action="{{route('users.create')}}">

        @csrf
        <div class="mb-3">
            <label for="exampleInputname1" class="form-label">Name</label>
            <input type="text" name="name" class="form-control" id="exampleInputname1" aria-describedby="namehelp" required>
            @error('name')
            name invalido
            @enderror
        </div>
        <div class="mb-3">
        <label for="exampleInputemail1" class="form-label">Email</label>
        <input type="email" name="email" class="form-control" id="exampleInputemail1" aria-describedby="emailhelp" required>
        @error('email')
            email invalido
            @enderror
    </div>
    <div class="mb-3">
        <label for="exampleInputpassword1" class="form-label">Password</label>
        <input type="password" name="password" class="form-control" id="exampleInputpassword1" aria-describedby="passwordhelp" required>
        <button type="submit">Submeter</button>
        @error('password')
            password invalido
            @enderror
    </div>
    </form>
    <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
