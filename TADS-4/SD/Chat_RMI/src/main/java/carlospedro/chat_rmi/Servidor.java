package carlospedro.chat_rmi;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import javax.swing.JOptionPane;

/**** @author Carlos Henrique Neto & Pedro Henrique Barros ****/

public class Servidor {
    public Servidor(){
        try {
            // Criando o servidor.
            // Registro do objeto remoto com RMI Registry.
            Registry registry = LocateRegistry.createRegistry(1099);
            Chat server = new ServidorChatImpl();
            Naming.rebind("rmi://localhost:1099/ServidorChat", server);

            JOptionPane.showMessageDialog(null, "Servidor inciado com sucesso.");

        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main (String args[]){
        new Servidor();
    }

}