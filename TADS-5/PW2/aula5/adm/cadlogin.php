<?php

    session_start();
    include_once('../dao/manipular_dados.php');

    $manipula = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];

    $manipula->setTable("tb_users");
    $users = $manipula->getAllDataTable();
    $user_id = "none";

    foreach($users as $user){
        if($user['email'] == $email){
            if($user['passw'] == $password){
                $user_id = $user['id'];
                break;
            }
        }
    }
    
    if($user_id == "none"){
        $_SESSION['userToken'] = "none";
        $_SESSION['jsAlert'] = "Usuário e/ou senha incorreto(s)";
        header("Location: http://localhost/aula4/?secao=login");
        exit();
    }else{
        $_SESSION['userToken'] = $user_id;
        header("Location: http://localhost/aula4/?secao=home");
        exit();
    }
?>