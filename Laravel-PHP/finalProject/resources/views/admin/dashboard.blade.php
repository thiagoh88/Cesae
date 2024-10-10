@extends('layout')
@section('content')
    <div class="central-container">
        <h1 id="welcome-message"></h1>
        <div class="button-group">
            <a href="{{ route('users.create') }}" method="GET"><button type="submit" class="button">New User</button></a>
            <form action="{{ route('users.users') }}" method="GET">
                @csrf
                <button type="submit" class="button">Users</button>
            </form>
            <a href="{{ route('bandas.bandas') }}" method="GET"><button type="submit" class="button">Bandas</button></a>
            <form action="{{ route('logout') }}" method="POST">
                @csrf
                <button type="submit" class="button logout-button">Logout</button>
            </form>
        </div>
    </div>
@endsection
@push('scripts')
    <script>
        const userName = "{{ auth()->user()->name }}";
        document.getElementById('welcome-message').innerText = `Welcome, ${userName}!`;
    </script>
@endpush
