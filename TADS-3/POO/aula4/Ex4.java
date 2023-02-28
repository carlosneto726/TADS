/* @author 20201070130191 */

import java.util.Scanner;
public class Ex4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite um número: ");
        double n1 = in.nextInt();
        
        System.out.print("Digite outro número: ");
        double n2 = in.nextInt();
        
        System.out.print("Digite mais um número: ");
        double n3 = in.nextInt();
        
        double maior = 0;
        double menor = 0;
        
        if (n1 > n2 && n1 > n3){
            maior = n1;
            if (n2 > n3){
                menor = n3;
            }else{
                menor = n2;
            }
            
        }else if (n2 > n1 && n2 > n3){
            maior = n2;
            
            if (n1 > n3){
                menor = n3;
            }else{
                menor = n1;
            }
            
        }else if (n3 > n1 && n3 > n2){
            maior = n3;
            
            if (n2 > n1){
                menor = n1;
            }else{
                menor = n2;
            }
        }
        
        System.out.println("O maior é " + maior + " e o menor é " + menor);
        
        
    }
}