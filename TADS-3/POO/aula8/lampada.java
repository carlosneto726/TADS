public class lampada{

	String ligarLampada(){
		return "Ligada";
	}

	String desligarLampada(){
		return "Desligada";
	}

	public static void main(String args[]){

		lampada lp = new lampada();
 
		System.out.println("A lampada esta " + lp.ligarLampada());
		System.out.println("A lampada esta " + lp.desligarLampada());

	}
}