
public class Mouse {
	private String funciona;
	private String qtdBotoes;
	private String tamanho;
	
	
	
	
	
	

	//<-----------------Constructor using fields ---------------------->
	public Mouse(String funciona, String qtdBotoes, String tamanho) {
		this.funciona = funciona;
		this.qtdBotoes = qtdBotoes;
		this.tamanho = tamanho;
	}
	//<-----------------Constructor using fields ---------------------->
	
	
	// <---------------------------------Setters e getters------------------------------------>
	public String isFunciona() {
		return funciona;
	}
	public void setFunciona(String funciona) {
		this.funciona = funciona;
	}
	public String getQtdBotoes() {
		return qtdBotoes;
	}
	public void setQtdBotoes(String qtdBotoes) {
		this.qtdBotoes = qtdBotoes;
	}
	public String getTamanho() {
		return tamanho;
	}
	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}
	// <---------------------------------Setters e getters------------------------------------>
	
	
	@Override
	public String toString() {
		return "Mouse: funciona=" + funciona + ", qtdBotoes=" + qtdBotoes + ", tamanho=" + tamanho ;
	}
	
	
	//<-------------------------Override To string --------------------------------------->

	
	public Mouse(String texto) {
		String[] arrayAuxiliar1 = texto.split(",");
		String[] arrayAuxiliar2 = arrayAuxiliar1[0].split("=");
		this.funciona = arrayAuxiliar2[1].trim();
		
		String[] arrayAuxiliar3 = arrayAuxiliar1[1].split("=");
		this.qtdBotoes = arrayAuxiliar3[1].trim();
		
		String[] arrayAuxiliar4 = arrayAuxiliar1[2].split("=");
		this.tamanho = arrayAuxiliar4[1].trim();
	}
	
}
