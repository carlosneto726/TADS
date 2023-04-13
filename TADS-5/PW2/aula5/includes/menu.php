<?php 
session_start();
?>

<div class="container-fluid">
    <a class="navbar-brand" href="?secao=home">MarketPlace</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
        <ul class="navbar-nav me-auto mb-2 mb-lg-0">
            <li class="nav-item">
                <a class="nav-link" aria-current="page" href="?secao=produtos">Produtos</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" href="?secao=lojas">Lojas</a>
            </li>
            <li class="nav-item">
                <a class="nav-link" id="last_nav_link" href="?secao=login">Login</a>
            </li>

        </ul>
    </div>

    <div class="d-grid gap-2 d-md-flex justify-content-md-end">
        <form action="adm/sair.php" method="post">
            <button class="btn btn-danger me-md-2" id="sair-btn" type="submit" hidden>Sair</button>
        </form>
        <div class="form-check form-switch form-check-reverse">
            <input class="form-check-input" type="checkbox" id="checkbox_theme" onclick="change_theme()" checked>
            <label class="form-check-label" id="theme_label">Dark Mode</label>
        </div>
    </div>
</div>


<script>
    var token = '<?php echo $_SESSION['userToken'];?>';
    console.log("token: ", token, ".");
    var last_nav_link = document.getElementById("last_nav_link");
    var sair_btn = document.getElementById("sair-btn");

    console.log("token isNaN?:", isNaN(token));

    if(!isNaN(token)){
        last_nav_link.innerHTML = "Sua Loja";
        last_nav_link.href = "?secao=userloja";
        sair_btn.hidden = false;
    }else{
        last_nav_link.innerHTML = "Login";
        last_nav_link.href = "?secao=login";
        sair_btn.hidden = true;
    }

</script>