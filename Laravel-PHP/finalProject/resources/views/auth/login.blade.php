@extends('layout')
@section('content')
    <div class="central-container">
        <h1>TP Project</h1>
        <form method="POST" action="{{ route('login') }}">
            @csrf
            <div class="form-group">
                <label for="email">EMAIL</label>
                <input type="email" id="email" name="email" required>
            </div>
            <div class="form-group">
                <label for="password">PASS</label>
                <input type="password" id="password" name="password" required>
            </div>
            <button type="submit" class="button">Login</button>
        </form>
        <p><a href="{{ route('password.request') }}">I don't remember my password!</a></p>
        <div class="button-group">
        @if(Auth::check())
            <h2>Logged in as: {{ Auth::user()->name }}.</h2>
            <form action="{{ route('logout') }}" method="POST">
                @csrf
                <button type="submit" class="button logout-button">Logout</button>
            </form>
        @else
            <p></p>
        </div>
        @endif
@endsection


