@extends('layouts.main')
@section('content')
    <h1>User: {{$users->name}}</h1>
    <h5>Email: {{$users->email}}</h5>
    <h5>Endereço: {{$users->address}}</h5>
    <h5>Telefone: {{$users->phone}}</h5>
    <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
