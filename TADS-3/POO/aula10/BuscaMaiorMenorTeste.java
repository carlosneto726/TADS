/**** @author CarlosH ****/
public class BuscaMaiorMenorTeste {
    public static void main(String[] args){
        BuscaMaiorMenor bmm1 = new BuscaMaiorMenor(1, 2, 3 ,4, 5);
        
        bmm1.setMaior(); // Definindo o Maior numero.
        System.out.println(bmm1.getMaior()); // Imprimindo o Maior Numero.
        
        bmm1.setMenor(); // Definindo o Menor numero.
        System.out.println(bmm1.getMenor()); // Imprimindo o Menor Numero.
        
        bmm1.setN1(900); // Trocando o n1.
      
        System.out.println(bmm1.getMaior()); // Imprimindo o maior numero antes de definir o novo maior numero.
        
        bmm1.setMaior(); // Definindo o maior numero de novo.
        System.out.println(bmm1.getMaior()); // Imprimindo o novo maior numero
    }
    
}
