<?php 
session_start();

$isset = IsSet($_COOKIE['email']);

?>

<div class="container-fluid">
    <a class="navbar-brand p-2" href="?secao=home"><img src="img/amazon_logo.svg" width="100"></a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <div class="navbar-nav me-auto mb-2 mb-lg-0">

            <div class="nav-item me-2">
                <a class="nav-link fw-bold" href="#"><img class="mb-1 me-1" src="img/icons/geo.svg">Selecione o endereço</a>
            </div>


            <div class="nav-item">
                <div class="input-group">
                <form class="d-flex" role="search">
                    <div class="dropdown">
                        <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Todos
                        </button>
                        <ul class="dropdown-menu">
                            <li><a class="dropdown-item" href="#">Todos os departamentos</a></li>
                            <li><a class="dropdown-item" href="#">Alexa Skills</a></li>
                            <li><a class="dropdown-item" href="#">Alimentos</a></li>
                        </ul>
                    </div>

                    <input class="form-control" style="width:1045px;" type="search" placeholder="Pesquisa AmazonClone.com.br" aria-label="Search">
                    <button class="btn btn" style="background-color:#FEBD69;color:black;" type="submit"><img src="img/icons/search.svg"></button>
                </form>
                </div>
            </div>
            
            <?php if($isset){?>


            <div class="dropdown nav-item ms-2">
                <a class="nav-link fw-bold dropdown-toggle" data-bs-toggle="dropdown" aria-expanded="false">
                    <?php echo "Olá ".explode('@', $_COOKIE['email'], -1)[0]; ?>
                </a>
                <ul class="dropdown-menu">
                    <li><a class="dropdown-item" href="#">Sua conta</a></li>
                    <li><a class="dropdown-item" href="#">Seus pedidos</a></li>
                    <li><a class="dropdown-item" href="adm/login/sair.php">Sair</a></li>
                </ul>
            </div>



            <?php }else{ ?>


                <div class="nav-item ms-2">
                    <a class="nav-link fw-bold" aria-current="page" href="<?php echo "adm/login/login.php"; ?>">Login</a>
                </div>

            <?php } ?>

            <div class="nav-item ms-2">
                <a class="nav-link fw-bold" aria-current="page" href="#">Pedidos</a>
            </div>

            <div class="nav-item ms-2">
                <a class="nav-link fw-bold" aria-current="page" href="?secao=carrinho"><img src="img/icons/cart.svg"> Carrinho</a>
            </div>

        </div>
    </div>
</div>