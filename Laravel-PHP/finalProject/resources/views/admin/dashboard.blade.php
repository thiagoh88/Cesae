@extends('layout')
<div class="container">
    <h1 id="welcome-message"></h1>
    <form action="{{ route('user.create') }}" method="GET">
        <button type="submit" class="button">Novo Usuário</button>
    </form>
    <form action="{{ route('user.users') }}" method="GET">
        @csrf
        <button type="submit" class="button">Users</button>
    </form>
    <form action="{{ route('logout') }}" method="POST">
        @csrf
        <button type="submit" class="button logout-button">Logout</button>
    </form>
</div>
<script>
    const userName = "{{ auth()->user()->name }}";
    document.getElementById('welcome-message').innerText = `Welcome, ${userName}!`;
</script>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-image: url('https://www.creativefabrica.com/wp-content/uploads/2023/04/20/Abstract-Digital-Background-Graphics-67690116-1.jpg');
            background-size: cover;
            background-position: center;
            font-family: 'Roboto', sans-serif;
        }
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: auto;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.8);
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
        }
        h1 {
            color: #333;
            margin-bottom: 2rem;
        }
        .button {
            padding: 1rem 2rem;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            font-size: 1.2rem;
            cursor: pointer;
            transition: background-color 0.3s;
            margin: 0.5rem 0;
        }
        .button:hover {
            background-color: #0056b3;
        }
        .logout-button {
            background-color: #dc3545;
        }
        .logout-button:hover {
            background-color: #c82333;
        }
    </style>
</html>
