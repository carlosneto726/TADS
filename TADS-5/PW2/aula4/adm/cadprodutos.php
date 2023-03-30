<?php

    include_once("../dao/manipular_dados.php");


    $nomeproduto = $_POST['txtNomeProduto'];
    $descproduto = $_POST['txtDescricaoProduto'];
    $precoproduto = $_POST['txtPrecoProduto'];

    echo "Nome: ".$nomeproduto."<br/>Descrição: ".$descproduto."<br/>Preco: ".$precoproduto;

    $manipula = new manipular_dados();
    $manipula->setTable("tb_produtcs");

    $manipula->setFields("nome,descricao,preco");
    $manipula->setDados("'$nomeproduto', '$descproduto', '$precoproduto'");

    $manipula->insert();

    echo $manipula->getStatus();

?>