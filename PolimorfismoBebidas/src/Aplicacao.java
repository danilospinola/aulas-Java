
public class Aplicacao {

	public static void main(String[] args) {

			//Inst�ncia o preparador
		Preparador preparador = new Preparador ();
		
		//Inst�ncia o leite quente
		LeiteQuente leiteQuente = new LeiteQuente ();
		
		//Chama o leite quente no metodo preparar bebida.
		preparador.prepararBebida(leiteQuente);
		
		//Inst�ncia o refrigerante
		Refrigerante refrigerante = new Refrigerante ();
		
		preparador.prepararBebida(refrigerante);

	}

}
