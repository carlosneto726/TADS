package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico3 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int x[] = new int[10];

        for(int c = 0; c < x.length; c++){
            x[c] = in.nextInt();
            
            if(x[c] <= 0){ // Trocando todos o valores menores que 0 para 1.
                x[c] = 1;
            }
        }

        for(int i = 0; i < x.length; i++){ // Varrendo o vetor x e imprindo os seus números.
            System.out.println("X["+ i +"] = "+ x[i]);

        }

    }
}