/* @author 20201070130191 */

import java.util.Scanner;
public class Ex3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite a nota 1: ");
        double n1 = in.nextInt();
        
        System.out.print("Digite nota 2: ");
        double n2 = in.nextInt();
        
        double media = (n1 + n2) / 2;
        
        if (media >= 7){
            System.out.println("Aprovado.");
        }else if(media < 7){
            System.out.println("Reprovado.");
        }else if(media == 10){
            System.out.println("Aprovado com Distinção.");
        }
        
        
        
    }
}
