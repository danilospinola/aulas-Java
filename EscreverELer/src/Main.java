import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		//<-----------------------------------------------Projeto antigo que escrevia e lia um txt------------------------------------------->
//		Scanner teclado =  new Scanner (System.in); //instância um novo scanner
//		
//		System.out.println("O que vai dentro do txt: "); 
//		String txt = (teclado.nextLine());	//Guarda na variavel txt, tudo que for digitado no teclado
//		
//		
//		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("txt escrito por programa.txt"))) { //Cria um arquivo txt de nome "txt escrito por programa"
//			escrever.write(txt); //Coloca dentro do arquivo criado o que foi digitado na variavel txt
//		}
//		
//		
//		try (BufferedReader reader = new BufferedReader(new FileReader("txt escrito por programa.txt"))) { //procura um arquivo para ler com o nome "txt escrito por programa.txt"
//			String line;
//			String string = ""; 
//
//			while ((line = reader.readLine()) != null) {
//				string += line + "\n"; //Faz a leitura do que tem dentro do txt 
//			}
//			System.out.println(string); // Mostra pro usuario o que tem dentro do txt
//		}
		//<-----------------------------------------------Projeto antigo que escrevia e lia um txt------------------------------------------->

		
		
		List<Mouse> listaMouse = new ArrayList<Mouse>(); //Cria um arraylist do tipo mouse

		Mouse mouse1 = new Mouse("sim", "5", "Pequeno");
		listaMouse.add(mouse1);

		Mouse mouse2 = new Mouse("sim", "5", "grande");
		listaMouse.add(mouse2);

		Mouse mouse3 = new Mouse("sim", "5", "medio");
		listaMouse.add(mouse3);

		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Mouses.txt"),1)) {
			for (Mouse mouse : listaMouse)
				escrever.write(mouse.toString()+"\n"); // to string para "rodar" a lista de mouses que contem as informa��es
													// de cada mouse.
		}

		List<Mouse> listaMouse2 = new ArrayList<Mouse>();

		try (BufferedReader reader = new BufferedReader(new FileReader("Mouses.txt"))) {
			String line;
			String string = "";

			while ((line = reader.readLine()) != null) {
				string += line + "\n";
				Mouse mouse = new Mouse(line);
				listaMouse2.add(mouse);
			}

		}
		for (Mouse mouseZ : listaMouse2) {
			System.out.println(mouseZ);
		}
		
		
	}

}
