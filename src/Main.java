public class Main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro();
//		animal.falar();
//		
//		animal = new Gato();
//		animal.falar();

		Gato gato = new Gato();
		Cachorro cachorro = new Cachorro();

		Falar(gato);
		Falar(cachorro);
		Falar(cachorro);
		Falar(cachorro);
		Falar(cachorro);
		Falar(gato);

	}

	public static void Falar(Animal a) {
		a.Falar();

		if (a instanceof Cachorro) {
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
