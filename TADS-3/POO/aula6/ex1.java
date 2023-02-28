import java.util.Scanner;

public class ex1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[5];
        int b[] = new int[5];

        for(int i = 0; i < a.length; i++){
            System.out.print("Digite um Número: ");
            a[i] = in.nextInt();
            b[i] = a[i];
        }

        for(int j = 0; j < a.length; j++){
            System.out.println("Vetor a = " + a[j]  + " Vetor b = " + b[j]);


        }

    }
}
