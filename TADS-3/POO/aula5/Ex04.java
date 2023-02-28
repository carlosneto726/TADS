import java.util.Scanner;

/** @author carlos **/

public class Ex04{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);		
		
		System.out.print("Digite a quantidade de notas: ");
		int nNota = input.nextInt();
		int c;
		double nota = 0;

		for(c = 1; c <= nNota; c++){
			System.out.print("Digite a " + c + "ª nota: ");
			nota += input.nextDouble();
		}

		double media = nota / nNota;
		System.out.print("\nSua Média é: " + media);

	}
}
