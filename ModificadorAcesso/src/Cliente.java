import java.util.Objects; // Importa a casse object da biblioteca do java

public class Cliente {
	// Atributos pivaddos do cliente, os acessos so podem ser feitos por uma subclasse ou por getters e setter.
	private String nome;
	private int cpf;
	private int numConta;
	
	// Método genérico de  Cliente
	public Cliente() {
		
	}
	
	// <-------------------------------------------------Getters e setters--------------------------------------------->
	// Get pega o valor do atributo e set coloca um valor para o atributo
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public int getNumConta() {
		return numConta;
	}
	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}
	// <-------------------------------------------------Getters e setters--------------------------------------------->
	
	//Override do toString, método que retorna todos os atributos e mostra no console
	@Override
	public String toString() {
		return "Nome = " + nome + "\nCPF = " + cpf + "\nNúmero de Conta = " + numConta+"\n";
	}

	//Override do hashCode, método que retorna os atributos como objetos.
	@Override
	public int hashCode() {
		return Objects.hash(cpf, nome, numConta);
	}

	@Override // Método equals que compara 2 objetos, nesse caso compara os atributos de 2 contas.
	public boolean equals(Object obj) { 
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return cpf == other.cpf && Objects.equals(nome, other.nome) && numConta == other.numConta;
	}
	
	
}
