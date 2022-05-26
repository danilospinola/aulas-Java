
public class Mouse {
	private boolean funciona;
	private int qtdBotoes;
	private String tamanho;
	
	
	//<-----------------Constructor using fields ---------------------->
	public Mouse(boolean funciona, int qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	//<-----------------Constructor using fields ---------------------->
	
	
	// <---------------------------------Setters e getters------------------------------------>
	public boolean isFunciona() {
		return funciona;
	}
	public void setFunciona(boolean funciona) {
		this.funciona = funciona;
	}
	public int getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(int qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	// <---------------------------------Setters e getters------------------------------------>
	
	
	//<-------------------------Override To string --------------------------------------->
	@Override
	public String toString() {
		return "\nMouse [funciona = " + funciona + ", Quantidade de Botoes = " + qtdBotoes + ", tamanho = " + tamanho + " ]";
	}
	//<-------------------------Override To string --------------------------------------->
	
}
