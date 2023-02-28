public class contaCorrente{

	int numero = 123;
	double saldo = 500;
	String status = "Especial";
	double limite = 1500;

	String saque(double valor, double numero){
		if (valor > saldo){
			return "Nao e possivel fazer o saque.";
		}else{
			saldo = saldo - valor;
		}

		return "Aqui esta o dinheiro na quantia de " + valor + " o saldo autal da conta e de " + saldo;
	}


	String depositar(double valor, double numero){
		saldo = saldo + valor;
		return "Voce depositou o valor de " + valor + " o seu saldo autal e de " + saldo;
	}


	String cosularSaldo(int numero){
		return "O saldo autal dessa conta e de " + saldo;
	}

	String statusConta(int numero){

		if(status.equals("Especial")){
			return "Essa conta usa Cheque especial";
		}else{
			return "Essa conta nao usa Cheque especial";
		}
	}

	public static void main(String[] args){
		contaCorrente cC = new contaCorrente();


		System.out.println(cC.saque(300, 123));
		System.out.println(cC.depositar(300, 123));
		System.out.println(cC.cosularSaldo(123));
		System.out.println(cC.statusConta(123));


	}
}