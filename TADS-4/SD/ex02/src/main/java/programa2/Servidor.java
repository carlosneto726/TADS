package programa2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Servidor {

	public static void main(String[] args) throws IOException {

		ServerSocket servidor = new ServerSocket(12345);

		System.out.println("Porta 12345 aberta!");

		Socket cliente = servidor.accept();

		System.out.println("Nova conexão com o cliente " + cliente.getInetAddress().getHostAddress());

		Scanner entrada = new Scanner(cliente.getInputStream());
                                

                byte[] bytes = new byte[1000];

                int i;
                while ((i = cliente.getInputStream().read(bytes)) > 0) {
                    new FileOutputStream("D:/User/Documentos/Coding/TADS/TADS-4/SD/ex02/src/main/java/programa2/recebido.txt").write(bytes, 0, i);
                }

                
                
		entrada.close();
		servidor.close();
	}
}