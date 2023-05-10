<!DOCTYPE html>
<html lang="pt-br">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="../../css/bootstrap.css?v=<?php echo time();?>">
    <link rel="stylesheet" href="../../css/app.css?v=<?php echo time();?>" id="appcss">
    <link rel="icon" href="../../img/icons/amazon_a.svg">
    <title>Acessar AmazonClone</title>
</head>


<body style="background-color:white; color:black;">
    
    <center><a href="../../index.php"><img src="../../img/icons/amazonblack_logo.svg" class="mt-3 mb-3" style="height:35px;"></a></center>

    <div class="container card" style="max-width:350px; color:black;">
        <div class="card-body">
        <h4>Fazer login</h4>

            <p class="card-text text-break">
                <div class="center-login">
                    <form method="post" action="validar_cookie.php">
                        <div>
                            <h6>Email</h6>
                            <input class="w-100" type="email" name='email'>
                        </div>
                        <div class="mt-2">
                            <h6>Senha</h6>
                            <input class="w-100" type="password" name='password'>
                        </div>

                        <button type="submit" class="btn btn w-100 mt-3" style="background-color:#FFD814;">Fazer login</button>
                        
                    </form>
                </div>
                </p>
            </div>
        </div>
        <div id="liveAlertPlaceholder" class="z-3 position-fixed bottom-0 end-0"></div>
    </div>


    <center class="mt-4">
        <hr class="w-100" style="max-width:100px; margin-right:235px;">
        <h6 style="width:150px; margin-top:-26px;">Novo na Amazon?<h6/>
        <hr class="w-100" style="max-width:100px; margin-left:235px; margin-top:-15px;">
    </center>


    <center>
        <form method="post" action="adm/cadusuario.php">
            <button type="submit" class="btn btn w-100 mt-3" style="max-width:350px; border:solid 1px black;">Criar a sua conta da Amazon</button>
        </form>
    </center>

    <img src="../../img/rodape_login.png" alt="">


</body>