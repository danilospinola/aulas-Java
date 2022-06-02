
public class Endereco {
	
	private String rua;
	private int numero;
	private String bairro;
	
	
	
	public Endereco(String[] ArrayLine) {
		
		String[] ArrayRua = ArrayLine[3].split("=");
		this.rua = ArrayRua[1].trim();
				
		String[] ArrayNumero = ArrayLine[4].split("=");
		this.numero = Integer.parseInt(ArrayNumero[1].trim());
		
		String[] ArrayBairro = ArrayLine[5].split("=");
		this.bairro = ArrayBairro[1].trim();
	}

	public Endereco() {
		
	}
	

	public String getRua() {
		return rua;
	}
	
	
	public void setRua(String rua) {
		this.rua = rua;
	}
	
	
	public int getNumero() {
		return numero;
	}
	
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
	public String getBairro() {
		return bairro;
	}
	
	
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}


	@Override
	public String toString() {
		return ", Rua=" + rua + ", Numero=" + numero + ", Bairro=" + bairro ;
	}
	
	
}
