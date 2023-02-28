/**** @author CarlosH ****/
public class DataTeste {
    public static void main(String[] args){
        Data dt = new Data(06, 20, 2022);
        dt.displayData();
        
        dt.setMes(07);
        dt.setDia(26);
        dt.setAno(2002);
        
        dt.displayData();
        
    }
    
}
