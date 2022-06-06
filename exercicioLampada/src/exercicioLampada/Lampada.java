package exercicioLampada;

public class Lampada {

	private boolean ligado;

	
public  Lampada () { 
	ligado = true; //Lampada inicia ligada
	if (ligado == true) { // Se a lampada estiver ligada mostra na tela.
	System.out.println("Lampada ligada");
	}
}
	
	public void ligar() { // Método liga, liga a lampada e mostra na tela

		ligado = true;
		if (ligado == true) {
			System.out.println("Lampada ligada");
		}

	}

	
	public void desligar() { // Método desligar, desliga a lampada e mostra na tela.

		ligado = false;
		if (ligado == false) {
			System.out.println("Lampada desligada");
		}

	}
}
