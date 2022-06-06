
public class Caminhăo extends Veiculo {

	int pesoCarga; //Atributo proprio da subclasse.

	@Override //Override do método imprimir da subclasse 
	public void imprimir() { 
		super.imprimir(); //Usa o metodo imprimir da subclasse
		System.out.println("A carga é de: " + pesoCarga); //Mostra a carga do caminhão no console
	}

	
	
	@Override //Override do metodo buzinar da superclasse
	public void buzinar() {
		System.out.println("FOM FOM");
	}


	//<-----------------------------------Getters e setters----------------------------------->
	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}
	//<-----------------------------------Getters e setters----------------------------------->
}
