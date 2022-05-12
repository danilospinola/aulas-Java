
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrado quadrado = new Quadrado();
		Retangulo retangulo = new Retangulo();
		Circulo circulo = new Circulo();
		quadrado.setLado(30);
		quadrado.calcularArea();
		System.out.println("------------------------------------------------------------------");
		retangulo.setAltura(40);
		retangulo.setBase(70);
		retangulo.calcularArea();
		System.out.println("------------------------------------------------------------------");
		circulo.setRaio(15);
		circulo.calcularArea();
		
	}

}
