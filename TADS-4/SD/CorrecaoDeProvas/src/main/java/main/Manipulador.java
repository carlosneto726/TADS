package main;

import java.io.*;

public class Manipulador {
    public static String Read(String Caminho) {
        String conteudo = "";
        try {
            FileReader arq = new FileReader(Caminho);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = "";
            try {
                linha = lerArq.readLine();
                while (linha != null) {
                    conteudo += linha + "\n";
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }

    public static boolean Write(String Caminho, String Texto) {
        try {
            FileWriter arq = new FileWriter(Caminho);
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            return false;
        }
    }

    public int QtdLinhas(String caminhoArquivo) throws IOException {
        File arquivo = new File(caminhoArquivo);
        LineNumberReader linha = new LineNumberReader(new FileReader(arquivo));
        linha.skip(arquivo.length());
        int quatidadeLinha = linha.getLineNumber();
        return quatidadeLinha;
    }

    public String[][] LeituraRespostas(String caminhoArquivo, int quatidadeLinha) throws IOException {

        String Stringrespostas = caminhoArquivo;

        String respostas[][] = new String[1][quatidadeLinha + 1];
        int contagem = 3;

        for (int i = 0; i <= respostas[0].length - 1; i++) {
            respostas[0][i] = String.valueOf(Stringrespostas.trim().subSequence(contagem, contagem + 4));

            contagem += 8;
        }
        return respostas;
    }

    public void VerificarRespostas(String[][] respostas, String[][] gabarito) {
        char[] vetorChar;
        char[] vetorCharGabarito;

        int acerto = 0;
        int erro = 0;

        for (int i = 0; i <= respostas[0].length - 1; i++) {
            vetorChar = respostas[0][i].toCharArray();
            vetorCharGabarito = gabarito[0][i].toCharArray();
            System.out.println("\nQuestão " + (i + 1));
            for (int p = 0; p <= respostas[0][i].length() - 1; p++) {
                if ((vetorChar[p] == vetorCharGabarito[p])) {
                    System.out.println("Acertou!");
                    acerto++;
                } else {
                    System.out.println("Errou!");
                    erro++;
                }
            }

        }
        System.out.println("\n----------------------------------");
        System.out.println("O total de acertos:  " + acerto);
        System.out.println("O total de erros:    " + erro);
        System.out.println("----------------------------------");
    }
}




