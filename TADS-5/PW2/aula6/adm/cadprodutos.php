<?php
    session_start();
    include_once("../dao/manipular_dados.php");

    $manipula = new manipular_dados();
    $manipula->setTable("tb_produtos");

    echo $_COOKIE['email'];
    
    $idloja = $manipula->getLojaIdByEmail($_COOKIE['email'])[0]['id'];
    
    $nome = $_POST['nome'];
    $preco = $_POST['preco'];
    $velocidade = $_POST['velocidade'];
    $cavalos = $_POST['cavalos'];
    $zeroacem = $_POST['zeroacem'];
    $quantidade = $_POST['quantidade'];
    $nome_arquivo = $_FILES['image']['name'];

    if(!empty($nome_arquivo)) {
        $url_local = "img/produtos/".$nome_arquivo;
        $url_local_salvo = "../img/produtos/".$nome_arquivo;
        move_uploaded_file($_FILES['image']['tmp_name'], $url_local_salvo);
    }else{
        $url_local = "img/default_template.png";
    }

    $manipula->setFields("id_loja,nome,preco,img_path,velocidade,cavalos,zeroacem,quantidade");
    $manipula->setDados("'$idloja', '$nome', '$preco', '$url_local', '$velocidade', '$cavalos', '$zeroacem', '$quantidade'");

    $manipula->insert();

    $_SESSION['jsAlert'] = "Produto adicionado com sucesso.";
    header("Location: http://localhost/aula6/?secao=userloja");
    exit();

?>