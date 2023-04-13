<div class="position-relative">
    <a class="canvasleftbnt btn btn-primary position-absolute top-0 start-0" data-bs-toggle="offcanvas" href="#offcanvasExample" role="button" aria-controls="offcanvasExample">
        Adicionar produto
    </a>

    <div class="offcanvas offcanvas-start" tabindex="-1" id="offcanvasExample" aria-labelledby="offcanvasExampleLabel">
        <div class="offcanvas-header">
            <h5 class="offcanvas-title" id="offcanvasExampleLabel">Adicionar novos produtos</h5>
            <button type="button" class="btn-close" data-bs-dismiss="offcanvas" aria-label="Close"></button>
        </div>
        <div class="offcanvas-body">
            <div>
                Some text as placeholder. In real life you can have the elements you have chosen. Like, text, images, lists, etc.
            </div>

            <form method="post" action="adm/cadprodutos.php" enctype="multipart/form-data">
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
                <input type="submit" class="btn btn-primary" value="Adicionar"></input>
            </form>
        </div>
    </div>

    <?php
        $busca = new manipular_dados();

        $lojadata = $busca->getLojaIdByUserId($_SESSION['userToken']);

        //$busca->updateLojaNomeDesc();
    ?>

    <div class="titulo-pagina">
        <form action="adm/loja_interface.php" method="post">
            <input type="submit" class='btn btn-primary position-absolute top-0 end-0' name="acao" value="Atualizar nome e descrição">
            <center><p><h1><input class="produtos-input" type="text" name="nomeloja" value="<?= $lojadata[0]['nome'] ?>"></h1></p></center>
            <center><p><h4><input class="produtos-input" type="text" name="descricaoloja" value="<?= $lojadata[0]['descricao'] ?>"></h4></p></center>
        </form>
    </div>

    <div class='grid-container'>

    <?php

        $busca = new manipular_dados();

        @$produtos = $busca->getProdutoByUserId($_SESSION['userToken']);

        if(count($produtos) > 0){
            foreach($produtos as $produto){ ?>
            
                <div class='card' style='width: 18rem;'>
                    <form method="post" action="adm/loja_interface.php" enctype="multipart/form-data">
                        <img src="data:image/jpg;charset=utf8;base64,<?php echo base64_encode($produto['img']); ?>" class='card-img-top img-fluid' alt='card-img'>
                            <div class='card-body'>                
                            <h5 name='nomeproduto' class='card-title'><input class="produtos-input" type="text" name="nome" value="<?= $produto['nome']; ?>"></h5>
                            <p class='card-text'><input class="produtos-input" type="text" name="descricao" value="<?= $produto['descricao']; ?>"></p>
                            <p class='card-text'>R$: <input class="produtos-input" type="text" name="preco" value="<?= $produto['preco']; ?>"></p>
                            <input class="produtos-input" type="text" name="idproduto" value="<?= $produto['id']; ?>" hidden>
                            <input type="submit" class='btn btn-primary btn-sm' name="acao" value="Atualizar">
                            <input type="submit" class='btn btn-danger btn-sm' name="acao" value="Deletar">             
                            <label class="btn btn-primary btn-sm custom-file-upload">
                                Alterar fundo
                                <input type="file" id="file-input" name="image"/>
                            </label>
                        </form>
                    </div>
                </div>

    <?php 
        }
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

    <div id="liveAlertPlaceholder" class="position-fixed bottom-0 end-0"></div>
</div>

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



