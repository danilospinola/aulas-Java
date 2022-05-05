
public class Aplicação {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setAno(1975);
		veiculo.setNome("HB20");
		veiculo.setModelo("750X");
		
		veiculo.imprimir();
		veiculo.buzinar();
	
	System.out.println("\n------------------------------------------------------------------\n");	
		Carro carro = new Carro();
		
		carro.setMarca("Fiat");
		carro.setAno(2010);
		carro.setNome("Uno");
		carro.setModelo("Pallet");
		carro.setQuatroPortas(true);
		
		carro.imprimir();
		carro.buzinar();
		
		System.out.println("\n------------------------------------------------------------------\n");	
		
		Caminhão caminhão = new Caminhão();
		
		caminhão.setMarca("Mercedes");
		caminhão.setAno(2018);
		caminhão.setNome("AviadorX");
		caminhão.setModelo("XLM80");
		caminhão.setPesoCarga(450);
		
		caminhão.imprimir();
		caminhão.buzinar();
		System.out.println("\n------------------------------------------------------------------\n");	
		
		Moto moto = new Moto();
		
		moto.setMarca("Kavazaki");
		moto.setAno(2020);
		moto.setNome("Falcon5");
		moto.setModelo("Aviador");
		
		moto.imprimir();
		moto.buzinar();
	}

}
