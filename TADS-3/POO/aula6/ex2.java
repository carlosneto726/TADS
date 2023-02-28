import java.util.Scanner;

public class ex2{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[8];
        int b[] = new int[8];
        int c[] = new int[8];


        for(int i = 0; i < a.length; i++){
            System.out.print("Digite um Número: ");
            a[i] = in.nextInt();
            b[i] = (a[i] * 2);
        }

        for(int j = 0; j < a.length; j++){
            System.out.println(a[j] + " X  2  = " + b[j]);
        }
    }
}