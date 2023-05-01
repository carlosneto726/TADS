<div class="titulo-pagina">
    <center><p><h1>LOJAS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de lojas parceiras.</h4></p></center>
</div>



<div class='grid-container'>
    <?php
        $busca = new manipular_dados();
        $busca->setTable("tb_lojas");
        @$lojas_table = $busca->getAllDataTable();
        foreach($lojas_table as $loja){ ?>
        
            <div class='card' style='width: 18rem;'>


            <div class="img">
                <img src='<?php echo $loja['img_path'];?>' id="imagemlogo">
            </div>


                <div class='card-body'>
                    <h5 class='card-title'><?=$loja['nome']?></h5>
                    <p class='card-text'><?=$loja['descricao']?></p>

                    <div class="dropdown">
                        <button class="btn btn-primary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
                            Carros
                        </button>
                        <ul class="dropdown-menu">
                            <?php
                                @$produtos = $busca->getProdutosPorLoja( $loja['id'] );
                                foreach($produtos as $produto){
                            ?>
                                    <div class="list-group">
                                        <a href="#" class="list-group-item list-group-item-action dropdown-item">
                                            <div class="d-flex w-100 justify-content-between">
                                                <h5 class="mb-1"><?= $produto['nome'] ?></h5>
                                            </div>
                                        </a>
                                    </div>
                                    
                            <?php } ?>
                        </ul>
                    </div>
                </div>
            </div>
    <?php } ?>
</div>