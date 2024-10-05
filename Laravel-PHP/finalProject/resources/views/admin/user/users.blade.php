@extends('layout')
@section('content')
    <div class="container">
        <h1>Admin / User</h1>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Data de Criação</th>
                <th>0.User / 1.Admin</th>
                <th>Ações</th>
            </tr>
            </thead>
            <tbody>
            @foreach($users as $user)
                <tr>
                    <td>{{ $user->id }}</td>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->email }}</td>
                    <td>{{ $user->created_at }}</td>
                    <td>
                        @if(Auth::check() && Auth::user()->role_id === 0)
                            <form action="{{ route('user.updateRole', $user->id) }}" method="POST" style="display: flex; align-items: center; gap: 10px;">
                                @csrf
                                @method('PUT')
                                <select name="admin" class="admin-select">
                                    <option value="0" {{ $user->admin == 0 ? 'selected' : '' }}>User</option>
                                    <option value="1" {{ $user->admin == 1 ? 'selected' : '' }}>Admin</option>
                                </select>
                                <button type="submit" class="button save-button">Save</button>
                            </form>
                        @else
                            {{ $user->admin == 1 ? 'Admin' : 'User' }}
                        @endif
                    </td>
                </tr>
            @endforeach
            </tbody>
        </table>

        <form action="{{ route('admin.dashboard') }}" method="GET" style="margin-top: 20px;">
            @csrf
            <button type="submit" class="button back-button">Back</button>
        </form>
    </div>
@endsection
