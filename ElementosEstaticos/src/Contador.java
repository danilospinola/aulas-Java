
public class Contador {

	private static int valor;
	

//	public Contador() {
//		this.valor = 1;
//	}

	static {
		valor = 1; //Mostra que valor sempre começa em 1
	}

	public static void	incrementar() { // Toda vez que o metodo é utilizado aumenta +1 no valor
		valor++;

	}
	
//<------------------------------GETTER E SETTTER --------------------------------------->
public static int getValor() {
		return valor;
	}

public void setValor(int valor) {
		this.valor = valor;
	}
//<------------------------------GETTER E SETTTER --------------------------------------->	
	
}
