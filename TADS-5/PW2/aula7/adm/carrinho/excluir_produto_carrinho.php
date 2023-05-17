<?php
session_start();
include_once("../../dao/manipular_dados.php");

$manipula = new manipular_dados();

$id_produto = $_GET['id'];

echo $id_produto;

$manipula->dellProdutoCarrinho($id_produto);

header("Location: ../../?secao=carrinho");
exit();

?>