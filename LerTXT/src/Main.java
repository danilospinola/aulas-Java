import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (BufferedReader reader = new BufferedReader(new FileReader("Mouses.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string+= line + "\n";
			}
			System.out.println(string);
		}

		String classe = "Mouse: funciona = true, qtdBotoes= 5, tamanho = pequeno\n";

		Mouse mouse1 = new Mouse(classe);

		
		
		classe = "Mouse: funciona = true, qtdBotoes= 5, tamanho = medio\n";

		Mouse mouse2 = new Mouse(classe);

		
		
		classe = "Mouse: funciona = true, qtdBotoes= 5, tamanho = Grande\n";

		Mouse mouse3 = new Mouse(classe);

		List<Mouse> listaMouse = new ArrayList<Mouse>();
		listaMouse.add(mouse1);
		listaMouse.add(mouse2);
		listaMouse.add(mouse3);

		for (Mouse mouse : listaMouse) {
			System.out.println(mouse);
		}
	}

}
