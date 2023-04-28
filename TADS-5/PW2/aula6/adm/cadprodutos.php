<?php
    session_start();
    include_once("../dao/manipular_dados.php");

    $manipula = new manipular_dados();
    $manipula->setTable("tb_produtos");

    echo $_COOKIE['email'];
    
    $idloja = $manipula->getLojaIdByEmail($_COOKIE['email'])[0]['id'];
    
    $nomeproduto = $_POST['txtNomeProduto'];
    $descproduto = $_POST['txtDescricaoProduto'];
    $precoproduto = $_POST['txtPrecoProduto'];

    $manipula->setFields("id_loja,nome,descricao,preco");
    $manipula->setDados("'$idloja', '$nomeproduto', '$descproduto', '$precoproduto'");

    $manipula->insert();

    $_SESSION['jsAlert'] = "Produto adicionado com sucesso.";
    header("Location: http://localhost/aula6/?secao=userloja");
    exit();

?>