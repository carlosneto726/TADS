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

    $cadastrado = $checklojas->validarNomeLoja($nomeloja) + $checkusers->validarEmail($email);

    if($cadastrado){
        $_SESSION['jsAlert'] = "Erro ao cadastrar usuário, e-mail já registrado.";
        header("Location: http://localhost/aula6/?secao=login");
        exit();
    }else{
        $checkusers->setFields("email,passw");
        $checkusers->setDados("'$email','$password'");
        $checkusers->insert();

        $id_user = $checkusers->getUserIdByEmail($email)[0]['id'];

        $checklojas->setFields("nome,descricao,id_user,img_path");


        $nome_arquivo = $_FILES['image']['name'];
        echo $nome_arquivo;
        $nome_local_salvo = 'img/lojas/'.$nome_arquivo;

        if(!empty($nome_arquivo)) { 
            $checklojas->setDados("'$nomeloja', '$descloja', '$id_user', '$nome_local_salvo'");
            $checklojas->insert();

            $url_local_salvo = "../img/lojas/".$nome_arquivo;
            move_uploaded_file($_FILES['image']['tmp_name'], $url_local_salvo);
        }

        $_SESSION['jsAlert'] = "Usuário cadastrado com sucesso!";
        header("Location: http://localhost/aula6/?secao=login");
        exit();
    }
    
?>
