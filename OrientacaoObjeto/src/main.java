
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Danilo";
		pessoa1.numfigurinhas = 1;
		
		pessoa1.receber(3);
		pessoa1.dar(3);
		
		System.out.println(pessoa1.nome);
		System.out.println(pessoa1.numfigurinhas);
		
	}

}
