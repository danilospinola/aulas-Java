public class Pessoa {
	String nome;
	int numfigurinhas;
	
	void receber (int numfigurinhas) {
		this.numfigurinhas += numfigurinhas; //Método que recebe um numero de figurinhas
	}
		
	void dar (int numfigurinhas) { //Método que da um numero de figurinhas
		this.numfigurinhas -= numfigurinhas;
	}
}
