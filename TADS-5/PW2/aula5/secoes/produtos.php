<div class="titulo-pagina">
    <center><p><h1>PRODUTOS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de produtos.</h4></p></center>
</div>

<div class='grid-container'>
<?php

    $busca = new manipular_dados();
    $busca->setTable("tb_produtos");
    @$produtos_table = $busca->getAllDataTable() or die("<center><h4>Parece que o banco de dados não está populado, insira alguns produtos!</h4></center>");


    foreach($produtos_table as $produto){ ?>
    
        <div class='card' style='width: 18rem;'>
        <div class='img'>
            <img src="data:image/jpg;charset=utf8;base64,<?php echo base64_encode($produto['img']); ?>" id="imagem" alt='card-img'>
        </div>
            <div class='card-body'>
                <h5 class='card-title'><?=$produto['nome']?></h5>
                <p class='card-text'><?=$produto['descricao']?></p>
                <p class='card-text'>Preço: R$<?=$produto['preco']?></p>

                <p class='card-text'>Loja: <?=$busca->getLojaPorNome($produto['nome'])[0]['nome'];?></p>


                <a href='#' class='btn btn-primary' onclick='provisory_btn()'>Mais Detalhes</a>
            </div>
        </div>

<?php } ?>

</div>







