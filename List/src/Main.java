import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		List lista = new ArrayList(); //Cria uma nova lista 

		lista.add("abc"); // coloca o abc na posi��o 0 na lista
		lista.add(12); // coloca o 12 na posi��o 1 na lista
		lista.add(true); // coloca true na posi��o 3 na lista
		for (int x = 0; x < lista.size(); x++) {
			System.out.println(lista.get(x));
		}
		System.out.println();
		lista.remove(0); // remove a informa��o da posi��o 0
		for (Object valor : lista) { // valor do tipo object pois na lista n�o tem apenas um tipo de dado.
			System.out.println(valor); // Mostra o valor da lista no console

		}

		lista.add(0, "def");
		for (Object valor : lista) { // valor do tipo object pois na lista n�o tem apenas um tipo de dado.
			System.out.println(valor); // Mostra o valor da lista no console
		}
		
		System.out.println("---------------------------");
		
		lista.set(0, "glhf"); // Coloca ghlf na posi��o 0 e substitui o def

		for (Object valor : lista) { // valor do tipo object pois na lista n�o tem apenas um tipo de dado.
			System.out.println(valor); // Mostra o valor da lista no console
		}
		lista.clear(); // Limpa a lista
		if (lista.isEmpty()) { // se a lista estiver vazia mostra no console "Sua lista est� vazia"
			System.out.println("\n Sua lista est� vazia");
		}
		
		Conta conta1 = new Conta("�gua", 60.00) ;
		Conta conta2 = new Conta("luz", 120.00) ;
		
		List <Conta> listaDeContas = new ArrayList<Conta>();
		
		listaDeContas.add(conta1);
		listaDeContas.add(conta2);
		
		for (Conta conta : listaDeContas) { // valor do tipo object pois na lista n�o tem apenas um tipo de dado.
			System.out.println(conta); // Mostra o valor da lista no console
		}
	}
	

}
