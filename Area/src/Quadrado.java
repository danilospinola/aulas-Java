
public class Quadrado implements AreaCalculavel {

private int lado;


//<------------------------- Getters e setters ---------------------------------------->
public int getLado() {
	return lado;
}



public void setLado(int lado) {
	this.lado = lado;
}

//<------------------------- Getters e setters ---------------------------------------->


@Override
public void calcularArea() {
	
	System.out.println("A área do quadrado é igual a " + Math.pow(lado, 2));  // Faz o override do calcular área (método da interface) e calcula a área do quadrado (Lado X Lado).	
}
	
}
