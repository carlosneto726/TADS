<?php
    include_once("../dao/manipular_dados.php");

    $manipula = new manipular_dados();
    session_start();

    $acao = @$_POST['acao'];
    $id = @$_POST['idproduto'];
    $nome = @$_POST['nome'];
    $descricao = @$_POST['descricao'];
    $preco = @$_POST['preco'];

    $nomeloja = @$_POST['nomeloja'];
    $descricaoloja = @$_POST['descricaoloja'];
    $idloja = $manipula->getLojaIdByUserId($_SESSION['userToken'])[0]['id'];

    if($acao == "Atualizar"){
        $manipula->updateProduto($nome, $descricao, $preco, $id);
        $status = 'error'; 
        if(!empty($_FILES["image"]["name"])) { 
            // Get file info 
            $fileName = basename($_FILES["image"]["name"]); 
            $fileType = pathinfo($fileName, PATHINFO_EXTENSION); 
            
            // Allow certain file formats 
            $allowTypes = array('jpg','png','jpeg','gif'); 
            if(in_array($fileType, $allowTypes)){ 
                $image = $_FILES['image']['tmp_name']; 
                $imgContent = addslashes(file_get_contents($image)); 
                $manipula->updatetImg($imgContent, $id);
            }else{ 
                $statusMsg = 'Sorry, only JPG, JPEG, PNG, & GIF files are allowed to upload.'; 
            } 
        }else{ 
            $statusMsg = 'Please select an image file to upload.'; 
        }
        $_SESSION['jsAlert'] = "Produto atualizado com sucesso.";
    }else if($acao == "Deletar"){    
        $manipula->delProduto($id);
        $_SESSION['jsAlert'] = "Produto deletado com sucesso.";
    }else if($acao == "Atualizar nome e descrição"){
        $manipula->updateLojaNomeDesc($nomeloja, $descricaoloja, $idloja);
        $_SESSION['jsAlert'] = "Nome e/ou descrição atualizado(s) com sucesso.";
    }

    header("Location: http://localhost/aula4/?secao=userloja");
    exit();
?>