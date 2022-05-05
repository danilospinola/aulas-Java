
public class Carro extends Veiculo {

	private boolean quatroPortas;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		if (quatroPortas == false) {
			System.out.println("Tem quatro portas ? \nNão");
			System.out.println("Não");
		} else {
			System.out.println("Tem quatro portas ?  \nSim");
		}
	
	}

	@Override
	public void buzinar() {
		// TODO Auto-generated method stub
		System.out.println("Vrim vrim");
	}

	public boolean isQuatroPortas() {
		return quatroPortas;
	}

	public void setQuatroPortas(boolean quatroPortas) {
		this.quatroPortas = quatroPortas;
	}
}
