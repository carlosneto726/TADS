/* @author 20201070130191 */

import java.util.Scanner;
public class Ex2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite um número: ");
        double n = in.nextInt();
        if (n > 0){
            System.out.println(n + " é Positivo.");
        }else{
            System.out.println(n + " é Negativo.");
        }
        
    }
}