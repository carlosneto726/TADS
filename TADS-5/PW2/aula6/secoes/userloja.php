
<!-- Sidenav -->
<div class="nav flex-column z-1 position-fixed p-5 h-100">

    <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Procurar por um carro" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
    </form>
    <br/>

    <div>
        <a class="btn btn-success" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
            Adicionar carro
        </a>
    </div>

    <br/>
    
    <div>
        <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#configurarPerfil">
            Configurar Perfil
        </button>
    </div>

    <br/>

    <a class="icon-link icon-link-hover" href="#">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-up" viewBox="0 0 16 16">
        <path fill-rule="evenodd" d="M8 15a.5.5 0 0 0 .5-.5V2.707l3.146 3.147a.5.5 0 0 0 .708-.708l-4-4a.5.5 0 0 0-.708 0l-4 4a.5.5 0 1 0 .708.708L7.5 2.707V14.5a.5.5 0 0 0 .5.5z"/>
        <use xlink:href="#arrow-up"></use></svg>
        Ir para o topo
    </a>
    
    <a class="icon-link icon-link-hover" href="#rodape">
        <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-arrow-down" viewBox="0 0 16 16">
        <path fill-rule="evenodd" d="M8 1a.5.5 0 0 1 .5.5v11.793l3.146-3.147a.5.5 0 0 1 .708.708l-4 4a.5.5 0 0 1-.708 0l-4-4a.5.5 0 0 1 .708-.708L7.5 13.293V1.5A.5.5 0 0 1 8 1z"/>
        <use xlink:href="#arrow-down"></use></svg>
        Ir para o fundo
    </a>
</div>


<!-- Perfil modal -->
<div class="modal fade" id="configurarPerfil" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
        <div class="modal-content" style="background-color: #1E1F2B;">
            <div class="modal-header" data-bs-theme="dark">
                <h1 class="modal-title fs-5" id="exampleModalLabel">Configurar perfil</h1>
                <button type="button" class="btn-close" data-bs-dismiss="modal"></button>
            </div>
            <?php
                $busca = new manipular_dados();
                $lojadata = $busca->getLojaIdByEmail($_COOKIE['email']);
            ?>
            <form action="adm/loja_interface.php" method="post" enctype="multipart/form-data">
                <div class="modal-body">
                    <img src="<?php echo $lojadata[0]['img_path'];?>" id="imagemlogo">
                    <br/>
                    <p>Nome: <br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="nomeloja" value="<?= $lojadata[0]['nome'] ?>"></p>
                    <p>Descrição: <br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="descricaoloja" value="<?= $lojadata[0]['descricao'] ?>"></p>
                </div>
            
                <div class="modal-footer">
                    <label class="btn btn-primary custom-file-upload">
                        Alterar imagem
                        <input type="file" name="imgPerfil">
                    </label>
                    <input type="submit" class='btn btn-danger' name="acao" value="Deletar perfil">
                    <input type="submit" class="btn btn-primary" name="acao" value="Salvar perfil">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- Adicionar produto offcanvas -->
<div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel" style="background-color: #1E1F2B; color: #EAF2D4;">
    <div class="offcanvas-header" data-bs-theme="dark">
        <h5 class="offcanvas-title" id="offcanvasExampleLabel">Adicionar novos carros</h5>
        <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
    </div>
    <div class="offcanvas-body">
        <div>
            Aqui você pode inserir os seu carros no seu perfil.
        </div>

        <form method="post" action="adm/cadprodutos.php" enctype="multipart/form-data">
            <div class="mb-3">
                <label class="form-label"><h5>Nome: </h5></label>
                <input type="text" name="nome" class="form-control bg-secondary rounded-2" >
            </div>

            <div class="mb-3">
                <label class="form-label"><h5>Preço: </h5></label>
                <input type="text" name="preco" class="form-control bg-secondary rounded-2">
            </div>

            <div class="mb-3">
                <label class="form-label"><h5>Velocidade: </h5></label>
                <input type="text" name="velocidade" class="form-control bg-secondary rounded-2">
            </div>

            <div class="mb-3">
                <label class="form-label"><h5>Cavalos: </h5></label>
                <input type="text" name="cavalos" class="form-control bg-secondary rounded-2">
            </div>

            <div class="mb-3">
                <label class="form-label"><h5>0-100: </h5></label>
                <input type="text" name="zeroacem" class="form-control bg-secondary rounded-2">
            </div>

            <div class="mb-3">
                <label class="form-label"><h5>Quantidade: </h5></label>
                <input type="text" name="quantidade" class="form-control bg-secondary rounded-2">
            </div>

            <label class="btn btn-success custom-file-upload">
                Adicionar imagem
                <input type="file" id="file-input" name="image"/>
            </label>

            <input type="submit" class="btn btn-primary" value="Adicionar"></input>
        </form>
    </div>
</div>

<!-- Titulo da página -->
<?php
    $busca = new manipular_dados();
    $lojadata = $busca->getLojaIdByEmail($_COOKIE['email']);
?>
<div class="titulo-pagina">
    <center><img src="<?php echo $lojadata[0]['img_path'];?>" id="imagemlogo"></center>
    <center><p><h1><?= $lojadata[0]['nome'] ?></h1></p></center>
    <center><p><h4><?= $lojadata[0]['descricao'] ?></h4></p></center>
</div>

<!-- Lista de produtos -->
<div class='grid-container'>
<?php
    $busca = new manipular_dados();
    @$produtos = $busca->getProdutoByEmail($_COOKIE['email']);

    if(count($produtos) > 0){
        foreach($produtos as $produto){ ?>
        
            <!-- Card produto -->
            <div class='card' style='width: 18rem;'>
                <div class='img'>
                    <img src="<?php echo $produto['img_path'];?>" class='card-img-top img-fluid' id="imagemcarro" alt='card-img'>
                </div>
                <div class='card-body'>
                    <h5 class='card-title'><?= $produto['nome']; ?></h5>
                    <br/>
                    <p class='card-text text-truncate'>R$: <?= number_format($produto['preco'],2,",","."); ?></p>
                    <p class='card-text text-truncate'>Velocidade: <?= number_format($produto['velocidade'],"0", ",", "."); ?> Km/h</p>
                    <p class='card-text text-truncate'>Cavalos: <?= number_format($produto['cavalos'],"0", ",", "."); ?> HP</p>
                    <p class='card-text text-truncate'>0-100: <?= number_format($produto['zeroacem'],"1", ",", "."); ?> Seg</p>
                    <p class='card-text text-truncate'>Quantidade: <?= number_format($produto['quantidade'],"0", ",", "."); ?> qtd</p>
                    <p class="card-text text-truncate" hidden><?= $produto['id']; ?></p>
                
                    <button type="button" class="btn btn-primary" data-bs-toggle="modal" data-bs-target="#configurarProduto<?php echo $produto['id'];?>">
                        Configurar
                    </button>
                </div>
            </div>

            <!-- Modal produto -->
            <div class="modal fade" id="configurarProduto<?php echo $produto['id'];?>" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
                <div class="modal-dialog modal-dialog-centered modal-dialog-scrollable">
                    <div class="modal-content" style="background-color: #1E1F2B;">
                        <div class="modal-header" data-bs-theme="dark">
                            <h1 class="modal-title fs-5" id="exampleModalLabel">Configurar carro</h1>
                            <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                        </div>
                        <form method="post" action="adm/loja_interface.php" enctype="multipart/form-data">
                            <div class="modal-body">
                                <div class='img'>
                                    <img src="<?php echo $produto['img_path'];?>" class='card-img-top img-fluid' id="imagemlogo" alt='card-img'>
                                </div>
                                
                                <p>Nome: <br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="nome" value="<?= $produto['nome'];?>"></p>
                                <p>Preço: Reais (R$) <br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="preco" value="<?= $produto['preco'];?>"></p>
                                <p>Velocidade: Kilometros por hora (Km/h)<br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="velocidade" value="<?= $produto['velocidade'];?>"></p>
                                <p>Cavalos: Horse Power (HP)<br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="cavalos" value="<?= $produto['cavalos'];?>"></p>
                                <p>0-100: Segundos<br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="zeroacem" value="<?= $produto['zeroacem'];?>"></p>
                                <p>Quantidade: QTD<br/><input class="w-100 text-light bg-secondary rounded-2" type="text" name="quantidade" value="<?= $produto['quantidade']; ?>"></p>
                                <input type="text" name="idproduto" value="<?= $produto['id']; ?>" hidden>

                            </div>
                            <div class="modal-footer">
                                <input type="submit" class='btn btn-danger' name="acao" value="Deletar">
                                <input type="submit" class="btn btn-primary" name="acao" value="Salvar">
                                <label class="btn btn-primary custom-file-upload">
                                    Alterar imagem
                                    <input type="file" id="file-input" name="image"/>
                                </label>
                            </div>
                        </form>
                    </div>
                </div>
            </div>

<?php 
    }
    // Placeholder
    }else{
        $_SESSION['jsAlert'] = "Você ainda não tem nenhum produto cadastrado.";
        for($i = 0; $i < 8; $i++){
            echo '
                <div class="card" aria-hidden="true">
                    <img src="img/default_template.png" class="card-img-top">
                    <div class="card-body">
                        <h5 class="card-title placeholder-glow">
                            <span class="placeholder col-6"></span>
                        </h5>
                        <p class="card-text placeholder-glow">
                            <span class="placeholder col-7"></span>
                            <span class="placeholder col-4"></span>
                            <span class="placeholder col-4"></span>
                            <span class="placeholder col-6"></span>
                            <span class="placeholder col-8"></span>
                        </p>
                        <a class="btn btn-primary disabled placeholder col-6"></a>
                    </div>
                </div>
            ';
        }
    }
    ?>

</div>

<div id="liveAlertPlaceholder" class="z-3 position-fixed bottom-0 end-0"></div>


<!-- Alert -->
<script>
    const alertPlaceholder = document.getElementById('liveAlertPlaceholder')
    const appendAlert = (message, type) => {
    const wrapper = document.createElement('div')
        wrapper.innerHTML = [
            `<div class="alert alert-${type} alert-dismissible" role="alert">`,
            `   <div>${message}</div>`,
            '   <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>',
            '</div>'
        ].join('')

        alertPlaceholder.append(wrapper)
    }

    const alertTrigger = "<?php echo $_SESSION['jsAlert']; ?>";
    if (alertTrigger != "none") {
        appendAlert(alertTrigger, 'success');
    }
</script>

<?php
$_SESSION['jsAlert'] = "none";
?>



