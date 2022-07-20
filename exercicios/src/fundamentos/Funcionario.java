package fundamentos;

public class Funcionario {
	private String nome;
	private float salario;
	
	public Funcionario(String line) { 
	String[] ArrayLine = line.split(","); // faz split(repartição de variavel) da variavel line a partir da (",") 

	String[] ArrayNome = ArrayLine[0].split("=");  // faz split(repartição de variavel em duas partes) da variavel line a partir do ("=") e guarda na variavel ArrayNome
	this.nome = ArrayNome[1].trim(); // Retira os espacos da variavel ArrayNome e guarda no atributo nome.
	
	String[] ArraySalario = ArrayLine[1].split("=");
	this.salario = Integer.parseInt(ArraySalario[1].trim());
	}
	

	
public Funcionario() {

	}



	// <-----------------------------Getters e setters -------------------------------->
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getSalario() {
		return salario;
	}

	public void setSalario(float salario) {
		this.salario = salario;
	}
// <-----------------------------Getters e setters -------------------------------->

	@Override
	public String toString() {
		return "Funcionario nome = " + nome + ", Salario = " + salario + "\n";
	}
	
	
}
