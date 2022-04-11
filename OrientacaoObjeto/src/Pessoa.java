public class Pessoa {
	String nome;
	int numfigurinhas;
	
	void receber (int numfigurinhas) {
		this.numfigurinhas += numfigurinhas;
	}
		
	void dar (int numfigurinhas) {
		this.numfigurinhas -= numfigurinhas;
	}
}