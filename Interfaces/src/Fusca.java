
public class Fusca implements Carro {
	//Classe Fusca que contem métodos da interface carro
	
	
	
	//Override do Metodo virar a esquerda da interface Automovel que existe támbem na interface carro
	@Override
	public void virarEsquerda() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a esquerda");
	}
	//Override do Metodo virar a direita da interface Automovel que existe támbem na interface carro
	@Override
	public void virarDireita() {
		// TODO Auto-generated method stub
		System.out.println("Fusca virou a direita");
	}
	//Override do Metodo acelerar da interface Automovel que existe támbem na interface carro
	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		System.out.println("Fusca acelerou");
	}
	//Override do Metodo Abrir porta da interface carro
	@Override
	public void AbrirPorta() {
		// TODO Auto-generated method stub
		System.out.println("Fusca abriu a porta");
	}
}
