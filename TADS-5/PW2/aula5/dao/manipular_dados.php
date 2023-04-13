<?php

include_once("conexao.php");

class manipular_dados extends conexao{
    protected $table, $fields, $dados, $status, $fieldId, $valueId;

    public function setTable($tabela){
        $this->table = $tabela;
    }

    public function setFields($campos){
        $this->fields = $campos;
    }

    public function setFieldId($chavep){
        $this->fieldId = $chavep;
    }

    public function setValueId($valorchave){
        $this->valueId = $valorchave;
    }

    public function setDados($valores){
        $this->dados = $valores;
    }

    public function getStatus(){
        return $this->status;
    }

    public function insert(){
        $this->sql = "INSERT INTO $this->table($this->fields) VALUES ($this->dados);";

        if(self::exeSQL($this->sql)){
            $this->status = "Cadastro com sucesso";
        }else{
            $this->status = "Erro ao cadastrar".mysqli_error(self::connect());
        }
    }

    public function getAllDataTable(){
        $this->sql = "SELECT * FROM $this->table;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }

    public function getLojaPorNome($nome){
        $this->sql = "SELECT tb_lojas.nome from tb_lojas INNER JOIN tb_produtos ON tb_lojas.id = tb_produtos.id_loja AND tb_produtos.nome = '".$nome."'";

        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;

    }


    public function getProdutosPorLoja($loja_id){
        $this->sql = "SELECT tb_produtos.nome, tb_produtos.descricao, tb_produtos.preco FROM tb_produtos
        INNER JOIN tb_lojas ON tb_produtos.id_loja = tb_lojas.id AND tb_lojas.id = $loja_id;";

        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;
    }


    public function getProdutoById($id){
        $this->sql = "SELECT * FROM $this->table WHERE $id = tb_produtos.id;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;

    }

    public function getProdutoByUserId($id){
        $this->sql = "SELECT tb_produtos.nome, tb_produtos.descricao, tb_produtos.preco, tb_produtos.id, tb_produtos.img FROM tb_produtos INNER JOIN tb_lojas INNER JOIN tb_users ON tb_produtos.id_loja = tb_lojas.id AND tb_lojas.id_user = tb_users.id AND tb_users.id = $id;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;

    }


    public function getLojaIdByUserId($id){
        $this->sql = "SELECT tb_lojas.id, tb_lojas.nome, tb_lojas.descricao FROM tb_lojas INNER JOIN tb_users ON tb_users.id = tb_lojas.id_user AND tb_users.id = $id;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;
    }

    public function delProduto($id){
        $this->sql = "DELETE FROM tb_produtos WHERE tb_produtos.id = $id";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updateProduto($nome, $descricao, $preco, $id){
        $this->sql = "UPDATE tb_produtos SET nome = '".$nome."', descricao = '".$descricao."', preco = '".$preco."' WHERE id = $id;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updatetImg($imgContent, $id){
        $this->sql = "UPDATE tb_produtos SET img = '".$imgContent."' WHERE tb_produtos.id = $id;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updateLojaNomeDesc($nome, $descricao, $id){
        $this->sql = "UPDATE tb_lojas SET nome = '".$nome."', descricao = '".$descricao."' WHERE tb_lojas.id = $id ;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function getUserIdByEmail($email){
        $this->sql = "SELECT tb_users.id FROM tb_users WHERE tb_users.email = '".$email."'";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;
    }

}
    
?>