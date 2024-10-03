<!DOCTYPE html>
<html lang="pt-pt">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Usuários Cadastrados</title>
    <style>
        body {
            background-image: url('https://www.creativefabrica.com/wp-content/uploads/2023/04/20/Abstract-Digital-Background-Graphics-67690116-1.jpg');
            background-size: cover;
            background-position: center;
            font-family: 'Roboto', sans-serif;
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: auto; /* Ajustado para auto */
            background-color: #f0f0f0;
        }
        table {
            width: 80%;
            margin-top: 20px;
            border-collapse: collapse;
            background: white;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 10px;
            text-align: center;
            border: 1px solid #ddd;
        }
        th {
            background-color: #f4f4f4;
        }
        h1 {
            color: rgb(0, 0, 0);
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
    </style>
</head>
<body>
<div class="container">
    <h1>Usuários Cadastrados</h1>

    <form action="{{ url('/users') }}" method="GET">
        <input type="text" name="search" placeholder="Buscar usuário..." required>
        <input type="submit" value="Buscar">
    </form>

    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Nome</th>
                <th>Email</th>
                <th>Data de Criação</th>
                <th>0.User / 1.Admin</th>
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
                            <form action="{{ route('user.updateRole', $user->id) }}" method="POST">
                                @csrf
                                @method('PUT')
                                <select name="admin">
                                    <option value="0" {{ $user->admin == 0 ? 'selected' : '' }}>User</option>
                                    <option value="1" {{ $user->admin == 1 ? 'selected' : '' }}>Admin</option>
                                </select>
                                <input type="submit" value="Salvar">
                            </form>
                        @else
                            {{ $user->admin == 1 ? 'Admin' : 'User' }}
                        @endif
                    </td>
                </tr>
            @endforeach
        </tbody>
    </table>
    <form action="{{ route('admin.dashboard') }}" method="GET">
        @csrf
        <button type="submit" class="button">Voltar</button>
    </form>
</div>
</body>
</html>
