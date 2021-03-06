
public class Main {
	public static final double  PI = 3.14; //Cria??o de constante De maneira diferente do Enum

	private enum Sexo{
		MASCULINO, FEMININO 
	}
	
	public static void main(String[] args) {
		
		
		double pi = Main.PI; //Mostrando que para cada constante que criar sem ser no enum tem que ser guardada em algum lugar.
		
		DiaDaSemana hoje = DiaDaSemana.SEGUNDA;
		
		int num = DiaDaSemana.SEGUNDA.getNum(); //Pega o Dia da semana e o numero do indice
	
		System.out.println(num);// Mostra a variavel num que contem o indice de segunda.
		
		String s = "TERCA"; //Guarda o nome ter?a na variavel s
		hoje = DiaDaSemana.valueOf(s);// Procura no Enum a string que est? na variavel s e coloca na variavel hoje.
		
		
		System.out.println(hoje.getNum()); // Mostra o Dia de hoje, no caso seria ter?a pelo que esta guardado na variavel s 
		
		Sexo sexo = Sexo.FEMININO; //sexo ? do tipo Feminino
		sexo = Sexo.MASCULINO; // sexo ? do tipo Masculino
	}

}
