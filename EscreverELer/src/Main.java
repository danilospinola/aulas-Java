import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Scanner teclado =  new Scanner (System.in); //instância um novo scanner
		
		System.out.println("O que vai dentro do txt: "); 
		String txt = (teclado.nextLine());	//Guarda na variavel txt, tudo que for digitado no teclado
		
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("txt escrito por programa.txt"))) { //Cria um arquivo txt de nome "txt escrito por programa"
			escrever.write(txt); //Coloca dentro do arquivo criado o que foi digitado na variavel txt
		}
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("txt escrito por programa.txt"))) { //procura um arquivo para ler com o nome "txt escrito por programa.txt"
			String line;
			String string = ""; 

			while ((line = reader.readLine()) != null) {
				string += line + "\n"; //Faz a leitura do que tem dentro do txt 
			}
			System.out.println(string); // Mostra pro usuario o que tem dentro do txt
		}
		
	}

}
