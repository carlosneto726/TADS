package Projeto1;
import java.util.Scanner;


/**** @author carlos ****/
public class exercico8 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);

        int pontos = in.nextInt();
        double cortes = Math.pow(2, (pontos-1)); // 2^(n-1)
        System.out.println(String.format("%.0f", cortes));

        //System.out.println(String.format("%.0f", Math.pow(2, in.nextInt() - 1)));
    }
}

