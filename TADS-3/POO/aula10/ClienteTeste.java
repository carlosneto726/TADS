/**** @author CarlosH ****/
public class ClienteTeste {
    public static void main(String[] args){
        Cliente cl1 = new Cliente(123);
        System.out.println(cl1.getNomeCompleto());
        cl1.setNomeCompleto("Fulano de Tal de Tanto");
        System.out.println(cl1.getNomeCompleto());
        
        Cliente cl2 = new Cliente(321);
        System.out.println(cl2.getNomeCompleto());
        cl2.setNomeCompleto("Fulana de Tanto de Tal");
        System.out.println(cl2.getNomeCompleto());
        
        
    }
    
}
