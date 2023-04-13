<div class="titulo-pagina">
    <center><p><h1>LOJAS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de lojas parceiras.</h4></p></center>
</div>

<div class='grid-container'>
    <?php
        $busca = new manipular_dados();
        $busca->setTable("tb_lojas");
        @$lojas_table = $busca->getAllDataTable() or die("<center><h4>Parece que o banco de dados não está populado, insira alguns lojas!</h4></center>");
        foreach($lojas_table as $loja){ ?>
        
            <div class='card' style='width: 18rem;''>
            <img src='img/default_template.png' class='card-img-top' alt='card-img'>
                <div class='card-body'>
                    <h5 class='card-title'><?=$loja['nome']?></h5>
                    <p class='card-text'><?=$loja['descricao']?></p>

                    <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Proutos
                        </button>
                        <ul class="dropdown-menu">
                            <?php
                                @$produtos = $busca->getProdutosPorLoja( $loja['id'] ) or die("<center><h4>Parece que o banco de dados não está populado, insira alguns lojas!</h4></center>");
                                foreach($produtos as $produto){
                            ?>
                                    <div class="list-group">
                                        <a href="#" class="list-group-item list-group-item-action dropdown-item">
                                            <div class="d-flex w-100 justify-content-between">
                                                <h5 class="mb-1"><?= $produto['nome'] ?></h5>
                                            </div>
                                            <p class="mb-1"> <?= $produto['descricao'] ?> </p>
                                            <small><?= $produto['preco'] ?></small>
                                        </a>
                                    </div>        
                            <?php } ?>
                        </ul>
                    </div>
                </div>
            </div>
    <?php } ?>
</div>

