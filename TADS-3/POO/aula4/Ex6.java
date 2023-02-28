/* @author 20201070130191 */

import java.util.Scanner;
public class Ex6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Reponda com 1 para sim e 0 para não.");
        System.out.print("Telefonou para a vítima?: ");
        int p1 = in.nextInt();
        
        System.out.print("Esteve no local do crime?: ");
        int p2 = in.nextInt();
        
        System.out.print("Mora perto da vítima?: ");
        int p3 = in.nextInt();
        
        System.out.print("Devia para a vítima?: ");
        int p4 = in.nextInt();
        
        System.out.print("Já trabalhou com a vítima?: ");
        int p5 = in.nextInt();

        int c = p1 + p2 + p3 + p4 + p5;
        
        if(c == 2){
            System.out.println("SUSPEITO.");
        }else if (c <= 4){
            System.out.println("CUMPLICE.");
        }else if (c == 6){
            System.out.println("ASSASINO.");
        }else{
            System.out.println("INOCENTE.");
        }
        
        
        
        
    }
}