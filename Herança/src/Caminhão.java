
public class Caminhão extends Veiculo {

	int pesoCarga;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("A carga é de: " + pesoCarga);
	}

	
	
	@Override
	public void buzinar() {
		// TODO Auto-generated method stub
		System.out.println("FOM FOM");
	}



	public int getPesoCarga() {
		return pesoCarga;
	}

	public void setPesoCarga(int pesoCarga) {
		this.pesoCarga = pesoCarga;
	}

}
