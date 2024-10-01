@extends('layouts.main')
@section('content')
    {{-- <h5>O gestor pedagógico da turma é o {{ $myUser->name }} e o email dele é {{ $myUser->email }}</h5> --}}


    @if(session('message'))
    <div class="alert alert-success">
        {{session('message')}}
    </div>
    @endif

    <h1>Olá, aqui vais ver uma lista de users! </h1>

    <form action="">
        <input type="text" placeholder="Search" name="search">
        <button type="submit" class="btn btn-info">Procurar</button>
    </form>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Name</th>
                <th scope="col">Email</th>
                <th scope="col">Password</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($users as $user)
                <tr>
                    <th scope="row">{{ $user->id }}</th>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->email }}</td>
                    <td>{{ $user->password }}</td>
                    <td><a  href="{{route('users.view', $user->id)}}" class="btn btn-info">Ver/editar</a></td>
                    <td><a  href="{{route('users.delete', $user->id)}}" class="btn btn-danger">Delete</a></td>
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection
