import java.util.Scanner;
public class Ex01 {
 
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.printf("Digite a kilometragem percorrida: ");
        int km = input.nextInt();

        System.out.printf("Digite a litragem de gasolina consumida: ");
        int gas = input.nextInt();

        int consumo = km / gas;

        System.out.println(String.format("O consumo foi de %d Km/L", consumo));
        input.close();
    }
 
}