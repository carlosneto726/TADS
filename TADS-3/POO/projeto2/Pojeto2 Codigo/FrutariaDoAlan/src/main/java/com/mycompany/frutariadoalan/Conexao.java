
package com.mycompany.frutariadoalan;

/**** @author CarlosH & PedroH ****/

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import javax.swing.JOptionPane;

public class Conexao {   
    private String url = "jdbc:postgresql://localhost/frutaria_do_alan"; // base de dados: novaFrutaria    
    private String usuario = "postgres"; // usuário do postgres    
    private String senha = "postgres"; // senha do postgres
    private Connection conn;
    
    public Conexao() {
        conectar();
    }
    // Metodo para conectar com o banco de dados.
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
    public Connection getConnection() {
        return this.conn;
    }
    // Metodo para inserir frutas no ganco de dados.
    public void inserirFrutas(String nome, double valor, int quantidade, String tempo) {
        try {
            // Consulta no pgsql.
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO frutas (nome, valor_unitario, quantidade, tempo) VALUES (?, ?, ?, ?);");
            //Definindo os valores das "?" para a consulta.
            st.setString(1, nome);
            st.setDouble(2, valor);            
            st.setInt(3, quantidade);
            st.setString(4, tempo);
            // Executando a consulta.
            st.executeUpdate();
            // Fechando a consulta.
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
    }
    // Metodo para remover frutas.
    public void removerFrutas(String codigo){
        try{
            // Consulta no pgsql.
            PreparedStatement st = this.conn.prepareStatement("DELETE FROM frutas WHERE codigo = ?"); 
            //Definindo os valores das "?" para a consulta.
            st.setString(1, codigo);
            st.executeUpdate();
            st.close();                
        } catch (SQLException e){
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
    }
    // Metodo para atualizar as frutas.
    public void atualizarFrutas(String nome, double valorUnitario, int quantidade, String tempo, String codigo) {
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE frutas SET nome = ?, valor_unitario = ?, quantidade = ?, tempo = ? WHERE codigo = ?");     
            //Definindo os valores das "?" para a consulta.
            st.setString(1, nome);
            st.setDouble(2, valorUnitario);
            st.setInt(3, quantidade);
            st.setString(4, tempo);
            st.setString(5, codigo);                        
            st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
    }
    // Metodo para litar as frutas.
    // Retorna um lista com todas as frutas na tabela frutas.
    public ArrayList<Frutas> listarFrutas() {
        ArrayList<Frutas> lista = new ArrayList<>();
        try {            
            // Consulta no pgsql.
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM frutas");       
            // Resultado da consulta.
            ResultSet rs = st.executeQuery();
            // Para cada linha no resultado da consulta.
            while (rs.next()) {
                Frutas frutas = new Frutas(); // Nova Fruta.               
                frutas.setNome(rs.getString(1)); // Pegando a 1 coluna da consulta e definindo o nome da fruta.
                frutas.setValorUnitario(rs.getDouble(2)); // Pegando a 2 coluna da consulta e definindo o valor.           
                frutas.setQtd(rs.getInt(3)); // Pegando a 3 coluna da consulta e definindo a quantidade.                
                String[] tempo = rs.getString(4).split("/"); // Pegando a data e separando por /.                
                frutas.setDias(Integer.parseInt(tempo[0])); // Transformando o 1 tempo em dias e definindo como dias.
                frutas.setMeses(Integer.parseInt(tempo[1])); // Transformando o 2 tempo em meses e definindo como meses.
                frutas.setAnos(Integer.parseInt(tempo[2])); // Transformando o 3 tempo em anos e definindo como anos.
                frutas.setCodigo(rs.getString(5)); // Pegando o codigo e definindo na fruta.               
                lista.add(frutas); // Adicionando a fruta na lista.
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }        
        return lista;
    }
    // Pegando o codigo da fruta pelo o nome no banco de dados.
    public String getCodigoFruta(String nome) {        
        String codigo = "Nao exite";
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT codigo FROM frutas WHERE nome = ?");         
            st.setString(1, nome);
            ResultSet rs = st.executeQuery();       
            while (rs.next()) {
                codigo = rs.getString(1);
            }            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
        return codigo;
    }         
    // Pegando o nome da fruta pelo o codigo no banco de dados.
    public String getNomeFruta(String codigo) {        
        String nome = "";        
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT valor_unitario FROM frutas WHERE nome = ?");         
            st.setString(1, codigo);
            ResultSet rs = st.executeQuery();       
            
            while (rs.next()) {
                nome = rs.getString(1);
            }             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }        
        return nome;
    }        
    // Pegando o valor da fruta pelo o nome no banco de dados.
    public double getValorFruta(String nome) {        
        double codigo = 0;        
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT valor_unitario FROM frutas WHERE nome = ?");         
            st.setString(1, nome);
            ResultSet rs = st.executeQuery();                   
            while (rs.next()) {
                codigo = rs.getDouble(1);
            }             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }        
        return codigo;
    }   
    // Pega a quanridade de fruta pelo o codigo da fruta no banco de dados.
    public int getQuantidadeFruta(String codigo) {        
        int qtd = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT quantidade FROM frutas WHERE codigo = ?");         
            st.setString(1, codigo);
            ResultSet rs = st.executeQuery();                   
            while (rs.next()) {
                qtd = rs.getInt(1);
            }             
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }        
        return qtd;
    }
    // Metodo para inserir frutas no carrinho.
    public Boolean inserirFrutasCarrinho(String nome, int quantidade) {
        // Caso a quantidade do estoque menos a quantidade do pedido for menor que 0.
        if(getQuantidadeFruta(getCodigoFruta(nome)) - quantidade < 0){
            JOptionPane.showMessageDialog(null, "Nao temos "+ quantidade +" de "+ nome +"s"+" insira mais no estoque.");
            return false;
        }        
        int retorno = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("INSERT INTO compras (nomeFruta, quantidade, codigoFruta, valor_unitario) VALUES (?, ?, ?, ?);");
            // Pegando o codigo e o valor da fruta com o nome.
            String codigoFruta = getCodigoFruta(nome);
            double valor_unitario = getValorFruta(nome);            
            st.setString(1, nome);
            st.setDouble(2, quantidade);            
            st.setString(3, codigoFruta);
            st.setDouble(4, valor_unitario);   
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao temos "+ quantidade +" de "+ nome +"s"+" insira mais no estoque.");
        }
        return retorno != 0;
    }
    // Metodo para listar o carrinho.
    public ArrayList<Frutas> listarCarrinho() {
        ArrayList<Frutas> lista = new ArrayList<>();        
        try {
            PreparedStatement st = this.conn.prepareStatement("SELECT * FROM compras");
            // Resultado da consulta.
            ResultSet rs = st.executeQuery();            
            while (rs.next()) {
                Frutas frutas = new Frutas();                
                frutas.setNome(rs.getString(1));       
                frutas.setQtd(rs.getInt(2));
                frutas.setValorUnitario(rs.getDouble(3)); 
                frutas.setCodigo(rs.getString(4));
                lista.add(frutas);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
        return lista;
    }
    // Metodo para atualizar o carrinho.
    public Boolean atualizarCarrinho(String nome, int quantidade, String codigo) {
        int retorno = 0;
        try {
            PreparedStatement st = this.conn.prepareStatement("UPDATE compras SET nome = ?, quantidade = ? WHERE codigo = ?");            
            st.setString(1, nome);
            st.setInt(2, quantidade);
            st.setString(3, codigo);                        
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Nao foi possivel completar essa operaçao, tente novamente.");
        }
        return retorno != 0;
    }
    // Metodo para remover uma fruta do carrinho.
    public Boolean removerFrutaDoCarrinho(String codigo){
        int retorno = 0;
        try{
            PreparedStatement st = this.conn.prepareStatement("DELETE FROM compras WHERE codigoFruta = ?"); 
            st.setString(1, codigo);
            retorno = st.executeUpdate();
            st.close();                
        } catch (SQLException e){
            e.printStackTrace();
        }
        return retorno != 0;
    }
    // Metodo para removert todas as frutas do carrinho.
    public Boolean removerFrutasDoCarrinho(){
        int retorno = 0;
        try{
            PreparedStatement st = this.conn.prepareStatement("TRUNCATE TABLE compras;");             
            retorno = st.executeUpdate();
            st.close();                
        } catch (SQLException e){
            e.printStackTrace();
        }
        return retorno != 0;
    }
    // Metodo para atualizar o estoque.
    public Boolean atualizarEstoque(int quantidade, String codigo){
        int retorno = 0;
        // Pegando a quantidade pelo o codigo.
        int quantidadeEstoque = getQuantidadeFruta(codigo);        
        if((quantidadeEstoque - quantidade) < 0){ // Caso a quantidade do estoque menos a quantidade desejada for menor que 0.
            JOptionPane.showMessageDialog(null, "Acabou as " + getNomeFruta(codigo) + " Reponha o estoque!");
        }        
        try{
            PreparedStatement st = this.conn.prepareStatement("UPDATE frutas SET quantidade = ? WHERE codigo = ?;");
            st.setInt(1, (quantidadeEstoque - quantidade));
            st.setString(2, codigo);
            retorno = st.executeUpdate();
            st.close();
        } catch (SQLException e){
            e.printStackTrace();
        }
        return retorno != 0;
    }
}
