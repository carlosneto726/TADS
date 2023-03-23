<?php
    include_once("controller/ver_url.php");
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css">
    <script src="js/bootstrap.js"></script>
    <title>MarketPlace</title>
</head>
<body>
    <header>

    </header>

    <nav class="navbar navbar-expand-lg bg-body-tertiary">
        <?php include("includes/menu.php"); ?>
    </nav>

    <section>
        <?php
        $redirecionar = new verUrl;
        $redirecionar->trocarUrl(@$_GET['secao']);
        ?>
    </section>

    <footer>
        <?php include("includes/rodape.php");?>
    </footer>

</body>
</html>