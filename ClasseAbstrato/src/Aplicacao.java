
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Item item = new Item(); Classe abstratas n�o s�o instanciadas 
		
		Item item = new Cogumelo ();
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
	}

}
