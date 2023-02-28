package carlospedro.chat_rmi;

import java.rmi.*;
import java.rmi.RemoteException;

/**** @author Carlos Henrique Neto & Pedro Henrique Barros ****/

public class Usuario {

    public static void main( String args[] ) {
        UsuarioJFrame userInterface = new UsuarioJFrame();
        try {
            // Stub para o objeto remoto Chat do registro.
            Chat chat = (Chat) Naming.lookup( "rmi://localhost:1099/ServidorChat");

            String nome = "";
            String msg;

            // While para caso o ususário não tenha pressionado o botão ok.
            while(userInterface.getFlag() == false){
                nome = userInterface.getNome();
            }

            // Criando a Thread
            Thread thread = new Thread(new Runnable() {
                // Invocação do metodo remoto.
                int cont = chat.lerMensagem().size();

                @Override
                public void run() {
                    // Thread para manter o chat online.
                    try {
                        // Laço para manter o texto escrito no chat.
                        while(true){
                            if (chat.lerMensagem().size() > cont){
                                // primero ler a mensagem em string depois como lista.
                                userInterface.setChat(chat.lerMensagem().get(chat.lerMensagem().size()-1));
                                cont++;
                            }
                        }
                    } catch (RemoteException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();

            while(userInterface.sair()){
                // Parando a Thread por 1 segundo para dar tempo de enviar a mensagem.
                Thread.currentThread().sleep(1000);
                if(userInterface.getBntWasPressed()){
                    msg = " ["+nome+"]: " + userInterface.getTexto() + "\n";
                    // Caso o usuario tenha digitado algo.
                    if(!userInterface.getTexto().equals("")){
                        // Envia a mensagem para a interface para retornar ao usuário novamente.
                        chat.enviarMensagem(msg);
                        userInterface.setTexto("");
                    }
                }
                userInterface.setBtnWasPressedFalse();
            }
        }
        catch( Exception e ) {
            e.printStackTrace();
        }
    }
}
