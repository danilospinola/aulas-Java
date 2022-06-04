
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Quadrado quadrado = new Quadrado(); //Instância um quadrado
		Retangulo retangulo = new Retangulo();  //Instância um Retangulo
		Circulo circulo = new Circulo();  //Instância um circulo 
		
		quadrado.setLado(30); //Coloca o lado do quadrado como 30
		quadrado.calcularArea(); // usa o metodo calcular área do quadrado
		
		System.out.println("------------------------------------------------------------------");
		
		retangulo.setAltura(40); //Coloca a altura do retangulo como 40
		retangulo.setBase(70); // Coloca a base do retangulo como 70
		retangulo.calcularArea(); // usa o metodo calcular área do retangulo
		
		System.out.println("------------------------------------------------------------------");
		
		circulo.setRaio(15); // Coloca o raio do circulo como 15
		circulo.calcularArea(); //Calcula a área do 
		
	}

}
