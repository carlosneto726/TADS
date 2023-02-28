package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico6 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int alunos = in.nextInt();
        String notas = "";
        double media = 0;

        for(int i = 0; i < alunos; i++){ // Quantidade de alunos.
            for(int j = 0; j < 3; j++){ // 3 notas por aluno.
                notas = in.next();
                media += Double.parseDouble(notas);
            }
            System.out.println(String.format("%.2f", media));
            media = 0;
        }
    }
}
