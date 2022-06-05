
public abstract class Item {
	
	
	//Atributos que podem ser herdados de item.
	private int posX;	
	private int posY;
	
	//metodos obrigatorios
	public abstract void pegar();
	
	//getter e setter
	public int getPosX() {
		return posX;
	}
	public void setPosX(int posX) {
		this.posX = posX;
	}
	public int getPosY() {
		return posY;
	}
	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	//getter e setter
}
