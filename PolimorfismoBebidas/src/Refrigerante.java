
public class Refrigerante extends Bebida {
	
	//Construtor da bebida.
	public Refrigerante() {
		//chama o construtor da superclasse
		super("Refrigerante", false);

	}

	//Sobreescreve o metodo preparar.
	@Override
	public void Preparar() {
		super.Preparar();
		System.out.println("Colocando o Refrigerante.");
	}
	
	
	
}
