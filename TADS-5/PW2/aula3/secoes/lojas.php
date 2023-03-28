<div class="titulo-pagina">
    <center><p><h1>LOJAS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de lojas parceiras.</h4></p></center>
</div>

<div class='grid-container'>
<?php
    $lojas = array('Amazon','McDonalds','Alibaba Group','Starbucks','Louis Vitton','Walmart','Hermès','Zara','Subway','Ikea','Costco','Gucci','Jd.com','Chanel','eBay', 'KFC', 'Aldi', 'Lowes', 'Adidas', 'H&M', 'Walgreens', 'CVS', '7-Eleven');

    for($i = 0; $i < count($lojas); $i++){

        echo "
        <div class='card' style='width: 18rem;''>
        <img src='img/default_template.png' class='card-img-top' alt='card-img'>
            <div class='card-body'>
                <h5 class='card-title'>$lojas[$i]</h5>
                <p class='card-text'>Descrição da loja.</p>
                <a href='#' class='btn btn-primary'>Mais Detalhes</a>
            </div>
        </div>";
    }
?>
</div>
