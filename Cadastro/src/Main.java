import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>(); //Instância uma lista de pessoas.

		Scanner teclado = new Scanner(System.in); //Instância um scaner

		for (int x = 0; x < 4; x++) {  // para com as seguintes condições ( variavel x começa em 0, enquanto x for menor que 4 faça, a cada vez que fizer o processo adiciona mais um a variavel) 

			Pessoa pessoa = new Pessoa(); //Instância pessoa

			pessoa.setEndereco(new Endereco()); //Instância um endereço dentro do setter da pessoa.

			System.out.println("Digite seu nome: ");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade: ");
			pessoa.setIdade(teclado.nextInt());

			System.out.println("Digite a rua do seu endereco");
			pessoa.getEndereco().setRua(teclado.next()); // pega  o endereço e seta a rua dentro dele com a instância de teclado.

			System.out.println("Digite o numero do seu endereco");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			System.out.println("Digite o bairro do seu endereco");
			pessoa.getEndereco().setBairro(teclado.next());

			System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");

			int opcao = 0;
			while (opcao != 1 && opcao != 2) { // Enquanto a variavel opcao for diferente de 1 ou for diferente de 2 ele executa as acoes
				opcao = teclado.nextInt(); //Coloca a variavel opcao para o proximo caractere que o usuario digitar no teclado
				if (opcao == 1) { //se opcao for igual a 1 faca
					pessoa.setSexo(Sexo.MASCULINO); // seta o sexo como masculino em pessoa
				} else if (opcao == 2) {
					pessoa.setSexo(Sexo.FEMININO); // seta o sexo como feminino em pessoa
				} else { // caso o usuario digite nem 1 e nem 2 faca
					System.out.println("opcao invalida, digite novamente");
					System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino"); 
				}
			}
			listaPessoas.add(pessoa); //Adiciona pessoa em uma lista
		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) { // Escreve um txt com o nome "Pessoas.txt"
			for (Pessoa pessoa2 : listaPessoas)
				escrever.write(pessoa2.toString()); // to string para "rodar" a lista de pessoas que contem as
													// informacoes
													// de cada pessoa.
		}

		List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>(); // Cria uma nova lista de pessoa com o nome ListaPessoas2.

		try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) { // Lê o txt com o nome "Pessoas.txt"
			String line;

			while ((line = reader.readLine()) != null) { // Enquanto uma linha não estiver vazia, ele lerá o txt
				Pessoa pessoa = new Pessoa(line); // Instância uma pessoa com a linha do txt.

				ListaPessoas2.add(pessoa); // Adiciona a pessoa criada a lista.

			}

		}
		System.out.println(ListaPessoas2); // Mostra no console a lista;	
	}
}
