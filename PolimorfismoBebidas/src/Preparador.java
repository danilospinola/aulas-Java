
public class Preparador {

	//Classe de passagem
	
	//metodo publico que recebe uma bebida
	
	public void prepararBebida(Bebida bebida) {
		System.out.println("Preparando a  bebida "+ bebida.getNome()+ "...");
		
		bebida.Preparar();
		
		if (bebida.isAquecer()) {
			System.out.println("Aquecendo a bebida "+ bebida.getNome()+"...");
		}
		else {
			System.out.println("Esfriando a bebida "+ bebida.getNome()+"...");
		}
	System.out.println("Bebida pronta.");
	System.out.println("-------------------------------------------------------------------------------");
	}
	
}
