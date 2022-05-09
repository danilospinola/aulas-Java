
public class Aplicacao {

	public static void main(String[] args) {

			//Instância o preparador
		Preparador preparador = new Preparador ();
		
		//Instância o leite quente
		LeiteQuente leiteQuente = new LeiteQuente ();
		
		//Chama o leite quente no metodo preparar bebida.
		preparador.prepararBebida(leiteQuente);
		
		//Instância o refrigerante
		Refrigerante refrigerante = new Refrigerante ();
		
		preparador.prepararBebida(refrigerante);

	}

}
