import java.util.Scanner;

public class ex5{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int a[] = new int[10];
        int c = 10;
        String resposta = "";

        for(int j = 0; j < a.length; j++){
            System.out.print("Digite o "+ (j+1) +"º numero: ");
            a[j] = in.nextInt();
        }

        for(int i = 0; i < a.length; i++){
            c--;
            if(a[i] == a[c]){
                resposta = "É um palíndromo.";
            }else{
                resposta = "Não é um palíndromo.";
                break;
            }
        }
        System.out.println(resposta);
    }
}
