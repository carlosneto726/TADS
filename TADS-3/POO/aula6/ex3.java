import java.util.Scanner;

public class ex3{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int b[] = new int[10];
        int c[] = new int[10];


        for(int i = 0; i < a.length; i++){
            System.out.print("Digite um número da "+ i +"º Multiplicação: ");
            a[i] = in.nextInt();

            System.out.print("Digite  número da "+ i +"º Multiplicação: ");
            b[i] = in.nextInt();
            c[i] = (a[i] * b[i]);
        }

        for(int j = 0; j < a.length; j++){
            System.out.println(a[j] + " X " + b[j] + " = " + c[j]);
        }
    }
}
