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

    <div class="titulo-pagina">
        <center><p><h1>Cadastramento de produtos</h1></p></center>
        <center><p><h4>Você está na pagina administradora para cadastração de produtos.</h4></p></center>
    </div>

    <div class="card-login container card mb-3">
        <div class="card-header"><h4>Cadastre o seu produto</h4></div>
            <div class="card-body">
                <p class="card-text text-break">
                    <div class="center-login">
                        <form method="post" action="cadprodutos.php" enctype="multipart/form-data">
                            
                            <div class="mb-3">
                                <label class="form-label"><h5>Digite o id da loja: </h5></label>
                                <input type="text" name="txtIdLoja" class="form-control" >
                            </div>

                            <div class="mb-3">
                                <label class="form-label"><h5>Digite o nome do produto: </h5></label>
                                <input type="text" name="txtNomeProduto" class="form-control" >
                            </div>

                            <div class="mb-3">
                                <label class="form-label"><h5>Digite a descrição do produto</h5></label>
                                <textarea name="txtDescricaoProduto" class="form-control" rows="8" cols="50"></textarea>
                            </div>

                            <div class="mb-3">
                                <label class="form-label"><h5>Digite o preço do produto: </h5></label>
                                <input type="text" name="txtPrecoProduto" class="form-control">
                            </div>
                            <!-- 
                            <div class="mb-3">
                                <input type="file">
                            </div>
                            -->

                            <input type="submit" class="btn btn-primary" value="Enviar"></input>

                        </form>
                    </div>
                </p>
            </div>
        </div>
    </div>

    <script src="../js/bootstrap.js"></script>
</body>
</html>