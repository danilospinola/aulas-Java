
public class Aplica��o {

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
		
		Caminh�o caminh�o = new Caminh�o();
		
		caminh�o.setMarca("Mercedes");
		caminh�o.setAno(2018);
		caminh�o.setNome("AviadorX");
		caminh�o.setModelo("XLM80");
		caminh�o.setPesoCarga(450);
		
		caminh�o.imprimir();
		caminh�o.buzinar();
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
