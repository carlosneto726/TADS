import java.util.Scanner;

/** @author carlos **/
public class Ex3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite um numero: ");
        int n1 = input.nextInt();
        
        System.out.print("Digite outro numero: ");
        int n2 = input.nextInt();
        
        System.out.print("Digite main um numero: ");
        double n3 = input.nextDouble();
        
        
        double a = (n1 * 2) * (n2 / 2);
        System.out.println("o produto do dobro do primeiro com metade do segundo: " + a);
        
        double b = (n1 * 3) + n3;
        System.out.println("a soma do triplo do primeiro com o terceiro: " + b);
        
        double c = Math.pow(n3, 3);
        System.out.println("o terceiro elevado ao cubo: " +c);
        
    }
}
