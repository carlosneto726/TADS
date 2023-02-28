import java.util.Scanner;

/** @author carlos **/

public class Ex01{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true){
            System.out.print("Digite um número de 0 a 10: ");
            int numero = input.nextInt();

            if (numero > 10 || numero < 0){
                System.out.print("Erro, digite um valor válido.");
            }else{
                break;
            }
        }        
    }    
}
