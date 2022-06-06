
public class Ferrari implements Carro, ItemCaro{
//Classe Ferrari 
	
	@Override
	public void virarEsquerda() { //Override do método virar a esquerda da interface Veiculo, que tambem contem em veiculo.
		System.out.println("Ferrari virou a esquerda");
	}

	@Override
	public void virarDireita() { //Override do método virar a direita da interface Veiculo, que tambem contem em veiculo.
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() { //Override do método acelerar da interface Veiculo, que tambem contem em veiculo.
		System.out.println("Ferrari acelerou");
	}

	// Metodo da interface Carro
	
	@Override		//Override do método abrir porta da interface Carro.
	public void AbrirPorta() { 
		System.out.println("Ferrari abriu a porta");
	}

	// Metodo da interface Item caro
	
	@Override
	public double getPreco() { //Override do método getPreco da interface Item caro.
		return 500000;
	}

	
}
