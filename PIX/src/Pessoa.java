public class Pessoa {
	
	double valor;
	int cpf;
	String nome;
	int chavepix;
	
	void transferir (int valor) {
		this.valor += valor;
	}
	void receber (int valor) {
		this.valor += valor;
}
}