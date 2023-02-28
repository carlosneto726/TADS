/* @author 20201070130191 */

import java.util.Scanner;
public class Ex1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n1 = in.nextInt();
        
        System.out.print("Digite outro número: ");
        double n2 = in.nextInt();
        
        if (n1 > n2){
            System.out.println(n1 + " é Maior que " + n2);
        }else{
            System.out.println(n2 + " é Maior que " + n1);
        }

        
        
    }
}