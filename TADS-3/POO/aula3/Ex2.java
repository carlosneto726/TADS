import java.util.Scanner;

/** @author carlos **/
public class Ex2 {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em graus Fahrenheit: ");
        double f = input.nextDouble();
        double c = (5 * (f-32) / 9);
        
        System.out.println("a temperatura " + f + " em graus celcius e " + c);
        
        }
}
