package exercicioLampada;

public class Lampada {

	private boolean ligado;

	
public  Lampada () {
	ligado = true;
	if (ligado == true) {
	System.out.println("Lampada ligada");
	}
}
	
	public void ligar() {

		ligado = true;
		if (ligado == true) {
			System.out.println("Lampada ligada");
		}

	}

	
	public void desligar() {

		ligado = false;
		if (ligado == false) {
			System.out.println("Lampada desligada");
		}

	}
}
