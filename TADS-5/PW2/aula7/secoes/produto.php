

<?php 
include_once('dao/manipular_dados.php');
$manipula = new manipular_dados();
$produto = $manipula->getProdutosPorID($_GET['produtoid']);
?>

<script>
    var body = document.getElementById("body");
    body.style = "background-color: white;";
</script>

<div class="produtos" style="margin-top: 150px; margin: 200px;">

    <div class="hstack gap-3">
        <div class="ms-2 me-2" style="max-width: 680px; max-height: 680px;">
            <img src="<?= $produto[0]['img_url'] ?>" id="imagem_produto_pagina">
        </div>
        
        <div class="p-2">
            <h5 class="fw-bold"><?= $produto[0]['titulo']?></h5>
            <br>
            Marca: <?= $produto[0]['marca']?>
            <br>
            Estrelas: <?= $produto[0]['estrelas']?>
            <hr>
            R$<span class="fs-4 fw-bold"><?= number_format($produto[0]['preco'],2,",",".");?></span>
            <br>
            <img src="img/produto_placeholder.png" class="w-100">
            <br>
            <span class="fw-bold">Marca</span>                          <span style="margin-left: 215px;"><?= $produto[0]['marca']?></span><br>
            <span class="fw-bold">Cor</span>                            <span style="margin-left: 235px;">??</span><br>
            <span class="fw-bold">Tecnologia de conexão</span>          <span style="margin-left: 90px;">??</span><br>
            <span class="fw-bold">Material</span>                       <span style="margin-left: 200px;">??</span><br>
            <span class="fw-bold">Usos específicos do produto</span>    <span style="margin-left: 50px;">??</span><br>
            <hr>
            <br>
            <span class="fw-bold">Sobre este item</span>
            <br>
            <p class="text-break" style="max-width: 500px;">
                <?= $produto[0]['descricao']?>
            </p>
        </div>

        <div class="ms-2 me-2 rounded-2" style="border:solid 1px #D5D9D9; width: 245px; height: 530px;">
            <form action="adm/carrinho/adicionar_carrinho.php" method="POST">

                <div class="mt-2 ms-2">R$<span class="fs-5 fw-bold"><?= number_format($produto[0]['preco'],2,",",".");?></span></div>
                <div class="mt-2 ms-2"><span class="fs-6">Entrega R$ 23,51: 18 - 23 de Maio.</span></div>
                <div class="mt-2 ms-2 mb-3">
                    <span class="fs-4"><?php if($produto[0]['qtd'] > 0){echo "<span class='text-success'>Em estoque</span>";}else{echo "<span class='text-danger'>Indisponivel</span>";}?></span>
                    <br><br>
                    Quantidade: <input type="number" style="width: 75px;" name="qtd" value="1">

                    <input name="id_produto" value="<?= $produto[0]['id'] ?>" hidden>

                </div>
                <br>

                <center>
                    
                    <button class="btn btn rounded-5" style="background-color:#FFD814; color:black; width: 200px;" type="submit">Adicionar ao carrinho</button>
                    <button class="btn btn rounded-5 mt-3" style="background-color:#FFA41C; color:black; width: 200px;" type="submit">Comprar agora</button>
                    <br>
                    <br>
                    Enviado por <?= $manipula->getLojaByProdutoID($produto[0]['id_loja'])[0]['nome']?><br>
                    Vendido por <?= $manipula->getLojaByProdutoID($produto[0]['id_loja'])[0]['nome']?><br>
                </center>
            </form>    
        </div>
    </div>

    <hr style="width:1465px;">

    <h4 class="fw-bold mt-2 ms-2">Produtos relacionados</h4>
        <div class="grid-container-categoria">
            <?php 

                $produtos = new manipular_dados();
                $produtos->setTable("tb_produtos");
                foreach($produtos->getProdutosPorCategoria($_GET['produtocategoria']) as $produto){
            ?>
            
                <div class='img' style='max-width: 270px; max-height: 200px; width: auto; height: auto;'>
                    <a href="?secao=produto&produtoid=<?= $produto['id']?>&produtocategoria=<?= $produto['categoria']?>"><img src="<?= $produto['img_url'] ?>" id="imagem_produto"></a>
                </div>

            <?php }
            ?>

        </div>

</div>