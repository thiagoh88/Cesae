@extends('layout')

@section('content')
<div class="central-container">
    <h1>It's not my problem</h1>
    @if (session('status'))
        <div class="status-message">
            <strong>{{ session('status') }}</strong>
        </div>
    @endif
    @if ($errors->any())
        <div class="error-message">
            <strong>{{ $errors->first() }}</strong>
        </div>
    @endif
    <form method="POST" action="{{ route('password.email') }}">
        @csrf
        <div class="form-group">
            <label for="email">EMAIL</label>
            <input type="email" id="email" name="email" required autofocus>
        </div>
        <div class="button-group">
        <button type="submit" class="button">Reset link</button>
    </form>
    <form action="{{ route('login') }}" method="GET" style="margin-top: 20px;">
        @csrf
        <button type="submit" class="button back-button">Back</button>
    </form>
</div>
</div>
@endsection
