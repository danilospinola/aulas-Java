import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List; 

public class Main {

	public static void main(String[] args) throws IOException{//Joga uma declara��o de exce��o

//		String s = "texto para ser gravado no arquivo."; //
//
//		try (BufferedWriter escrever = new BufferedWriter(new FileWriter("saida.txt"))) {
//
//			// Try faz com que o erro de entrada e saida de dados n�o ser� obrigatoriamente tratado 
//
//			// Classe buffered que se resume em uma pequena memoria
//			// temporaria que ser� utilizada para fazer a escrita desse exemplo
//
//			// Fliewriter escreve o nome do arquivo
//
//			escrever.write(s); // Escreve dentro do arquivo
//
//		}
			List <Mouse> listaMouse = new ArrayList<Mouse>(); 
			
			Mouse mouse1 = new Mouse(true, 5, "Pequeno"); 
			listaMouse.add(mouse1);
			
			Mouse mouse2 = new Mouse(true, 5, "Medio"); 
			listaMouse.add(mouse2);

			
			Mouse mouse3 = new Mouse(true, 5, "Grande"); 
			listaMouse.add(mouse3);

				
				try (BufferedWriter escrever = new BufferedWriter(new FileWriter("Mouses.txt"))) {
					for (Mouse mouse : listaMouse) 
						escrever.write(mouse.toString()); // to string para "rodar" a lista de mouses que contem as informa��es de cada mouse.
				}
				

		}

	}
