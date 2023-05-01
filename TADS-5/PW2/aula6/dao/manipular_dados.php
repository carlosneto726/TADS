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

    public function getFabricantePorNome($nome){
        $this->sql = "SELECT tb_lojas.nome from tb_lojas INNER JOIN tb_produtos ON tb_lojas.id = tb_produtos.id_loja AND tb_produtos.nome = '".$nome."'";

        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;

    }


    public function getProdutosPorLoja($loja_id){
        $this->sql = "SELECT tb_produtos.nome, tb_produtos.preco, tb_produtos.id, tb_produtos.img_path, tb_produtos.cavalos, tb_produtos.zeroacem, tb_produtos.velocidade, tb_produtos.quantidade FROM tb_produtos
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
    public function getProdutoByEmail($email){
        $this->sql = "SELECT tb_produtos.nome, tb_produtos.preco, tb_produtos.id, tb_produtos.img_path, tb_produtos.cavalos, tb_produtos.zeroacem, tb_produtos.velocidade, tb_produtos.quantidade FROM tb_produtos INNER JOIN tb_lojas INNER JOIN tb_users ON tb_produtos.id_loja = tb_lojas.id AND tb_lojas.id_user = tb_users.id AND tb_users.email =  '".$email."';";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }
        return $listaresp;

    }

    public function getLojaIdByEmail($email){
        $this->sql = "SELECT tb_lojas.id, tb_lojas.nome, tb_lojas.descricao, tb_lojas.img_path FROM tb_lojas INNER JOIN tb_users ON tb_users.id = tb_lojas.id_user AND tb_users.email = '".$email."';";
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

    public function delUserById($id){
        $this->sql = "DELETE FROM tb_users WHERE tb_users.id = $id";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updateProduto($nome, $preco, $id, $velocidade, $cavalos, $zeroacem, $quantidade){
        $this->sql = "UPDATE tb_produtos SET nome = '".$nome."', preco = '".$preco."', velocidade = '".$velocidade."', cavalos = '".$cavalos."', zeroacem = '".$zeroacem."', quantidade = '".$quantidade."' WHERE id = $id;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updatetImg($img_path, $id){
        $this->sql = "UPDATE tb_produtos SET img_path = '".$img_path."' WHERE tb_produtos.id = $id;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updatetImgPerfil($img_path, $id){
        $this->sql = "UPDATE tb_lojas SET img_path = '".$img_path."' WHERE tb_lojas.id = $id;";
        $this->qr = self::exeSQL($this->sql);
    }

    public function updateLoja($nome, $descricao, $id){
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


    public function validarLogin($email, $senha){

        $this->sql = "SELECT * FROM tb_users WHERE email ='$email' and passw ='$senha'";
        $this->qr = self::exeSQL($this->sql);
        $linhas = @mysqli_num_rows($this->qr);
        return $linhas;
    }

    public function validarEmail($email){

        $this->sql = "SELECT * FROM tb_users WHERE email ='$email'";
        $this->qr = self::exeSQL($this->sql);
        $linhas = @mysqli_num_rows($this->qr);
        return $linhas;
    }
    public function validarNomeLoja($nomeloja){

        $this->sql = "SELECT * FROM tb_lojas WHERE nome ='$nomeloja'";
        $this->qr = self::exeSQL($this->sql);
        $linhas = @mysqli_num_rows($this->qr);
        return $linhas;
    }

    public function getProdutoOrderByPreco(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.preco DESC;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }
    public function getProdutoOrderByLoja(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.id_loja;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }

    public function getProdutoOrderByVelocidade(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.velocidade DESC;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }

    public function getProdutoOrderByAlfabeto(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.nome;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }


    public function getProdutoOrderByCavalos(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.cavalos DESC;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }


    public function getProdutoOrderByZeroACem(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.zeroacem;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }
    public function getProdutoOrderByQuantidade(){
        $this->sql = "SELECT * FROM tb_produtos ORDER BY tb_produtos.quantidade DESC;";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }


    public function procura($nome){
        $this->sql = "SELECT tb_produtos.id FROM tb_produtos WHERE nome LIKE '%".$nome."%';";
        $this->qr = self::exeSQL($this->sql);

        $listaresp = array();

        while($row = @mysqli_fetch_assoc($this->qr)){
            array_push($listaresp, $row);
        }

        return $listaresp;

    }

}
    
?>