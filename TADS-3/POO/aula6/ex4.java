import java.util.Scanner;

public class ex4{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];

        for(int j = 0; j < a.length; j++){
            System.out.print("Digite a "+ (j + 1) +"º idade: ");
            a[j] = in.nextInt();
        }

        int maior = a[0];
        int menor = a[0];

        int posMaior = 0;
        int posMenor = 0;   

        for(int i = 0; i < a.length; i++){
            if(a[i] > maior){
                maior = a[i];
                posMaior = i;
            }
            if(a[i] < menor){
                menor = a[i];
                posMenor = i;
            }
        }
        System.out.println("O mais novo tem "+ menor +" Anos e está Na posiçao "+ (posMenor) +", e o mais velho tem "+ maior +" Anos e está Na posiçao "+ (posMaior) +".");

    }
}