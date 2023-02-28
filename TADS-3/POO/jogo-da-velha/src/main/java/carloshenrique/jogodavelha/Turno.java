package carloshenrique.jogodavelha;
import javax.swing.JOptionPane;
/**** @author CarlosH ****/
public class Turno {                
    int count;
    String visor;

    public String getTurno() {
        
        if(count < 9){ // Caso o numero de jogadas for menor que 9 (Total de jogadas).
            count+=1;            
        }else{ // Se nao, retornar nada.
            return "";
        }
        
        if(count >= 9 ){ // Caso o numero de jogadas for maior igual a 9 deu velha.
            JOptionPane.showMessageDialog(null, "Deu Velha!");
        }
        
        if(count % 2 == 1){ // Caso a jogada for impar a jogada da vez é X.
            return "X";
        }else if(count % 2 == 0){ // Caso a jogada for par a jogada da vez é O.
            return "O";
        }
            
        return "";
    }

    public void setTurno(int count) {
        this.count = count;
    }
    
    
    public void setVisor(String visor){
        this.visor = visor;
    }
    public String getVisor(){ // Metodo para saber qual letra imprimir no visor.      
        if(visor.equals("X")){
            return "O";
        }else if(visor.equals("O")){
            return "X";
        }            
        return "";
        
    }
}
