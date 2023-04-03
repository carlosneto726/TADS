<?php
    include_once("controller/ver_url.php");
    include_once("dao/manipular_dados.php");
    $menu = "menu.php";
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="css/app_dark.css" id="appcss">
    <title>MarketPlace</title>
</head>
<body>
    <header>

    </header>

    <nav class="navbar navbar-expand-lg sticky-top">
        <script>
            var userToken = window.localStorage.getItem("userToken");
            alert(userToken);
            if(isNaN(userToken)){
                '<?php $menu = 'menu.php' ?>'
            }else{
                '<?php $menu = 'loggedmenu.php' ?>'
            }
        </script>


        <?php include("includes/$menu"); ?>
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


    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>
    <script src="js/app.js"></script>
</body>
</html>