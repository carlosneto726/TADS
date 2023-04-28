<?php ?>
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
                <a class="nav-link" href="?secao=userloja">Sua Loja</a>
            </li>
    </div>

    <div class="form-check form-switch form-check-reverse">
        <input class="form-check-input" type="checkbox" id="checkbox_theme" onclick="change_theme()" checked>
        <label class="form-check-label" id="theme_label">Dark Mode</label>
    </div>
</div>
