/*
 * Servidor.java
 *
 * Created on 17 de Maio de 2006, 11:27
 *
 * Servidor ECHO: fica em aguardo de solicitação de algum cliente. Quando recebe
 * simplesmente devolve a mensagem. Funcionamento: tiro unico
 */

package programa1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class Servidor {
	
    public static void main(String args[]) {
    	
        DatagramSocket s = null;
        
        try {
            s = new DatagramSocket(6789); // cria um socket UDP
            
            byte[] buffer = new byte[1000];
            
            System.out.println("\n\n*** Servidor aguardando request");
            
            // cria datagrama para recepcionar solicitação do cliente
            DatagramPacket req = new DatagramPacket(buffer, buffer.length);
            
            s.receive(req);
            
            System.out.println("*** Request recebido de: " + req.getAddress()+":"+req.getPort());
            
            // envia resposta
            
            String msg = new String(req.getData(), 0, req.getLength());
            String invertido = "";
            for(int i = msg.length()-1; i >=0; i--){
                invertido += String.valueOf(msg.charAt(i));
            }
            byte[] m = invertido.getBytes();
            req.setData(m);
            
            System.out.println("O usuario: " + req.getAddress()+":"+req.getPort() + " Digitou: " + msg + " e invertido ficou: " + invertido);
            
            DatagramPacket resp = new DatagramPacket(req.getData(), req.getLength(),req.getAddress(), req.getPort());
            

            s.send(resp);
            
        } catch (SocketException e) {
            System.out.println("Erro de socket: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Erro envio/recepcao pacote: " + e.getMessage());
        } finally {
            if (s != null) s.close();
        }
    }
}
