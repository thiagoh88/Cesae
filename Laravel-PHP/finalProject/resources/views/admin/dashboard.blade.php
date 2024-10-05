@extends('layout')

@section('content')
    <div class="central-container">
        <h1 id="welcome-message"></h1>

        <div class="button-group">
            <form action="{{ route('user.create') }}" method="GET">
                <button type="submit" class="button">Novo Usuário</button>
            </form>

            <form action="{{ route('user.users') }}" method="GET">
                @csrf
                <button type="submit" class="button">Users</button>
            </form>

            <form action="{{ route('music.bandas') }}" method="GET">
                <button type="submit" class="button">Tema Indefinido</button>
            </form>

            <form action="{{ route('music.albums', 1) }}" method="GET">
                <button type="submit" class="button">Qualquer Assunto</button>
            </form>

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
