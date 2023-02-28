import java.util.Scanner;

/** @author carlos **/

public class Ex05{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Digite a quantidade de idades: ");
		int qtdIdade = input.nextInt();
		int idade = 0;
		int c;

		for(c = 1; c <= qtdIdade; c++){
			System.out.print("Didigite a " + c + "º Idade: ");
			idade += input.nextInt();
		}

		double media = idade / qtdIdade;

		if(media > 0 && media < 25){
			System.out.print("A turma é Jovem.");

		}else if(media > 26 && media < 60){
			System.out.print("A turma é Adulto.");

		}else if(media > 60){
			System.out.print("A turma é Idosa.");
		}


	}
}