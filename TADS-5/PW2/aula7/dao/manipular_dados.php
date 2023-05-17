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


    public function getProdutosPorCategoria($categoria){
        $this->sql = "SELECT * FROM $this->table WHERE categoria = '".$categoria."';";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        
        return $listaresp;
    }

    public function getProdutosPorID($id){
        $this->sql = "SELECT * FROM tb_produtos WHERE id = $id;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        
        return $listaresp;
    }

    public function getLojaByProdutoID($id){
        $this->sql = "SELECT * FROM tb_lojas WHERE id = $id;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        
        return $listaresp;
    }


    public function validarLogin($email, $senha){

        $this->sql = "SELECT * FROM tb_usuarios WHERE email ='$email' and senha ='$senha'";
        $this->qr = self::exeSQL($this->sql);
        $linhas = @mysqli_num_rows($this->qr);
        return $linhas;
    }


    public function getCarrinho($id){

        $this->sql = "SELECT * FROM tb_carrinho WHERE id_usuario = $id";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        
        return $listaresp;
    }



    public function dellProdutoCarrinho($id_carrinho){
        $this->sql = "DELETE FROM tb_carrinho WHERE id = $id_carrinho;";
        $this->qr = self::exeSQL($this->sql);
    }



    public function getIdByEmail($email){

        $this->sql = "SELECT * FROM tb_usuarios WHERE email = '".$email."'";
        $this->qr = self::exeSQL($this->sql);
        
        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        
        return $listaresp;
    }



}
    
?>