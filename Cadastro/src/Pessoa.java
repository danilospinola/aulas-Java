
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
		return "Pessoa nome = " + nome + ", Idade = " + idade + ", endereco = "+ endereco + " ,sexo = " + sexo ;
	}
	
	public Pessoa(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.nome = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.idade = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.endereco = arrayAuxiliar4[1].trim();
	}
}
