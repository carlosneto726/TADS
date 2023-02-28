import java.util.Scanner;

/** @author carlos **/

public class Ex4 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Digite a altura: ");
    double altura = input.nextDouble();
    

    double pesoIdeal = (72.7 * altura) - 58;
    
    System.out.println("O seu peso ideal e " + pesoIdeal);
    
    }
    
}
