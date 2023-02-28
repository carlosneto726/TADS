/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.crud;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;

/**
 *
 * @author thiag
 */
public class Conexao {

    // string URL padrão
    // endereço: localhost
    // base de dados: mtp
    private String url = "jdbc:postgresql://localhost/CrudMelhorado";

    // usuário do postgres
    private String usuario = "postgres";

    // senha do postgres
    private String senha = "postgres";

    // variável que guarda a conexão
    private Connection conn;

    /**
     * Método construtor.
     *
     * Toda vez que instanciar essa classe, a conexão é automaticamente feita
     */
    public Conexao() {
        conectar();
    }

    /**
     * Método para conexão com o banco de dados.
     *
     * Carrega o driver e cria a conexão com o BD.
     */
    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (ClassNotFoundException e1) {
            e1.printStackTrace();
        }

        Properties props = new Properties();
        props.setProperty("user", this.usuario);
        props.setProperty("password", this.senha);

        try {
            this.conn = DriverManager.getConnection(this.url, props);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Método que retorna a conexão feita com o BD
     *
     * @return um objeto Connection que é a conexão feita com o BD
     */
    public Connection getConnection() {
        return this.conn;
    }

    public Boolean inserir(String texto) {
        int retorno = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO pessoa (nome) VALUES (?)");
            st.setString(1, texto);
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno != 0;
    }
    
    public Boolean atualizar(int id, String valor) {
        int retorno = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE pessoa SET nome = ? WHERE id = ?");
            st.setString(1, valor);
            st.setInt(2, id);
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno != 0;
    }
    
    public Boolean excluir(int id) {
        int retorno = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("DELETE FROM pessoa WHERE id = ?");
            st.setInt(1, id);
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return retorno != 0;
    }
    
    public ArrayList<Pessoa> listarPessoas() {
        ArrayList<Pessoa> lista = new ArrayList<>();
        
        try {
            PreparedStatement st = this.conn.prepareStatement("select * from pessoa order by id");
            
            ResultSet rs = st.executeQuery();            
            while (rs.next()) {
                Pessoa pessoa = new Pessoa();
                pessoa.setId(rs.getInt(1));
                pessoa.setNome(rs.getString(2));
                
                pessoa.setCheck(rs.getString(4));
               
                lista.add(pessoa);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return lista;
    }

}
