
public class Caminh�o extends Veiculo {

	int pesoCarga;

	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("A carga � de: " + pesoCarga);
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
