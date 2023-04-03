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
}
?>