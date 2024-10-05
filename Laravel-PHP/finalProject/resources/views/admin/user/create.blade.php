@extends('layout')
@section('content')
    <div class="container">
        <h2>Criar Novo Usuário</h2>
        @if($errors->any())
            <div>
                @foreach ($errors->all() as $error)
                    <div style="color: red;">{{ $error }}</div>
                @endforeach
            </div>
        @endif
        <form action="{{ route('user.store') }}" method="POST">
            @csrf
            <input type="text" name="name" placeholder="Nome" required>
            <input type="email" name="email" placeholder="E-mail" required>
            <input type="password" name="password" placeholder="Senha" required>
            <input type="password" name="password_confirmation" placeholder="Confirme a Senha" required>
            <label for="role">Tipo de User:</label>
            <select name="admin" id="role" required>
                <option value="0">User</option>
                <option value="1">Admin</option>
            </select>
            <div class="button-group">
            <button type="submit" class="button">Criar Usuário</button>
        </form>
        <form action="{{ route('admin.dashboard') }}" method="GET">
            <button type="submit" class="button back-button">Voltar</button>
        </form>
    </div>
    </div>
@endsection
