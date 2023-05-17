<div class="hstack">
    <div class="carrinho">
        <h1>Carrinho de compras</h1>
        <p align="right">Preço</p>
        <hr>

        <?php

        $manipula = new manipular_dados();
        $produtos_carrinho = $manipula->getCarrinho( $manipula->getIdByEmail($_COOKIE['email'])[0]['id'] );
        $valor_total = 0;

        if(count($produtos_carrinho) == 0){
            echo "<h4>Você não possui produtos no carrinho.</h4>";
        }

        foreach($produtos_carrinho as $produto_carrinho){
            $produto = $manipula->getProdutosPorID($produto_carrinho['id_produto']);
            ?>

            <div class="produtos-carrinho hstack gap-3" style="padding: 20px;">
                <img src="<?= $produto[0]['img_url'] ?>" style="width: 205px;">
                <div class="p-2" style="">
                    <a href="?secao=produto&produtoid=<?= $produto[0]['id']?>&produtocategoria=<?= $produto[0]['categoria']?>"> <?= $produto[0]['titulo'] ?> </a>
                    <br>
                    <span><?php if($produto[0]['qtd'] > 0){echo "<span class='text-success'>Em estoque</span>";}else{echo "<span class='text-danger'>Indisponivel</span>";}?></span>
                    <br>
                    <div class="hstack gap-3">
                        qtd: <input type="number" style="width: 45px;" value="<?= $produto_carrinho['qtd'] ?>">
                        <div class="vr"></div>
                        
                        <a href="adm/carrinho/excluir_produto_carrinho.php?id=<?=$produto_carrinho['id']?>" class="p-2">Excluir</a>
                        
                    </div>

                </div>

                <div class="ms-auto fw-bold" style="margin-top: -200px;">R$ <?= number_format($produto[0]['preco'],2,",",".") ?> </div>            
                
            </div>
            <hr>

            

        <?php
        $valor_total += ($produto[0]['preco'] * $produto_carrinho['qtd']);
        }
        ?>

        <p align="right">Subtotal (<?= count($produtos_carrinho) ?> item): <span class="fw-bold">R$ <?= number_format($valor_total,2,",",".") ?> </span></p>

    </div>


    <div class="ms-2 me-2 p-3" style="border:solid 1px #D5D9D9; width: 300px; height: 150px; background-color: white;">
        <form action="adm/adicionar_carrinho.php" method="POST">
            
            <p class="fs-5">Subtotal (<?= count($produtos_carrinho) ?> item): <span class="fw-bold">R$ <?= number_format($valor_total,2,",",".") ?> </span></p>
            <center>
                <button class="btn btn rounded-5" style="background-color:#FFD814; color:black; width: 200px;" type="submit">Fechar pedido</button>
            </center>
        </form>
    </div>

</div>