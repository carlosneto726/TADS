package programa2;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket cliente = new Socket("127.0.0.1", 12345);
		
		System.out.println("O cliente se conectou ao servidor!");

		Path path = Paths.get("D:/User/Documentos/Coding/TADS/TADS-4/SD/ex02/src/main/java/programa2/gabarito.txt");
                List<String> linhasArquivo = Files.readAllLines(path);
                
		
		PrintStream saida = new PrintStream(cliente.getOutputStream());

		
                saida.println(linhasArquivo);
		

		saida.close();
		
	}
}