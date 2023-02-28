
package com.mycompany.frutariadoalan;
import java.time.LocalDateTime;

/**** @author CarlosH & PedroH ****/


/*
A Classe Frutas é um objeto que serve para representar a fruta no sistema
da frutaria, possuindo metodos e atributos.
*/

public class Frutas{
    
    // Declaraçao de váriaveis
    String nome;
    double valorUnitario;
    int qtd;    
    int dias;
    int meses;
    int anos;
    String codigo;
    LocalDateTime dataChegada = LocalDateTime.now(); // Data de chegada da fruta.
    
    public Frutas(){
    }

    public Frutas(String nome, double valorUnitario, int qtd, int dias, int meses, int anos, String codigo) {
        this.nome = nome;
        this.valorUnitario = valorUnitario;
        this.qtd = qtd;
        this.dias = dias;
        this.meses = meses;
        this.anos = anos;
        this.codigo = codigo;
    }            
    
    public String getValidade() { // Método para calcular a validade da fruta em tempo e nao em data.
        // Somando o as data atual com o tempo.
        int validadeDia = dataChegada.getDayOfMonth() + dias;
        int validadeMes = dataChegada.getMonthValue() + meses;        
        int validadeAno = dataChegada.getYear() + anos;
        while(true){
            if(validadeDia > 31){ // Caso a validade do dia utrapasse 31 (Dias em um mes).
                validadeDia -=31; // Subtraia 31 do dia.
                validadeMes++; // Acrescente 1 no mes.
            }
            if(validadeMes > 12){ // Caso a validade do mes utrapasse 12 (Meses no ano).
                validadeMes -= 12; // Subtraia 12 no mes.
                validadeAno++; // Acrescente 1 ao ano.
            }            
            if(validadeDia < 31 && validadeMes < 12){ // Caso o dia e a validade seja menor que 31 e 12 respectivamente.
                break;
            }            
        }        
        // Retornando a tada da validade formatada.
        return Integer.toString(validadeDia)+"/"+Integer.toString(validadeMes)+"/"+Integer.toString(validadeAno);
    }

    
    // Getters & Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    
    public double getValorUnitario() {
        return valorUnitario;
    }
    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    
    public int getQtd() {
        return qtd;
    }
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    
    public int getDias() {
        return dias;
    }
    public void setDias(int dias) {
        this.dias = dias;
    }

    
    public int getMeses() {
        return meses;
    }
    public void setMeses(int meses) {
        this.meses = meses;
    }

    
    public int getAnos() {
        return anos;
    }
    public void setAnos(int anos) {
        this.anos = anos;
    }

    
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
  
    
    @Override
    public String toString(){                
        return "\n====== Frutas ======\n" +
                "\nNome: " + getNome() +
                "\nValor: " + getValorUnitario() + 
                "\nQuantidade: " + getQtd() + 
                "\nData de Validade: " + getValidade() +
                "\n";
    }
}
