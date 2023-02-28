public class Conta{
	double saldo;
	String tipo;

	public Conta(double valorInicial){
		this.saldo = valorInicial;
	}

	public Conta(double valorInicial, String tipo){
		this.saldo = valorInicial;
		this.tipo = tipo;
	}

	public boolean depositar(double valor){
		saldo = saldo + valor;
	}

	public double sacar(double valor){
		if(valor > saldo){
			System.out.println("Valor Invalido");
		}else{
			saldo = saldo - valor;
		}
	}

	void consultaSaldo(conta tipoConta){
		System.out.println(saldo);
	}
}