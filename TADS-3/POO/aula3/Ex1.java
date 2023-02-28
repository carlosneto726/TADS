import java.util.Scanner;

/** @author carlos **/
public class Ex1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);



        System.out.print("Digite a nota 1: ");
        double n1 = input.nextDouble();
        
        System.out.print("Digite a nota 2: ");
        double n2 = input.nextDouble();
                
        System.out.print("Digite a nota 3: ");
        double n3 = input.nextDouble();
        
        System.out.print("Digite a nota 4: ");
        double n4 = input.nextDouble();
        
        double media = (n1 + n2 + n3 + n4 ) / 4;
                
        System.out.println("A media das notas e " + media);

        
    }
}
