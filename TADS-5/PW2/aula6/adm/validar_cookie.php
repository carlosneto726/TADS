<?php

    session_start();
    include_once('../dao/manipular_dados.php');

    $manipula = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];

    $manipula->setTable("tb_users");
    $linhas = $manipula->validarLogin($email, $password);
    
    if($linhas == 0){
        $_SESSION['jsAlert'] = "Usuário e/ou senha incorreto(s)";
        header("Location: http://localhost/aula6/index.php?secao=login");
        exit();
    }else{
        $_SESSION['userToken'] = 1;
        setcookie("email", $email, time() + (86400 * 30), "/");
  
        header("Location: http://localhost/aula6/index.php?secao=home");
        exit();
    }
?>