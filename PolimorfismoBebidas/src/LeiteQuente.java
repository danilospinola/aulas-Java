
public class LeiteQuente extends Bebida {

	//Construtor da bebida.
	public LeiteQuente() {
		//chama o construtor da superclasse
		super("Leite Quente", true);

	}

	//Sobreescreve o metodo preparar.
	@Override
	public void Preparar() {
		super.Preparar();
		System.out.println("Colocando o leite.");
		System.out.println("Colocando açucar.");
	}
}
