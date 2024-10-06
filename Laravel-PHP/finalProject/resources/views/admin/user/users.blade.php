@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Admin / User</h1>
        <table>
            <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Date</th>
                <th>Type</th>
            </tr>
            </thead>
            <tbody>
            @foreach($users as $user)
                <tr>
                    <td><h4>{{ $user->id }}</h4></td>
                    <td><h4>{{ $user->name }}</h4></td>
                    <td><h4>{{ $user->email }}</h4></td>
                    <td><h4>{{ $user->created_at }}</h4></td>
                    <td><h4>
                        @if(Auth::check() && Auth::user()->role_id === 0)
                            <form action="{{ route('user.updateRole', $user->id) }}" method="POST" style="display: flex; align-items: center; gap: 10px;">
                                @csrf
                                @method('PUT')
                                <select name="admin" class="admin-select">
                                    <option value="0" {{ $user->admin == 0 ? 'selected' : '' }}>User</option>
                                    <option value="1" {{ $user->admin == 1 ? 'selected' : '' }}>Admin</option>
                                </select>
                            </form>
                        @else
                            {{ $user->admin == 1 ? 'Admin' : 'User' }}
                        @endif
                        </h4></td>
                    <td><h4>
                        <form action="{{ route('user.deleteUsers', $user->id) }}" method="POST">
                            @csrf
                            @method('DELETE')
                            <button type="submit" class="button-delete">Delete</button>
                        </form>
                        </h4></td>
                </tr>
            @endforeach
            </tbody>
        </table>
        <div class="button-group">
        <form action="{{ route('admin.dashboard') }}" method="GET" style="margin-top: 20px;">
            @csrf
            <button type="submit" class="button back-button">Back</button>
        </form>
        </div>
    </div>
@endsection
