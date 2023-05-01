<?php 

// Gambiarra

session_start();

$order = $_GET['order'];

if($order == "Ordem alfabética"){
    $_SESSION["order"] = "alfabeto";

}else if($order == "Preço"){
    $_SESSION["order"] = "preco";

}else if($order == "Cavalos"){
    $_SESSION["order"] = "cavalos";

}else if($order == "0-100"){
    $_SESSION["order"] = "0-100";

}else if($order == "Velocidade"){
    $_SESSION["order"] = "velocidade";

}else if($order == "Quantidade"){
    $_SESSION["order"] = "quantidade";

}else if($order == "Fabricante"){
    $_SESSION["order"] = "fabricante";
}

header("Location: http://localhost/aula6/index.php?secao=produtos");
exit();

?>