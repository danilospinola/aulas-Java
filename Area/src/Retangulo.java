
public class Retangulo implements AreaCalculavel {

	private int  altura;
	private int  base;
	

	//<------------------------- Getters e setters ---------------------------------------->
	public int getAltura() {
		return altura;
	}





	public void setAltura(int altura) {
		this.altura = altura;
	}





	public int getBase() {
		return base;
	}





	public void setBase(int base) {
		this.base = base;
	}

//<------------------------- Getters e setters ---------------------------------------->



	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("A área do retângulo é igual a : " + base * altura); //Pega o método da interface e da override nele; calcula a área de um retângulo.
	}


	}


