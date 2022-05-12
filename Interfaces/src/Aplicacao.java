
public class Aplicacao {

	public static void main(String[] args) {
		Rota rota = new Rota(); //instancia a variavel rota
		Ferrari ferrari = new Ferrari();
//		Fusca fusca = new Fusca();
//		rota.ir(ferrari); //Rota da ferrari 
//		System.out.println(); //SYSO para pular linha
//		rota.ir(fusca); //Rota do fusca, comprovando que a variavel rota pode se comportar de maneiras diferentes.
		
		
    	//Monstrando o polimorfismo de maneira mais explicita.
//		Automovel automovel = new Ferrari();
//		rota.ir(automovel);
//		automovel = new Fusca();
//		System.out.println();
//		rota.ir(automovel);
		
		
		//Outra intefac, mostrando assim que dois contextos diferentes podem ser conectados pela inteface.
		Vendedor vendedor = new Vendedor();
		Apartamento apartamento = new Apartamento();
		
		vendedor.mostrarPreco(apartamento);
		vendedor.mostrarPreco(ferrari);
	}

}
