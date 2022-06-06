
public class Moto extends Veiculo { //Mostra que moto se extende de veiculo

	@Override
	public void buzinar() { //Override do método buzinar herdado de veiculo
		
		System.out.println("BIIIIIIIIIIIII"); 
		empinar(); 
	}
	
	public void empinar () { //Método proprio da classe moto, mostrando que subclasses podem possuir metodos proprios.
		System.out.println("Parabens você empinou a moto :) ");
	}
}
