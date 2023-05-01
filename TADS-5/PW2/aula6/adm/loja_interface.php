<?php
    include_once("../dao/manipular_dados.php");

    function converte($String){
        return iconv("UTF-8", "ISO-8859-1", $String);
    }

    $manipula = new manipular_dados();
    session_start();

    $acao = @$_POST['acao'];
    $id = @$_POST['idproduto'];
    $nome = @$_POST['nome'];
    $preco = @$_POST['preco'];
    $velocidade = @$_POST['velocidade'];
    $cavalos = @$_POST['cavalos'];
    $quantidade = @$_POST['quantidade'];
    $zeroacem = @$_POST['zeroacem'];

    $nomeloja = @$_POST['nomeloja'];
    $descricaoloja = @$_POST['descricaoloja'];
    
    $idloja = $manipula->getLojaIdByEmail($_COOKIE['email'])[0]['id'];

    if($acao == "Salvar"){
        $nome_arquivo = $_FILES['image']['name'];
        $manipula->updateProduto($nome, $preco, $id, $velocidade, $cavalos, $zeroacem, $quantidade);

        if(!empty($nome_arquivo)) { 
            $manipula->updatetImg("img/produtos/".$nome_arquivo, $id);

            $nome_arquivo_salvo = converte($_FILES['image']['name']);
            $url_local_salvo = "../img/produtos/".$nome_arquivo_salvo;
            move_uploaded_file($_FILES['image']['tmp_name'], $url_local_salvo);
        }
        $_SESSION['jsAlert'] = "Produto atualizado com sucesso.";
    }else if($acao == "Deletar"){    
        $manipula->delProduto($id);
        $_SESSION['jsAlert'] = "Produto deletado com sucesso.";
        
    }else if($acao == "Deletar perfil"){    
        $manipula->delUserById($idloja);
        $_SESSION['jsAlert'] = "Loja deletado com sucesso.";
        header("Location: http://localhost/aula6/adm/sair.php");
        exit();
        
    }else if($acao == "Salvar perfil"){
        $img_name = $_FILES['imgPerfil']['name'];
        $manipula->updateLoja($nomeloja, $descricaoloja, $idloja);

        if(!empty($img_name)) { 
            $manipula->updatetImgPerfil("img/lojas/".$img_name, $idloja);
            $url_local_salvo = "../img/lojas/".converte($img_name);
            move_uploaded_file($_FILES['imgPerfil']['tmp_name'], $url_local_salvo);
        }
        
        $_SESSION['jsAlert'] = "Nome e/ou descrição atualizado(s) com sucesso.";
    }

    header("Location: http://localhost/aula6/?secao=userloja");
    exit();
?>