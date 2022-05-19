import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		List lista = new ArrayList();
		Scanner teclado =  new Scanner (System.in);
		Pessoa pessoa = new Pessoa();


		System.out.println("Digite seu nome: ");
		pessoa.nome = teclado.next();
		lista.add(pessoa.nome);
		
		System.out.println("Digite sua idade: ");
		pessoa.idade = teclado.nextInt();
		lista.add(pessoa.idade);
		
		System.out.println("Digite a rua do seu endereço");
		pessoa.endereco.rua = teclado.next();
		lista.add(pessoa.endereco.rua);
		
		System.out.println("Digite o numero do seu endereço");
		pessoa.endereco.numero = teclado.nextInt();
		lista.add(pessoa.endereco.numero);
		
		System.out.println("Digite o bairro do seu endereço");
		pessoa.endereco.bairro = teclado.next();
		
		System.out.println(lista);
	}

}
