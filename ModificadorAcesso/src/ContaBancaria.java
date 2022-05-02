
public class ContaBancaria {

	
	private int numConta;
	private boolean ativo;
	private double saldo;
	
	
	public double versaldo() {
		return saldo;
	}

	public void dar (double valor) {
		
		if (valor >= saldo) {
			saldo -=valor;
		}
	}
	
	public void receber (double valor) {
		
		saldo +=valor;
		
	}
	
	public  ContaBancaria () {
		
	}
	
	public ContaBancaria(boolean ativo, double saldo) {
		super();
		this.ativo = ativo;
		this.saldo = saldo;
	}
}