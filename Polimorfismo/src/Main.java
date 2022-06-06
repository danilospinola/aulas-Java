public class Main {

	public static void main(String[] args) {

//		Animal animal = new Cachorro(); //Instância um animal no construtor de cachorro
//		animal.falar();
//		
//		animal = new Gato(); /muda o animal para o construtor de cachorro
//		animal.falar();

		Gato gato = new Gato(); //Instância um gato.
		Cachorro cachorro = new Cachorro(); //Instância um Cachorro.

		Falar(gato); //Usa o falar de gato
		Falar(cachorro); //Usa o falar de Cachorro
		Falar(cachorro);//Usa o falar de Cachorro
		Falar(cachorro);//Usa o falar de Cachorro
		Falar(cachorro);//Usa o falar de Cachorro
		Falar(gato); //Usa o falar de gato

	}

	public static void Falar(Animal a) {
		a.Falar(); //Usa o falar de um animal.

		if (a instanceof Cachorro) { // Se a variavel "a" for um cachorro , além dele falar o cachorro irá morder
			Cachorro c = (Cachorro) a;
			c.Morder();
		}
	}

}
