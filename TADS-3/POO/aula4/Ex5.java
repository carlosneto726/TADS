/* @author 20201070130191 */

import java.util.Scanner;
public class Ex5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Digite o Salário: ");
        double salario = in.nextDouble();
        
        System.out.print("Digite o Reajuste: ");
        double reajuste = in.nextDouble();
        
        double percentual = 0;
        double acrecimo = 0;
        double nSalario = 0;
        
        if (salario <= 280){
            percentual = 20;
            acrecimo = (percentual * 280)/ 100;
            
        }else if(salario > 280 && salario <= 700){
            percentual = 15;
            acrecimo = (percentual * 280)/ 100;
            
        }else if(salario > 700 && salario <= 1500){
            percentual = 10;
            acrecimo = (percentual * 280)/ 100;
            
        }else if(salario > 1500){
            percentual = 5;
            acrecimo = (percentual * 1500) / 100;
        }
        
        System.out.println("Salario antes do reajuste: " + salario);
        System.out.println("Percentual de aumento aplicado: " + percentual);
        System.out.println("Valor do aumento: " + acrecimo);
        nSalario = salario + acrecimo;
        System.out.println("Novo salario: " + nSalario);
    }
}