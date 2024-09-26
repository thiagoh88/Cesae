@extends('layouts.main')
@section('content')
<h1>{{$welcome}}</h1>
<h4> Olá {{$name}}</h4>
<img width="500px" height="300px" src="{{asset('images\assesement.jpg')}}" alt="">
    <ul>
        <li><a href="{{ route('users.welcome1') }}">Bem Vindo</a></li>
        <li><a href="https://laravel.com/docs/11.x">Laravel Documentation</a></li>
        <div class="h5"></div>
        <li><a href="{{ route('users.allUser') }}">Lista de Users</a></li>
        <li><a href="{{ route('users.add') }}">Adicionar Users</a></li>
<div><h5></h5></div>
        <li><a href="{{ route('users.all_tasks') }}">Lista de Tasks</a></li>
        <li><a href="{{ route('users.add_tasks') }}">Adicionar Tasks</a></li>
        <div class="h5"></div>
        <li><a href="{{ route('users.allPrendas') }}">PRENDAS</a></li>
        <li><a href="{{ route('users.add_prendas') }}">ADICIONAR PRENDAS</a></li>
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
