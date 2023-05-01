<?php
include_once("../dao/manipular_dados.php");
session_start();

$busca = new manipular_dados();

$procura = $_GET['busca'];
$resultado = $busca->procura($procura);

foreach($resultado as $r){
    echo $r['id']."<br/>";
}

?>


