import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("Mouses.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";
			}
			System.out.println(string);
		}
		
		String classe = "Mouse: funciona = sim, qtdBotoes= 5, tamanho = pequeno\n";
		
		Mouse mouse = new Mouse(classe);
		
		System.out.println(mouse);
	}

	
	
}
