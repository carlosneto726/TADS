import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um Número: ");
        int num1 = input.nextInt();
        System.out.println("Digite outro Número: ");
        int num2 = input.nextInt();

        int som = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("O que deseja fazer a seguir?\n1: Soma\n2: Subtração\n3: Multiplicação\n4: Divisão");
        int op = input.nextInt();

        switch (op) {
            case 1:
            System.out.printf("O Resultado Da soma %d + %d é de %d", num1, num2, som);
                break;

            case 2:
            System.out.printf("O Resultado Da subtração %d - %d é de %d", num1, num2, sub);
                break;

            case 3:
            System.out.printf("O Resultado Da multiplicação %d * %d é de %d", num1, num2, mul);
                break;

            case 4:
            System.out.printf("O Resultado Da divisão %d / %d é de %d", num1, num2, div);
                break;

            default:
                break;
        }

        input.close();
    }

}
