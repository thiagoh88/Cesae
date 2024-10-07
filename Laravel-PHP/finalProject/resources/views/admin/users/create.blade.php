@extends('layout')
@section('content')
    <div class="central-container">
        <h1>Admin/User</h1>
        <form action="{{ route('user.store') }}" method="POST">
            @csrf
            <input type="text" name="name" placeholder="NAME" value="{{ old('name') }}" required>
            <input type="email" name="email" placeholder="EMAIL" value="{{ old('email') }}" required>
            <input type="password" name="password" placeholder="PASSWORD" required>
            <input type="password" name="password_confirmation" placeholder="CONFIRM PASSWORD" required>
            <select name="admin" id="role" required>
                <option value="0">User</option>
                <option value="1">Admin</option>
            </select>
            <div class="button-group">
                <button type="submit" class="button">Add User</button>
            </div>
        </form>
        <div class="button-group">
        <a href="{{ route('admin.dashboard') }}" method="GET" style="margin-top: 10px;">
            <button type="submit" class="button back-button">Back</button>
        </a>
    </div>
    </div>
@endsection
