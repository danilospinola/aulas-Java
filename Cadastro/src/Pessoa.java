
public class Pessoa {
	
	private String nome;
	private int idade;
	private	Endereco endereco;
	private Sexo sexo;
	
	
	


	public Pessoa(String line) {
	String[] ArrayLine = line.split(","); 

	String[] ArrayNome = ArrayLine[0].split("=");
	this.nome = ArrayNome[1].trim();
	
	String[] ArrayIdade = ArrayLine[1].split("=");
	this.idade = Integer.parseInt(ArrayIdade[1].trim());
	
	String[] ArraySexo = ArrayLine[2].split("=");
	this.sexo = Sexo.valueOf(ArraySexo[1].trim());
	
	Endereco endereco = new Endereco(ArrayLine);
	
	this.endereco = endereco;
	}
	
	public Pessoa() {
		
	}
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
	
	
	public Sexo getSexo() {
		return sexo;
	}

	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	// <------------------------------Getter e Setter--------------------------------------->
	
	

	@Override
	public String toString() {
		return "Pessoa nome = " + nome + ", Idade = " + idade + " ,sexo = " + sexo + endereco +"\n";
	}
	

}
