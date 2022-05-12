
public class Retangulo implements AreaCalculavel {

	private int  altura;
	private int  base;
	

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





	@Override
	public void calcularArea() {
		// TODO Auto-generated method stub
		System.out.println("A área do retângulo é igual a : " + base * altura);
	}


	}


