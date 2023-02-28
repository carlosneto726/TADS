package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico5 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        while(true){
            int numero = in.nextInt();
            if (numero == 0){
                break;
            }
            System.out.println(String.format("%.0f", Math.pow(numero, 2)));
        }
    }
}