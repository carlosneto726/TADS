package carlospedro.chat_rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;

/**** @author Carlos Henrique Neto & Pedro Henrique Barros ****/

public interface Chat extends Remote {
    // Métodos de interface.
    void enviarMensagem(String mensagem) throws RemoteException;
    ArrayList<String> lerMensagem() throws RemoteException;
}
