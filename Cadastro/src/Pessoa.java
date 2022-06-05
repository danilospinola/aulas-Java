
public class Pessoa {
	
	private String nome;
	private int idade;
	private	Endereco endereco;
	private Sexo sexo;
	
	
	
	//Obs: o metodo split quando divide, a primeira parte será 0 e a outra será 1; porém conforme ocorre as divisões os numeros irão aumentar gradativamente.

	public Pessoa(String line) { 
	String[] ArrayLine = line.split(","); // faz split(repartição de variavel) da variavel line a partir da (",") 

	String[] ArrayNome = ArrayLine[0].split("=");  // faz split(repartição de variavel em duas partes) da variavel line a partir do ("=") e guarda na variavel ArrayNome
	this.nome = ArrayNome[1].trim(); // Retira os espacos da variavel ArrayNome e guarda no atributo nome.
	
	String[] ArrayIdade = ArrayLine[1].split("="); // faz split 1° parte da variavel line a partir do ("=") e guarda na variavel ArrayIdade
	this.idade = Integer.parseInt(ArrayIdade[1].trim()); // Retira os espacos da variavel ArrayIdade e guarda no atributo idade.
	
	String[] ArraySexo = ArrayLine[2].split("=");
	this.sexo = Sexo.valueOf(ArraySexo[1].trim()); // Retira os espacos da variavel ArraySexo e guarda no atributo sexo.
	
	Endereco endereco = new Endereco(ArrayLine); // Instância um ArrayLine na variavel endereco
	
	this.endereco = endereco; //A variavel endereco é igual ao atributo endereco
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
		return "Pessoa nome = " + nome + ", Idade = " + idade + " ,sexo = " + sexo + endereco +"\n"; //Override do to String
	}
	

}
