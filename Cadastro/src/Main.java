import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
	
		List <Pessoa> listaPessoas = new ArrayList<Pessoa>();
		
		Scanner teclado =  new Scanner (System.in);
		Pessoa pessoa = new Pessoa();
		
		Sexo sexo = Sexo.MASCULINO;

		
		pessoa.setEndereco(new Endereco());
		
		for(int  x=0;  x <4 ; x++ ) {
		
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
		
		
		if(teclado.nextInt() == 1) {
			 sexo = Sexo.MASCULINO;
		}
		else {
			 sexo = Sexo.FEMININO;
		}
		
		listaPessoas.add(pessoa);
		}
		


		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Pessoas.txt"))) {
			for (Pessoa pessoa2 : listaPessoas)
				escrever.write(pessoa2.toString()); // to string para "rodar" a lista de mouses que contem as informa��es
													// de cada mouse.
		}

		List<Pessoa> ListaPesoas2 = new ArrayList<Pessoa>();

		try (BufferedReader reader = new BufferedReader(new FileReader("Pessoas.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";
			}

		}
		for (Pessoa pessoa2 : ListaPesoas2) {
			System.out.println(pessoa2);
		}
		
		
		
		System.out.println(listaPessoas);
	}
}
