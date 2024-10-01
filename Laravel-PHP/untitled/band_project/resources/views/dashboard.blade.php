
@extends('layout.app')

@section('content')
    <div class="container">
        <h1>Olá, {{ Auth::user()->name }}</h1>
    </div>
@endsection
