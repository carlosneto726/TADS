package main;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor extends Thread {

    public static void main(String args[]) {
        ServerSocket s = null;
        try {
            s = new ServerSocket(12345);
            while (true) {

                Socket conexao = s.accept();

                Thread t = new Servidor(conexao);
                t.start();
            }
        } catch (IOException e) {
            System.out.println("IOException " + e);
        }
    }

    private Socket conexao;

    public Servidor(Socket s) {
        conexao = s;
    }

    public void run() {
        try {

            System.out.println("Nova conexão com o cliente " + conexao.getInetAddress().getHostAddress());

            DataInputStream entrada = new DataInputStream(conexao.getInputStream());
            Manipulador manipulador = new Manipulador();

            String t = entrada.readUTF();
            int qtLinhas = entrada.readInt();
            String[][] respostas = manipulador.LeituraRespostas(t, qtLinhas);

            String gabarito = manipulador.Read("D:/User/Documentos/Coding/TADS/TADS-4/SD/CorrecaoDeProvas/src/main/java/main/gabarito.txt");
            int gabaLinhas = manipulador.QtdLinhas("D:/User/Documentos/Coding/TADS/TADS-4/SD/CorrecaoDeProvas/src/main/java/main/gabarito.txt");
            String[][] gabaritoVetor = manipulador.LeituraRespostas(gabarito, gabaLinhas);
            manipulador.VerificarRespostas(respostas, gabaritoVetor);

            entrada.close();
            conexao.close();


        } catch (IOException e) {
            System.out.println("IOException " + e);
        }

    }
}