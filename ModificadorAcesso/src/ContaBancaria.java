public class ContaBancaria {
	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
//	public ContaBancaria() { // inicia a conta bancaria como ativa, o saldo como 1 e o numero da conta comno 1234
//		ativo = true;
//		saldo = 1.0;
//		numConta = 1234;
//	}
	
	
	public ContaBancaria(boolean ativo, double saldo) { //Sobrecarga de métodos do Conta bancaria, caso o comentario de cima estiver sem as "//"
		this.ativo = ativo;
		this.saldo = saldo;
	}


	//Método que mostra na tela que o usuario acaba de receber um valor
	public void receber(double valor) {	
		System.out.println("Você acaba de receber "+ valor);
		saldo += valor;	
	}
	
	//Método que mostra na tela que o usuario transferiu um valor.
	public void transferir(double valor) {
		if (valor > saldo) {
			System.out.println("Você não pode realizar a transferência de "+ valor +" reais por falta de saldo");
		}else {
			saldo -= valor;
			System.out.println("Você acaba de tranferir " + valor+" reais");
		}	
	}
	//Método que mostra o saldo para o usuario
	public double saldo() {
		return saldo; 		
	}
}
