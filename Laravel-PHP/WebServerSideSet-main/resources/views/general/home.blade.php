@extends('layouts.main')
@section('content')
<h1>{{$welcome}}</h1>
<h4> Olá {{$name}}</h4>
<img width="500px" height="300px" src="{{asset('images\assesement.jpg')}}" alt="">
    <ul>
        <li><a href="{{ route('users.welcome1') }}">Bem Vindo</a></li>
        <li><a href="https://laravel.com/docs/11.x">Laravel Documentation</a></li>
        <li><a href="{{ route('users.add') }}">Adicionar Utilizador</a></li>
        <li><a href="{{ route('users.allUser') }}">Lista de User</a></li>
        <li><a href="{{ route('users.all_tasks') }}">Tasks</a></li>
    </ul>

    <ul>
        <h3>INFO</h3>
        @foreach ($contactInfo as $item)
        <li>{{$item['id']}}: {{$item['name']}}: {{$item['phone']}}</li>
        @endforeach
</ul>

<ul>
    <h3>Cesae INFO</h3>
    @foreach ($infoCesae as $item)
    <li>{{$item}}</li>
    @endforeach
</ul>
   @endsection
