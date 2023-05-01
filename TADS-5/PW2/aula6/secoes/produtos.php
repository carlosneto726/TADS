
<div class="nav flex-column z-1 position-fixed p-5 h-100">

    <form class="d-flex" role="search" action="adm/procura.php" method="GET">
        <input class="form-control me-2" type="search" name="busca" placeholder="Procurar por um carro" aria-label="Search">
        <button class="btn btn-outline-success" type="submit"><img src="img/icons/search.svg"></button>
    </form>

    <br/>

    <div class="dropdown">
        <button class="btn btn-secondary dropdown-toggle" type="button" data-bs-toggle="dropdown" aria-expanded="false">
            <?php if(@$_SESSION['order'] != ""){echo @$_SESSION['order'];}else{echo "Ordem";}?>
        </button>
        
        <ul class="dropdown-menu">
            <form action="adm/ordenacao.php" method="GET">
                <li><input class="dropdown-item" type="submit" name="order" value="Ordem alfabética"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="Preço"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="Cavalos"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="0-100"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="Velocidade"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="Quantidade"></li>
                <li><input class="dropdown-item" type="submit" name="order" value="Fabricante"></li>
            </form>
        </ul>
    </div>

    <br/>

    Atributos

    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="preco">
        <label class="form-check-label">Preço</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="velocidade">
        <label class="form-check-label">Velocidade máxima</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="cavalos">
        <label class="form-check-label">Cavalos</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="zeroacem">
        <label class="form-check-label">0-100</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="quantidade">
        <label class="form-check-label">Quantidade</label>
    </div>
    <div class="form-check form-switch">
        <input class="form-check-input" onclick="switchAttrs(this)" type="checkbox" role="switch" name="fabricante">
        <label class="form-check-label">Fabricante</label>
    </div>

    <script>
        function switchAttrs(btn){
            cards = document.getElementsByClassName("card");
            preco = document.getElementsByClassName("preco");
            fabricante = document.getElementsByClassName("fabricante");
            cavalos = document.getElementsByClassName("cavalos");
            zeroacem = document.getElementsByClassName("zeroacem");
            velocidade = document.getElementsByClassName("velocidade");
            quantidade = document.getElementsByClassName("quantidade");
            element = btn.name;

            for(let i = 0; i < cards.length; i++){
                if(element === "preco"){preco[i].hidden = !(preco[i].hidden);}
                if(element === "fabricante"){fabricante[i].hidden = !(fabricante[i].hidden);}
                if(element === "cavalos"){cavalos[i].hidden = !(cavalos[i].hidden);}
                if(element === "zeroacem"){zeroacem[i].hidden = !(zeroacem[i].hidden);}
                if(element === "velocidade"){velocidade[i].hidden = !(velocidade[i].hidden);}
                if(element === "quantidade"){quantidade[i].hidden = !(quantidade[i].hidden);}
            }            
        }
    </script>

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

<div class="titulo-pagina">
    <center><p><h1>PRODUTOS</h1></p></center>
    <center><p><h4>Aqui alguns exemplo de produtos.</h4></p></center>
</div>

<div class='grid-container'>
<?php

    $busca = new manipular_dados();

    $produtos_table;
    $ordem = @$_SESSION['order'];
    if($ordem == "alfabeto"){$produtos_table = $busca->getProdutoOrderByAlfabeto();
    }else if($ordem == "preco"){$produtos_table = $busca->getProdutoOrderByPreco();
    }else if($ordem == "cavalos"){$produtos_table = $busca->getProdutoOrderByCavalos();
    }else if($ordem == "0-100"){$produtos_table = $busca->getProdutoOrderByZeroACem();
    }else if($ordem == "velocidade"){$produtos_table = $busca->getProdutoOrderByVelocidade();
    }else if($ordem == "quantidade"){$produtos_table = $busca->getProdutoOrderByQuantidade();
    }else if($ordem == "fabricante"){$produtos_table = $busca->getProdutoOrderByLoja();
    }else{$produtos_table = $busca->getProdutoOrderByPreco();}


    foreach($produtos_table as $produto){ ?>
    
        <div class='card shadow-sm' style='width: 18rem;'>
            <div class='img'>
                <img src="<?php echo $produto['img_path']; ?>" id="imagemcarro" alt='card-img'>
            </div>
            <div class='card-body'>
                <h5 class='card-title text-truncate'><?=$produto['nome']?></h5>
                <p class='card-text text-truncate preco' hidden><img src="img/icons/cash.svg">  Preço: R$               <?php if($produto['preco'] == 0){echo "???";}else{echo number_format($produto['preco'],2,",",".");} ?></p>
                <p class='card-text text-truncate fabricante' hidden><img src="img/icons/shop.svg">  Fabricante:        <?= $busca->getFabricantePorNome($produto['nome'])[0]['nome'];?></p>
                <p class='card-text text-truncate cavalos' hidden><img src="img/icons/horse.svg">  Cavalos:             <?php if($produto['cavalos'] == 0){echo "???";}{echo number_format($produto['cavalos'],"0", ",", ".");}?> HP</p>
                <p class='card-text text-truncate zeroacem' hidden><img src="img/icons/speed-limit-100.svg">  0 a 100:  <?php if($produto['zeroacem'] == 0){echo"???";}else{echo number_format($produto['zeroacem'],"1", ",", ".");} ?> seg</p>
                <p class='card-text text-truncate velocidade' hidden><img src="img/icons/speedometer.svg">  Velocidade: <?php if($produto['velocidade'] == 0){echo "???";}else{echo number_format($produto['velocidade'],"0", ",", ".");}?> Km/h</p>
                <p class='card-text text-truncate quantidade' hidden><img src="img/icons/times.svg">  QTD produzida:    <?php if($produto['quantidade'] == 0){echo "???";}else{echo number_format($produto['quantidade'],"0", ",", ".");}?> unidades</p>

                <a href='#' class='btn btn-primary' onclick='provisory_btn()'>Mais Detalhes</a>
            </div>
        </div>

<?php } ?>

</div>







