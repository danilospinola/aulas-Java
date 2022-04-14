public class Pessoa {

	double valor;
	int cpf;
	String nome;
	int chavepix;
	double total;

	boolean transferir(double valor, Pessoa pessoa) {
		if (pessoa.valor <  pessoa.total) {
			System.out.println("saldo insuficiente");
			return false;
		} else {
			this.total -= valor;
			System.out.println(nome + " transferiu " + valor + "R$");
			System.out.println(nome + " seu saldo total é de " + total);
			pessoa.receber(valor);
			return true;
		}

	}

	void receber(double valor) {
		this.total += valor;
		System.out.println(nome + " recebe " + valor + "R$");
		System.out.println(nome +" seu saldo total é de " + total);
	}
}