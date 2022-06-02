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

		List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 4; x++) {

			Pessoa pessoa = new Pessoa();

			pessoa.setEndereco(new Endereco());

			System.out.println("Digite seu nome: ");
			pessoa.setNome(teclado.next());

			System.out.println("Digite sua idade: ");
			pessoa.setIdade(teclado.nextInt());

			System.out.println("Digite a rua do seu endereco");
			pessoa.getEndereco().setRua(teclado.next());

			System.out.println("Digite o numero do seu endereco");
			pessoa.getEndereco().setNumero(teclado.nextInt());

			System.out.println("Digite o bairro do seu endereco");
			pessoa.getEndereco().setBairro(teclado.next());

			System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");

			int opcao = 0;
			while (opcao != 1 && opcao != 2) {
				opcao = teclado.nextInt();
				if (opcao == 1) {
					pessoa.setSexo(Sexo.MASCULINO);
				} else if (opcao == 2) {
					pessoa.setSexo(Sexo.FEMININO);
				} else {
					System.out.println("opcao invalida, digite novamente");
					System.out.println("Digite 1 para o sexo Masculino e Digite 2 para o sexo feminino");
				}
			}
			listaPessoas.add(pessoa);
		}

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) {
			for (Pessoa pessoa2 : listaPessoas)
				escrever.write(pessoa2.toString()); // to string para "rodar" a lista de pessoas que contem as
													// informacoes
													// de cada pessoa.
		}

		List<Pessoa> ListaPessoas2 = new ArrayList<Pessoa>();

		try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) {
			String line;

			while ((line = reader.readLine()) != null) {
				Pessoa pessoa = new Pessoa(line);

				ListaPessoas2.add(pessoa);

			}

		}
		System.out.println(ListaPessoas2);
	}
}
