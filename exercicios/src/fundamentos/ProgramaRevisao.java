package fundamentos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProgramaRevisao {

	public static void main(String[] args) throws IOException {
		List<Funcionario> listaFuncionarios = new ArrayList<Funcionario>(); // Instância uma lista de funcionarios.
		Scanner teclado = new Scanner(System.in);

		for (int x = 0; x < 2; x++) {
			System.out.println("<-------------------------------------------------------------------------->");
			Funcionario funcionario = new Funcionario();

			System.out.println("Digite seu nome :");
			funcionario.setNome(teclado.next());

			System.out.println("Digite seu salario :");
			funcionario.setSalario(teclado.nextFloat());

			listaFuncionarios.add(funcionario); // Adiciona funcionario em uma lista

		}
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("funcionariosCadastrados.txt"))) { // Escreve
																											// um txt
																											// com o
																											// nome
																											// "funcionarios.txt"
			for (Funcionario funcionario2 : listaFuncionarios)
				escrever.write(funcionario2.toString()); // to string para "rodar" a lista de funcionarios que contem as
			// informacoes
			// de cada funcionario.
		}

		List<Funcionario> ListaFuncionarios2 = new ArrayList<Funcionario>(); // Cria uma nova lista de Funcionarios com
																				// o nome ListaFuncionarios2.

		try (BufferedReader reader = new BufferedReader(new FileReader("funcionariosCadastrados.txt"))) { // Lê o txt
																											// com o
																											// nome
																											// "funcionariosCadastrados.txtt"
			String line;

			while ((line = reader.readLine()) != null) { // Enquanto uma linha não estiver vazia, ele lerá o txt
				Funcionario funcionario = new Funcionario(line); // Instância uma pessoa com a linha do txt.

				ListaFuncionarios2.add(funcionario); // Adiciona a pessoa criada a lista.

			}

		}

	}

}
