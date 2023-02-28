import java.util.Scanner;

/** @author carlos **/

public class Ex06{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de números: ");
		int qtdN = input.nextInt();
		int c;
		double n = 0;
		for (c = 1; c <= qtdN; c++){
			System.out.print("Digite o " + c + "ª numero: ");
			n += input.nextDouble();
		}
		System.out.println("A soma dos numeros é: " + n);

	}
}