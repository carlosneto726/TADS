package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico10 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int casos = in.nextInt();
        String[][] jogadas = new String[casos][2];
        boolean res = false;

        for(int i = 0; i < casos; i++){
            for(int j = 0; j < 2; j++){
                jogadas[i][j] = in.next();
            }
        }

        for(int a = 0; a < jogadas.length; a++){
            if((jogadas[a][0].equals("pedra")  && jogadas[a][1].equals("papel")) || (jogadas[a][0].equals("pedra") && jogadas[a][1].equals("Spock"))){
                System.out.println("Caso #"+ (a+1) +": Raj trapaceou!");

            }else if((jogadas[a][0].equals("papel") && jogadas[a][1].equals("tesoura")) || (jogadas[a][0].equals("papel") && jogadas[a][1].equals("lagarto"))){
                System.out.println("Caso #"+ (a+1) +": Raj trapaceou!");

            }else if((jogadas[a][0].equals("tesoura") && jogadas[a][1].equals("Spock")) || (jogadas[a][0].equals("tesoura") && jogadas[a][1].equals("pedra"))){
                System.out.println("Caso #"+ (a+1) +": Raj trapaceou!");

            }else if((jogadas[a][0].equals("lagarto") && jogadas[a][1].equals("pedra")) || (jogadas[a][0].equals("lagarto") && jogadas[a][1].equals("tesoura"))){
                System.out.println("Caso #"+ (a+1) +": Raj trapaceou!");

            }else if((jogadas[a][0].equals("Spock") && jogadas[a][1].equals("lagarto")) || (jogadas[a][0].equals("Spock") && jogadas[a][1].equals("papel"))){
                System.out.println("Caso #"+ (a+1) +": Raj trapaceou!");

            }else if(jogadas[a][0].equals(jogadas[a][1])){
                System.out.println("Caso #"+ (a+1) +": De novo!");
            }else{
                System.out.println("Caso #"+ (a+1) +": Bazinga!");
            }
        }
    }
}