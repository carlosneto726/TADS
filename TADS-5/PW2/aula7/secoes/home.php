<div>

    <div id="carouselExampleCaptions" class="z-n1 position-absolute carousel slide fixed-top" style="margin-top:100px;">
        <div class="carousel-inner">
            <div class="carousel-item active">
                <center><img src="img/carousel/img2.jpg" class="d-block" style="width:1500px;"></center>
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
            <center><img src="img/carousel/img1.jpg" class="d-block" style="width:1500px;"></center>
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
            <center><img src="img/carousel/img3.jpg" class="d-block" style="width:1500px;"></center>
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
            <center><img src="img/carousel/img4.jpg" class="d-block" style="width:1500px;"></center>
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
            <div class="carousel-item">
            <center><img src="img/carousel/img5.jpg" class="d-block" style="width:1500px;"></center>
                <div class="carousel-caption d-none d-md-block">
                </div>
            </div>
        </div>

        <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
        </button>
        <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
            <span class="carousel-control-next-icon" aria-hidden="true"></span>
        </button>
    </div>
    

    <div class="grid-container">

    <?php for($i = 0; $i < 19; $i++){?>
    
        <div class='card border-light rounded-0' style='width: 350px; height: 420px;'>
            <div class='card-body'>

                <h4>Alguma coisa...</h4>

                <div class='img'>
                    <img src="img/default_template.png" id="imagem_produto">
                </div>

                <br>

                <h6 class="card-subtitle mb-2 text-body-secondary">Preço</h6>
                <p class="card-text">Mais detalhes</p>
                <a href="?secao=teste" class="card-link">Um link</a>
                
            </div>
        </div>

    <?php }?>

    </div>


    
</div>