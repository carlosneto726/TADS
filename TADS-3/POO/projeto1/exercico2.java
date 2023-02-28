package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();   
        int vetor[] = new int[n];
        int c;

        for(c = 0; c < n; c++){
            vetor[c] = in.nextInt();
        }

        int i = 0;

        for(int indice : vetor){
            if(vetor[i] < 0){
                System.out.println(indice);
            }
            i++;
        }

    }
}