
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
		System.out.println("A �rea do circulo � de: " + Math.PI * Math.pow(raio, 2));
		
	}
	
	
}
