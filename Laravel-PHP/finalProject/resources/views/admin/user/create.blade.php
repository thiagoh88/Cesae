<!-- resources/views/admin/user/create.blade.php -->
<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Criar Novo Usuário</title>
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.0.0-beta3/css/all.min.css">
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            font-family: 'Roboto', sans-serif;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-image: url('https://static.vecteezy.com/system/resources/previews/005/593/805/original/futuristic-abstract-technology-background-icon-symbol-circuit-and-illustration-sci-fi-futuristic-hud-lock-dashboard-display-virtual-reality-technology-screen-background-vector.jpg'); /* Substitua pela URL da sua imagem de fundo */
            background-size: cover;
            background-position: center;
        }
        .container {
            background-color: rgba(255, 255, 255, 0.8);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
            width: 400px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
        }
        input[type="text"],
        input[type="email"],
        input[type="password"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
        }
        button {
            background-color: #4CAF50; /* Verde */
            color: white;
            padding: 10px;
            border: none;
            border-radius: 5px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 10px; /* Adicionando margem superior para separar do formulário */
        }
        button:hover {
            background-color: #45a049;
        }
        .back-button {
            background-color: #007bff; /* Azul */
            margin-top: 20px; /* Espaçamento para o botão de voltar */
        }
        .back-button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>

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
        <button type="submit">Criar Usuário</button>
    </form>

    <!-- Botão de Voltar -->
    <form action="{{ route('admin.dashboard') }}" method="GET">
        <button type="submit" class="back-button">Voltar</button>
    </form>
</div>

</body>
</html>
