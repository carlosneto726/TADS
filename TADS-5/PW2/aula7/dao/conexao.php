<?php
class conexao{
    protected $host, $user, $pass, $dba, $conn, $sql, $qr, $data, $status, $totalFields, $error;
    public function __construct(){
        $this->host = "localhost";
        $this->user = "root";
        $this->pass = "";
        $this->dba = "db_amazonclone";

        self::connect();

        // echo "<h2>Conectado com o banco de dados com sucesso!!!</h2>";
    }
    public function connect(){
        $this->conn = @mysqli_connect($this->host, $this->user, $this->pass) or die("<ins><center>Erro ao conectar ao banco de dados.</ins></center>".mysqli_error(self::connect()));

        $this->dba = @mysqli_select_db($this->conn, $this->dba) or die("<ins><center>Erro na conexao do banco de dados.</ins></center>".mysqli_error(self::connect()));

        mysqli_set_charset($this->conn, "utf8");

        return $this->conn;
    }
    public function exeSQL($sql){
        $this->qr = @mysqli_query($this->conn, $sql) or die("<ins><center>Erro ao executar a query.</ins></center>".mysqli_error(self::connect()));

        return $this->qr;
    }

    public function listQr($qr){
        $this->data = @mysqli_fetch_assoc($qr);

        return $this->data;

    }

    protected function countData($qr){
        
    }
}
?>