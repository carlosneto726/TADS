<?php

    include_once("../dao/manipular_dados.php");

    $idloja = $_POST['txtIdLoja'];
    $nomeproduto = $_POST['txtNomeProduto'];
    $descproduto = $_POST['txtDescricaoProduto'];
    $precoproduto = $_POST['txtPrecoProduto'];

    $manipula = new manipular_dados();
    $manipula->setTable("tb_produtos");

    $manipula->setFields("id_loja,nome,descricao,preco");
    $manipula->setDados("'$idloja', '$nomeproduto', '$descproduto', '$precoproduto'");

    $manipula->insert();

    echo $manipula->getStatus()."<br/>IdLoja: ".$idloja."<br/>Nome: ".$nomeproduto."<br/>Descrição: ".$descproduto."<br/>Preco: ".$precoproduto;

?>