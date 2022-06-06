
public class Veiculo {

	private String nome;	
	protected String marca;
	protected String modelo;
	protected int ano;
	
	
	public void buzinar(){ //método buzinar que tem retorno vazio
		System.out.println("BI BI");
		
	}
	
	public void imprimir () {//método imprimir que tem retorno vazio
		System.out.println("Nome: " + nome + "\nMarca: " + marca +"\nModelo: "+ modelo + "\nAno: " + ano ); //Syso que mostra todas as caracteristicas
	}

	
	//<----------------------------Getters e setters----------------------------------->
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	//<----------------------------Getters e setters----------------------------------->
	
}
