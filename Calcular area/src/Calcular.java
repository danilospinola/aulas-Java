import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); //instancia um scanner
		Areas areas = new Areas(); //Instancia uma area

		System.out.println("digite a base do poligono para calcular a área: ");  
		int x = scanner.nextInt(); // Valor do X e igual ao que e digitado no teclado

		int Quadrado = areas.calculararea(x); // Usa a variavel x para o metodo calculararea e guarda na variavel Quadrado.
		System.out.println("resultado do quadrado é igual a : " + Quadrado);

		System.out.println("digite a altura para calcular o  triangulo"); 
		int y = scanner.nextInt(); // Valor de Y e igual ao que e digitado no teclado

		int triangulo = areas.calculararea(x, y); // Usa a variavel x e Y para o metodo calculararea e guarda na variavel Triangulo.
		System.out.println("reultado do retangulo igual a : " + triangulo);

		System.out.println("digite a altura para calcular o retangulo"); // Usa a variavel x e Y para o metodo calculararea e guarda na variavel Triangulo.
		double y2 = scanner.nextDouble();
		double retangulo = areas.calculararea(x, y2); 
		System.out.println("reultado é igual a : " + retangulo);
	}

}
