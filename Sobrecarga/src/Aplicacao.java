import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		Matematica matematica = new Matematica();

		System.out.println("Somar dois numeros");
		System.out.println("Digite o primeiro numero");
		int x = scanner.nextInt();
		
		System.out.println("Digite o segundo numero");
		int y = scanner.nextInt();
		
		
		int soma = matematica.somar(x, y);
		System.out.println("resultado é igual a : " + soma);

		soma = matematica.somar(x, y, 7);
		System.out.println("resultado é igual a : " + soma);

		System.out.println("Digite o primeiro numero");
		double x2 = scanner.nextDouble();
		
		System.out.println("Digite o segundo numero");
		double y2 = scanner.nextDouble();
		
		double soma2 = matematica.somar(x2 , y2);
		System.out.println("resultado é igual a : " + soma2);
	}

}
