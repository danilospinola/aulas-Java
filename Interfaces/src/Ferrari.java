
public class Ferrari implements Carro, ItemCaro{
//Classe Ferrari 
	
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou a esquerda");
	}

	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari virou a direita");
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari acelerou");
	}

	// Metodo da interface Carro
	
	@Override
	public void AbrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Ferrari abriu a porta");
	}

	// Metodo da interface Item caro
	
	@Override
	public double getPreco() {
		// TODO Auto-generated method stub
		return 500000;
	}

	
}
