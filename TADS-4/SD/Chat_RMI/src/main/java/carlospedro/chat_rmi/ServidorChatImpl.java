package carlospedro.chat_rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

/**** @author Carlos Henrique Neto & Pedro Henrique Barros ****/

public class ServidorChatImpl extends UnicastRemoteObject implements Chat {

    ArrayList<String> texto;

    public ServidorChatImpl() throws RemoteException {
        super();
        this.texto = new ArrayList<String>();
    }
    // Metodo que armazena a String msg no Array texto.
    public void enviarMensagem(String msg) throws RemoteException{
        texto.add(msg);
    }
    // Metodo que retorna a Array texto.
    public ArrayList<String> lerMensagem() throws RemoteException{
        return texto;
    }
}