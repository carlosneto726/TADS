public class MediaPonderada{
	public static void main(String[] args){
		int nota1 = 6;
		int nota2 = 9;
		int nota3 = 4;

		int peso1 = 3;
		int peso2 = 1;
		int peso3 = 2;

		double media = (((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3));


		System.out.println(media);
	}
}