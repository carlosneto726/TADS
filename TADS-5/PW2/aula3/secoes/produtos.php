<div class="titulo-pagina">
    <center><p><h1>PRODUTOS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de produtos.</h4></p></center>
</div>

<div class='grid-container'>
<?php
    $produtos = array('Celulares e smartphones','Capinhas','Sapatos femininos','Camisetas','Lembrancinhas','Aparelhos','Câmeras','Cartões de memória','Relógios','Cartuchos de tinta','Perfumes importados','Jogos para PlayStation','Tablets','Peças para automóveis','Impressoras',);

    for($i = 0; $i < count($produtos); $i++){

        echo "
        <div class='card' style='width: 18rem;''>
        <img src='img/default_template.png' class='card-img-top' alt='card-img'>
            <div class='card-body'>
                <h5 class='card-title'>$produtos[$i]</h5>
                <p class='card-text'>Descrição do produto.</p>
                <a href='#' class='btn btn-primary' onclick='provisory_btn()'>Mais Detalhes</a>
            </div>
        </div>";
    }
?>
</div>





