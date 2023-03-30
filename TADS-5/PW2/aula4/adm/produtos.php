<?php

?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../css/bootstrap.css">
    <link rel="stylesheet" href="../css/app_dark.css" id="appcss">
    <title>MarketPlace</title>
</head>
<body>

    <form method="post" action="cadprodutos.php" class="container py-5">
        <p><input type="text" name="txtNomeProduto" placeholder="Digite o nome do produto"></p>

        <p><label for="">Descrição</label></p>
        <p><textarea name="txtDescricaoProduto" rows="8" cols="50"></textarea></p>

        <p><input type="text" name="txtPrecoProduto" placeholder="Digite o preço"></p>

        <p><input type="submit" value="Enviar"></input></p>
    </form>

    <script src="../js/bootstrap.js"></script>
    <script src="../js/app.js"></script>
</body>
</html>