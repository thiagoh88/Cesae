@extends('layouts.main')

@section('content')
    <h4>{{ $welcome }}</h4>
    <h2>Cursos:</h2>
    <ul>
        @foreach ($cesaeInfo as $item)
            <li>{{ $item }}</li>
        @endforeach
    </ul>
    <img width="100px" height="60px" src="{{ asset('images/assesement.jpeg') }}" alt="">
    <ul>
        <li><a href="{{ route('route.welcome') }}">Bem Vindo</a></li>
        <li><a href="{{ route('users.add') }}">Adicionar Utilizador</a></li>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li><a href="{{route('tasks.all')}}">Todas as Tarefas</a></li>
        <li><a href="{{route('tasks.form')}}"> Adicionar Tarefa</a></li>
    </ul>

    <p>O meu nome é {{$contactInfo[0]['name']}} e o meu telefone é {{$contactInfo[0]['phone']}}</p>

    <h5>Informação do Cesae</h5>
    <ul>
        <li>{{$infoCesae['name']}}</li>
        <li>{{$infoCesae['address']}}</li>
        <li>{{$infoCesae['email']}}</li>
    </ul>

    <h5>Users</h5>
    <ul>
        @foreach ($contactInfo as $contact)
        <li>{{$contact['id']}} : {{$contact['name']}} - {{$contact['phone'] }}</li>
        @endforeach
    </ul>
@endsection
