package carloshenrique.jogodavelha;

import javax.swing.JOptionPane;

/**** @author CarlosH ****/
public class JogoDaVelha {
    public static void main(String[] args){
        Mesa ms = new Mesa();
        
    }
    
    String[][] matriz = new String[3][3];
    String x = "";
    String o = "";
    
    public void getJpane(String a){
        JOptionPane.showMessageDialog(null, "O Jogador "+ a +" Venceu!");

    }
    
    public String[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(String[][] matriz) {
        this.matriz = matriz;
    }
    
    public void getVencedor(){             
        String[] players = new String[2];
        players[0] = "X";
        players[1] = "O";
        
        for(int i = 0; i < 2; i ++){ // Conferindo todas as possibilidades de vitoria.
            
            if(players[i].equals(matriz[0][0]) && players[i].equals(matriz[0][1]) && players[i].equals(matriz[0][2])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[1][0]) && players[i].equals(matriz[1][1]) && players[i].equals(matriz[1][2])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[2][0]) && players[i].equals(matriz[2][1]) && players[i].equals(matriz[2][2])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[0][0]) && players[i].equals(matriz[1][0]) && players[i].equals(matriz[2][0])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[0][1]) && players[i].equals(matriz[1][1]) && players[i].equals(matriz[2][1])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[0][2]) && players[i].equals(matriz[1][2]) && players[i].equals(matriz[2][2])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[0][0]) && players[i].equals(matriz[1][1]) && players[i].equals(matriz[2][2])){
                getJpane(players[i]);
            }
            if(players[i].equals(matriz[0][2]) && players[i].equals(matriz[1][1]) && players[i].equals(matriz[2][0])){
                getJpane(players[i]);
            }                      
        }
    }
}
        
        
//================================= Versao 1.0 =================================
//package jogo.da.velha;
//
//import javax.swing.JOptionPane;
//
///**** @author CarlosH ****/
//public class JogoDaVelha {
//    
//    String[][] matriz = new String[3][3];
//    String x = "";
//    String o = "";
//      
//    
//    public String[][] getMatriz() {
//        return matriz;
//    }
//
//    public void setMatriz(String[][] matriz) {
//        this.matriz = matriz;
//    }
//    
//    public void getVencedor(){             
//        String[] players = new String[2];
//        players[0] = "X";
//        players[0] = "O";
//            
//        
//        String[] poss = new String[8];
//        // Atribuindo a um vetor a concatenaçao dos indicies de todas as
//        // possiveis vitorias na horizontal, vertical e diagonal.
//        // |X|O|X| |00|01|02|
//        // |-|X|-| |10|11|12|
//        // |O|O|X| |20|21|22|
//        // Horizontal       
//        poss[0] = "000102"; 
//        poss[1] = "101112";
//        poss[2] = "202122";
//        // Vertical
//        poss[3] = "001020";
//        poss[4] = "011121";
//        poss[5] = "021222";
//        // Diagonal
//        poss[6] = "001122";
//        poss[7] = "021120";
// 
//        
//        for(int linha = 0; linha < matriz.length; linha++){ // Para cada linha bna matriz.
//            for(int coluna = 0; coluna < matriz[linha].length; coluna++){ // Para cada coluna em matriz.
//                if(matriz[linha][coluna].equals("X")){ // Conferindo se a jogada foi um X.
//                    x = x + Integer.toString(linha) + Integer.toString(coluna);
//                    System.out.println("X "+x);
//                    
//                }else if(matriz[linha][coluna].equals("O")){ // Conferindo se a jogada foi um O.
//                    o = o + Integer.toString(linha) + Integer.toString(coluna);
//                    System.out.println("O "+o);
//                }
//            }
//        }
//        
//        for(int j = 0; j < poss.length; j++){ // Procurando em todas as possibilidades.
//            if(poss[j].equals(x)){ // X vence caso for igual á alguma possibilidade.
//                JOptionPane.showMessageDialog(null, "O Jogador X Venceu!");
//            }else if(poss[j].equals(o)){// O vence caso for igual á alguma possibilidade.
//                JOptionPane.showMessageDialog(null, "O Jogador O Venceu!");
//            }
//        }
//    }
//}
