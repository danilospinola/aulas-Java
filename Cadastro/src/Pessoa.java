
public class Pessoa {
	
	private String nome;
	private int idade;
	private	Endereco endereco;
	private Sexo sexo;
	
	
	
	// <------------------------------Getter e Setter--------------------------------------->
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	

	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}

	
	// <------------------------------Getter e Setter--------------------------------------->
	
	

	@Override
	public String toString() {
		return "Pessoa [nome = " + nome + ", Idade = " + idade + ", endereco = "+ endereco + " ,sexo = " + sexo +"]";
	}
}
