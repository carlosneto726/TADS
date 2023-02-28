package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico1 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int c = 0;
        double media = 0;
        double idade = 0;
        double idadeAux = 0;
        boolean negIdade = false;

        while(true){
            idadeAux = in.nextInt();
            idade += idadeAux; // Somando todas as idades.

            if(idadeAux < 0 && c == 0){ // Conferindo se a idade é menor ou igual a 0.
                System.out.println("impossivel calcular");
                negIdade = true;
                break;

            }else if (idadeAux < 0){
                break;
            }

            c++;
            media = idade / c;
        }
        if (negIdade ==  false){
        System.out.println(String.format("%.2f", media));
        }

    }
}
