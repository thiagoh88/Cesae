<!DOCTYPE html>
<html lang="{{ str_replace('_', '-', app()->getLocale()) }}">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>{{ config('TP Project', 'TP Project') }}</title>

    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
    <link href="https://fonts.googleapis.com/css2?family=Orbitron:wght@400..900&display=swap" rel="stylesheet">

    @if(session('error'))
        <div class="alert alert-danger" style="color: white; background-color: rgba(220, 53, 69, 0.85); padding: 15px; border-radius: 5px;">
            {{ session('error') }}
        </div>
    @endif

    <style>
        .alert {
            position: fixed;
            top: 20px;
            right: 20px;
            z-index: 9999;
            padding: 15px;
            background-color: rgba(220, 53, 69, 0.9); /* Cor vermelha transparente */
            color: white;
            border-radius: 8px;
            font-weight: bold;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.2);
            transition: opacity 0.5s ease;
        }
        body {
            margin: 0;
            height: 100vh;
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url('https://static.vecteezy.com/system/resources/previews/016/660/363/non_2x/abstract-technology-background-circuit-board-technology-tree-pattern-illustration-sci-fi-pcb-trace-data-transfer-design-concept-cyberpunk-color-scheme-circle-light-in-the-middle-of-darkness-vector.jpg');
            background-size: cover;
            background-position: center;
            font-family: 'Orbitron', sans-serif;
            font-size: 14px ;
        }

        .central-container {
            display: flex;
            flex-direction: column;
            justify-content: center;
            align-items: center;
            padding: 30px;
            background-color: rgba(255, 255, 255, 0);
            border-radius: 12px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.0);
            width: 90%;
            max-width: 600px;
            text-align: center;
            font-family: 'Orbitron', sans-serif;
        }


        .button-group {
            display: flex;
            flex-direction: column;
            gap: 15px;
            width: 100%;
        }
        .button-container {
            display: flow;
            flex-direction: row;
            gap: 3px;

        }
.button-open{
    font-family: 'Orbitron', sans-serif;
    padding: 10px;
    background-color: rgba(4, 106, 230, 0.7);
    color: #050505;
    border: none;
    border-radius: 8px;
    font-size: 0.8rem;
    cursor: pointer;
    transition: all 0.3s ease;
    width: 15%;

}
.button-open:hover{
    background-color: #0725ef;
    transform: scale(1.1);
}
.button-delete{
    font-family: 'Orbitron', sans-serif;
    padding: 15px;
    background-color: rgba(220, 53, 69, 0.7);
    border: none;
    border-radius: 8px;
    font-size: 0.8rem;
    cursor: pointer;
    transition: all 0.3s ease;
    height: 20%;
    width: 75px;

}
.button-delete:hover{
    background-color: red;
    transform: scale(1.1);
}

        .button {
            font-weight: bold;
            font-family: 'Orbitron', sans-serif;
            padding: 10px;
            background-color: rgba(4, 106, 230, 0.7);
            color: #050505;
            border: none;
            border-radius: 8px;
            font-size: 1.1rem;
            cursor: pointer;
            transition: all 0.3s ease;
            width: 40%;
            max-width: 400px;
            margin: 0 auto;
        }
        .button:hover {
            background-color: #0725ef;
            transform: scale(1.1);

        }

        .logout-button {
            background-color: rgba(220, 53, 69, 0.7);
        }

        .logout-button:hover {
            background-color: red;
        }

        .back-button {
            padding: 15px;
            background-color: rgba(220, 53, 69, 0.7);
            border: none;
            border-radius: 8px;
            font-size: 1.1rem;
            cursor: pointer;
            transition: all 0.3s ease;
            width: 40%;
            max-width: 400px;
            margin: 0 auto;
        }

        .back-button:hover {
            background-color: red;
        }

        .container {
            background-color: rgba(255, 255, 255, 0.5);
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 4px 20px rgba(0, 0, 0, 0.2);
            width: 100%;
            max-width: 400px;
            text-align: center;
            margin-top: 2rem;
        }

        h2 {
            margin-bottom: 20px;
            color: #333;
        }

        input[type="text"],
        input[type="email"],
        input[type="password"],
        select {
            font-family: 'Orbitron', sans-serif;
            width: 50%;
            padding: 10px;
            margin: 10px 0;
            border: 1px solid #ccc;
            border-radius: 5px;
            font-size: 1rem;
        }

        input[type="text"]:focus,
        input[type="email"]:focus,
        input[type="password"]:focus,
        select:focus {
            font-family: 'Orbitron', sans-serif;
            border-color: #007bff;
            outline: none;
            box-shadow: 0 0 5px rgba(0, 123, 255, 0.5);
        }
    </style>
    @stack('styles')
</head>
<body>
<div class="central-container">
    @yield('content')
</div>
@stack('scripts')
</body>
</html>
