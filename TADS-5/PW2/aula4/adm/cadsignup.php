<?php
    include_once('../dao/manipular_dados.php');

    $manipula = new manipular_dados();

    $email = $_POST['email'];
    $password = $_POST['password'];

    $manipula->setTable("tb_users");
    $users = $manipula->getAllDataTable();

    $cadastrado = 0;

    foreach($users as $user){
        if($user['email'] == $email){
            $cadastrado = 1;
            break;
        }
    }

    if($cadastrado){
        echo "<h1><center>E-mail já cadastrado.<br/><a href='http://localhost/aula4/?secao=signup'>Clique aqui para voltar</a></center></h1>";
        die();
    }else{
        $manipula->setFields("email,passw");
        $manipula->setDados("'$email','$password'");
        $manipula->insert();
        
        echo "<h1><center>Usuário registrado com sucesso!<br/><a href='http://localhost/aula4/?secao=login'>Clique aqui para fazer o login</a></center></h1>";
    }
    
?>
