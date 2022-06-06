
public class Aplicação {

	public static void main(String[] args) {
		Veiculo veiculo = new Veiculo();
		
		veiculo.setMarca("Honda");
		veiculo.setAno(1975);
		veiculo.setNome("HB20");
		veiculo.setModelo("750X");
		
		veiculo.imprimir(); //Método imprimir de veiculo
		veiculo.buzinar();  //Método buzinar de veiculo
	
	System.out.println("\n------------------------------------------------------------------\n");	
		Carro carro = new Carro();
		
		carro.setMarca("Fiat");
		carro.setAno(2010);
		carro.setNome("Uno");
		carro.setModelo("Pallet");
		carro.setQuatroPortas(true);
		
		carro.imprimir(); //Método imprimir de carro
		carro.buzinar(); //Método buzinar de carro
		
		System.out.println("\n------------------------------------------------------------------\n");	
		
		Caminhão caminhão = new Caminhão();
		
		caminhão.setMarca("Mercedes");
		caminhão.setAno(2018);
		caminhão.setNome("AviadorX");
		caminhão.setModelo("XLM80");
		caminhão.setPesoCarga(450);
		
		caminhão.imprimir(); //Método imprimir de caminhão
		caminhão.buzinar(); //Método buzinar de caminhão
		System.out.println("\n------------------------------------------------------------------\n");	
		
		Moto moto = new Moto();
		
		moto.setMarca("Kavazaki");
		moto.setAno(2020);
		moto.setNome("Falcon5");
		moto.setModelo("Aviador");
		
		moto.imprimir(); //Método imprimir de moto
		moto.buzinar(); //Método buzinar de moto
	}

}
