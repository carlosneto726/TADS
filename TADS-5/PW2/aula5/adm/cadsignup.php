<?php

    session_start();
    include_once('../dao/manipular_dados.php');

    $checkusers = new manipular_dados();
    $checklojas = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];
    $nomeloja = $_POST['nomeloja'];
    $descloja = $_POST['descloja'];

    $checkusers->setTable("tb_users");
    $checklojas->setTable("tb_lojas");
    
    $users = $checkusers->getAllDataTable();
    $lojas = $checklojas->getAllDataTable();

    $cadastrado = 0;

    foreach($users as $user){
        if($user['email'] == $email){
            $cadastrado = 1;
            break;
        }
    }

    foreach($lojas as $loja){
        if($loja['nome'] == $nomeloja){
            $cadastrado = 1;
            break;
        }
    }




    if($cadastrado){
        $_SESSION['jsAlert'] = "Erro ao cadastrar usuário, e-mail já registrado.";
        header("Location: http://localhost/aula4/?secao=login");
        exit();
    }else{
        $checkusers->setFields("email,passw");
        $checkusers->setDados("'$email','$password'");
        $checkusers->insert();

        $id_user = $checkusers->getUserIdByEmail($email)[0]['id'];

        $checklojas->setFields("nome,descricao,id_user");
        $checklojas->setDados("'$nomeloja', '$descloja', '$id_user'");
        $checklojas->insert();

        $_SESSION['jsAlert'] = "Usuário cadastrado com sucesso!";
        header("Location: http://localhost/aula4/?secao=login");
        exit();
    }
    
?>
