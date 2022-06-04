
public class Circulo implements AreaCalculavel{

	private int raio;

	
	//<------------------------- Getters e setters ---------------------------------------->
	public int getRaio() {
		return raio;
	}



	public void setRaio(int raio) {
		this.raio = raio;
	}
	//<------------------------- Getters e setters ---------------------------------------->


	@Override
	public void calcularArea() {
		System.out.println("A área do circulo é de: " + Math.PI * Math.pow(raio, 2)); //Método calcularArea que vem da interface; faz a conta pi X Raio (ao quadrado ) assim calculando a área do circulo.
		
	}
	
	
}
