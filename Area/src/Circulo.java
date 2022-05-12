
public class Circulo implements AreaCalculavel{

	private int raio;

	
	
	public int getRaio() {
		return raio;
	}



	public void setRaio(int raio) {
		this.raio = raio;
	}



	@Override
	public void calcularArea() {
		System.out.println("A área do circulo é de: " + Math.PI * Math.pow(raio, 2));
		
	}
	
	
}
