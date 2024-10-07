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
                <th>Action</th>
            </tr>
            </thead>
            <tbody>
            @foreach($users as $user)
                <tr>
                    <td><h4>{{ $user->id }}</h4></td>
                    <td><h4>{{ $user->nome }}</h4></td>
                    <td><h4>{{ $user->email }}</h4></td>
                    <td>
                        <form action="{{ route('users.deleteUsers', $user->id) }}" method="POST">
                            @csrf
                            @method('DELETE')
                            <button type="submit" class="button-delete">Delete</button>
                        </form>
                    </td>
                </tr>
            @endforeach
            </tbody>
        </table>
        <div class="button-group">
            <a href="{{ route('admin.dashboard') }}" method="GET" style="margin-top: 20px;">
                @csrf
                <button type="submit" class="button back-button">Back</button>
            </a>
        </div>
    </div>
@endsection
