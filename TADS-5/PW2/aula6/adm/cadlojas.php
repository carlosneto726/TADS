<?php

    include_once("../dao/manipular_dados.php");


    $nomeloja = $_POST['txtNomeLoja'];
    $descloja = $_POST['txtDescricaoLoja'];

    $manipula = new manipular_dados();
    $manipula->setTable("tb_lojas");

    $manipula->setFields("nome,descricao");
    $manipula->setDados("'$nomeloja', '$descloja'");

    $manipula->insert();

    echo $manipula->getStatus().'<br/>Nome: '.$nomeloja.'<br/>Descrição: '.$descloja;

?>