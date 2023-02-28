package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        double nota = 0;
        double media = 0;
        int x = 0;

        while(x != 2){

            for(int i = 0; i < 2; i++){ // Para ler 2 notas.
                while(true){ // Enquanto a nota for inválida.
                    nota = in.nextDouble();

                    if(nota > 10 || nota < 0){ // Conferindo se a nota é válida.
                        System.out.println("nota invalida");
                    }else{
                        break;
                    }
                }
                media += nota;
            }

            System.out.println(String.format("media = %.2f", (media / 2)));

            while(x > 2 || x < 1){ // Enquanto x for invalido.
                System.out.println("novo calculo (1-sim 2-nao)"); // Conferindo se o usuário quer um novo cálculo.
                x = in.nextInt();
            }

            if(x == 1){ // Resetando as variáveis caso o usuário queira um novo cálculo.
                media = 0;
                x = 0;
            }

        }
    }
}