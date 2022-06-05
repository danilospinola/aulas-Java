
public class Aplicacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Item item = new Item(); Classe abstratas não são instanciadas 
		
		Item item = new Cogumelo (); //Instância um cogumelo e guarda na varivavel item
		item.pegar();
		
		item = new Moeda();
		item.pegar();
		
		item = new Diamante();
		item.pegar();
	}

}
