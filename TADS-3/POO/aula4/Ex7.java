/* @author 20201070130191 */

import java.util.Scanner;
public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Qual carro deseja comprar?: ");
        String produto = in.nextLine();
        
        switch(produto){
            case "hatch":
                System.out.println("Compra efetuada com sucesso!");
                
            case "motocicletas":
                System.out.println("Tem certeza que não prefere este modelo?");
                
            case "caminhonetes":
                System.out.println("Tem certeza que não prefere este modelo?");
                
            case "sedans":
                System.out.println("Tem certeza que não prefere este modelo?");
                
            default:
                System.out.println("Não trabalhamos com este tipo de automóvel aqui");
        }
        
    }
}