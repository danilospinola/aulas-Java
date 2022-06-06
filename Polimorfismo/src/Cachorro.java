
public class Cachorro extends Animal{



	@Override //Override do método falar da super classe animal.
	public void Falar() {
		// TODO Auto-generated method stub
		System.out.println("AUAU"); ;//Mostra no console "AUAU"
	}

	public void Morder() { //Método morder proprio de cachorro
		System.out.println("NHAC ");  //Mostra no console "Nhac"
	}
}
