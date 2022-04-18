import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		Areas areas = new Areas();

		System.out.println("digite a base do poligono para calcular a área: ");
		int x = scanner.nextInt();

		int Quadrado = areas.calculararea(x);
		System.out.println("resultado do quadrado é igual a : " + Quadrado);

		System.out.println("digite a altura para calcular o r triangulo");
		int y = scanner.nextInt();

		int triangulo = areas.calculararea(x, y);
		System.out.println("reultado do retangulo igual a : " + triangulo);

		System.out.println("digite a altura para calcular o retangulo");
		double y2 = scanner.nextDouble();
		double retangulo = areas.calculararea(x, y2);
		System.out.println("reultado é igual a : " + retangulo);
	}

}
