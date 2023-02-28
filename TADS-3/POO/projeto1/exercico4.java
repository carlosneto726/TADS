package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico4 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
            
        int[] n = new int[10];
        int valor = in.nextInt();


        for(int i = 0; i < n.length; i++){
            n[i] = valor;
            valor *= 2;

        }

        for(int c = 0; c < n.length; c++){ // Imprimindo todos os valores do vetor n.
            System.out.println("N["+ c +"] = "+ n[c]);
        }
    }
}
