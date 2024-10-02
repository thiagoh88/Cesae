<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Dashboard do Administrador</title>
    <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-image: url('https://static.vecteezy.com/system/resources/previews/005/593/805/original/futuristic-abstract-technology-background-icon-symbol-circuit-and-illustration-sci-fi-futuristic-hud-lock-dashboard-display-virtual-reality-technology-screen-background-vector.jpg'); /* Altere para o caminho da sua imagem */
            background-size: cover; /* Faz com que a imagem cubra todo o fundo */
            background-position: center; /* Centraliza a imagem de fundo */
            font-family: 'Roboto', sans-serif;
        }
        .container {
            display: flex;
            flex-direction: column;
            align-items: center;
            justify-content: center;
            height: auto;
            padding: 20px;
            background-color: rgba(255, 255, 255, 0.8); /* Fundo branco semi-transparente */
            border-radius: 10px; /* Bordas arredondadas */
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2); /* Sombra para profundidade */
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
            margin: 0.5rem 0; /* Espaçamento entre os botões */
        }
        .button:hover {
            background-color: #0056b3;
        }
        .logout-button {
            background-color: #dc3545; /* Cor de fundo para o botão de logout */
        }
        .logout-button:hover {
            background-color: #c82333; /* Cor ao passar o mouse no botão de logout */
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Painel de Controle do Administrador</h1>

    <form action="{{ route('user.create') }}" method="GET">
        <button type="submit" class="button">Criar Novo Usuário</button>
    </form>

    <form action="{{ route('logout') }}" method="POST">
        @csrf
        <button type="submit" class="button logout-button">Logout</button>
    </form>
</div>

</body>
</html>
