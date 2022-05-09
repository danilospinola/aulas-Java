
public class Bebida {
	private String nome;
	private boolean aquecer;
	
	// Construtor da bebida
	public Bebida(String nome, boolean aquecer) {
		super();
		this.nome = nome;
		this.aquecer = aquecer;
		
	}
	
	
	//Metodo publico, sem retorno, com nome Preparar.
	public void Preparar() {	
		System.out.println("Pegando o copo.");
	}
	
	//Getters e setters.
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public boolean isAquecer() {
		return aquecer;
	}

	public void setAquecer(boolean aquecer) {
		this.aquecer = aquecer;
	} 
	
	
}
