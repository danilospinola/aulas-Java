
public class Carro extends Veiculo { //Mostra que carro se extende de veiculo, sendo veiculo a superclasse e carro a subclasse.

	private boolean quatroPortas; //Atributo próprio da subclasse.

	@Override
	public void imprimir() { //Override do Método imprimir da superclasse
		super.imprimir(); //Método imprimir da super classe
		if (quatroPortas == false) { // Se o carro tiver 4 portas mostra pro usuario que o carro possui 4 portas e se não tiver tambem mostra para o usuario.
			System.out.println("Tem quatro portas ? \nNão");
			System.out.println("Não");
		} else {
			System.out.println("Tem quatro portas ?  \nSim");
		}
	
	}

	@Override
	public void buzinar() { //Override do metodo buzinar da superclasse.
		System.out.println("Vrim vrim");
	}

	//<-----------------------------------Getters e setters----------------------------------->
	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
	//<-----------------------------------Getters e setters----------------------------------->	
}
