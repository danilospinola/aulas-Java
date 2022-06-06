
public class main {

	public static void main(String[] args) {

		Pessoa pessoa1 = new Pessoa();
		pessoa1.nome = "Danilo";
		pessoa1.numfigurinhas = 1; //Inicia danilo com 1 figurinha
		
		pessoa1.receber(3); //Usa o metodo receber figurinhas de pessoa
		pessoa1.dar(3); //Usa o metodo dar figurinhas de pessoa
		
		System.out.println(pessoa1.nome); //Mostra no console o nome da pessoa
		System.out.println(pessoa1.numfigurinhas);  //Mostra no console o numero de figurinhas da pessoa
		 
	}

}
