import java.util.Scanner;

/** @author carlos **/

public class Ex03{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int c;
		System.out.print("Digite um número para a tabuada: ");
		int numero = input.nextInt();

		for(c = 1; c < 11; c++){
			System.out.println(numero + " X " + c + " = " + numero * c);
		}

	}
}