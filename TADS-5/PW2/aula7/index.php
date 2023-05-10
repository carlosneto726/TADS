<?php
    include_once("controller/ver_url.php");
    include_once("dao/manipular_dados.php");
?>

<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="css/bootstrap.css?v=<?php echo time();?>">
    <link rel="stylesheet" href="css/app.css?v=<?php echo time();?>" id="appcss">
    <link rel="icon" href="img/icons/amazon_a.svg">
    <title>AmazonClone.com.br | Tudo pra você, de A a Z.</title>
</head>
<body id="body">



    <nav class="fixed-top">
        <div class="navbar navbar-expand-lg" style="height: 60px;">
            <?php include("includes/menu.php"); ?>
        </div>
            
        <div class="navbar-bottom navbar-expand-lg" style="height: 40px;">
            <?php include("includes/menu_bottom.php"); ?>
        </div>
    </nav>



    <section>        
        <?php
        $redirecionar = new verUrl;
        $redirecionar->trocarUrl(@$_GET['secao']);
        ?>
    </section>


    <footer id="rodape">
        <?php include("includes/rodape.php");?>
    </footer>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-/bQdsTh/da6pkI1MST/rWKFNjaCP5gBSY4sEBT38Q/9RBh9AH40zEOg7Hlq2THRZ" crossorigin="anonymous"></script>

</body>
</html>