import java.util.Scanner;

public class Aplicacao {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		

		Matematica matematica = new Matematica(); //instância um objeto de matemática

		System.out.println("Somar dois numeros");
		System.out.println("Digite o primeiro numero");
		int x = scanner.nextInt();	//Todo numero que o usuario digitar no console irá parar na variavel "x", até o usuario dar enter.
		
		System.out.println("Digite o segundo numero");
		int y = scanner.nextInt(); //Todo numero que o usuario digitar no console irá parar na variavel "y", até o usuario dar enter.
		
		
		int soma = matematica.somar(x, y);
		System.out.println("resultado é igual a : " + soma); //Soma os dois numeros que o usuario digitou e mostra o resultado no console

		soma = matematica.somar(x, y, 7);
		System.out.println("resultado é igual a : " + soma); //Soma os dois numeros que o usuario digitou e adiciona mais 7 neles, além de mostrar o resultado no console

		System.out.println("Digite o primeiro numero");
		double x2 = scanner.nextDouble(); //Todo numero que o usuario digitar no console irá parar na variavel "x2", até o usuario dar enter.
		
		System.out.println("Digite o segundo numero");
		double y2 = scanner.nextDouble(); //Todo numero que o usuario digitar no console irá parar na variavel "y2", até o usuario dar enter.
		
		double soma2 = matematica.somar(x2 , y2);//Soma os dois doubles s que o usuario digitou e mostra o resultado no console
		System.out.println("resultado é igual a : " + soma2);
	}

}
