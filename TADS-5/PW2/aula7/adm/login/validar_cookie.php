<?php

    session_start();
    include_once('../../dao/manipular_dados.php');

    $manipula = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];

    $manipula->setTable("tb_usuarios");
    $linhas = $manipula->validarLogin($email, $password);
    
    if($linhas == 0){
        $_SESSION['jsAlert'] = "<script>alert('Usuário e/ou senha incorreto(s)')</script>";
        header("Location: ../../index.php");
        exit();
    }else{
        $_SESSION['email'] = $email;
        setcookie("email", $email, time() + (86400 * 30), "/");  
        header("Location: ../../index.php");
        exit();
    }
?>