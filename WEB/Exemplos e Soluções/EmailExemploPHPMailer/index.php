<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <form action="sendEmail.php" method="get">
        <div>
            <label for="form-email">Email (remetente)</label>
            <input type="email" name="form-email" id="form-email">
        </div>
        <div>
            <label for="form-mensagem">Mensagem</label>
            <input type="text" name="form-mensagem" id="form-mensagem">
        </div>
        <div>
            <button type="submit">Enviar</button>
        </div>

    </form>
</body>

</html>