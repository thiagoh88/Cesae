@extends('layouts.main')
@section('content')

    <h5>ID: {{$tasks->id}}</h5>
    <h5>Name: {{$tasks->name}}</h5>
    <h5>Description: {{$tasks->description}}</h5>
    <h5>Name: {{$tasks->users_name}}</h5>
    <li><a href="{{ route('home') }}">Voltar</a></li>
@endsection
