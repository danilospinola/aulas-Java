import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws IOException {
		
		
		Scanner teclado =  new Scanner (System.in);
		
		System.out.println("O que vai dentro do txt: ");
		String txt = (teclado.nextLine());
		
		
		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("txt escrito por programa.txt"))) {
			escrever.write(txt);
		}
		
		
		try (BufferedReader reader = new BufferedReader(new FileReader("txt escrito por programa.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";
			}
			System.out.println(string);
		}
		
	}

}
