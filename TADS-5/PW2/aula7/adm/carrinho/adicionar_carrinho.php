<?php
session_start();
include_once("../../dao/manipular_dados.php");

$manipula = new manipular_dados();

$id_produto = $_POST['id_produto'];
$id_usuario = $manipula->getIdByEmail($_SESSION['email'])[0]['id'];
$qtd = $_POST['qtd'];


$manipula->setTable("tb_carrinho");
$manipula->setFields("id_usuario,id_produto,qtd");
$manipula->setDados("'$id_usuario','$id_produto','$qtd'");
$manipula->insert();

header("Location: ../../?secao=carrinho");
exit();

?>