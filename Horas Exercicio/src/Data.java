
public class Data {

	public static final int FORMATO_12H = 1; //Constante de inteiro do formato 12 horas = 1,  que serve para diferecenciar os formatos
	public static final int FORMATO_24H = 2;
	
	//<------------------------------------Atributos------------------------>
	private int dia;
	private int mes;
	private int ano;
	private int hora = -1;
	private int minuto = -1;
	private int segundo = -1; //Comeca -1 pois caso não tenha sido atribuida nenhum valor para elanos 
	//<------------------------------------Atributos------------------------>	
	
	public Data(int dia, int mes, int ano) { //Constructor in fields, classe pode ser gerada com os atributos dia, mes e ano 
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	public Data(int dia, int mes, int ano, int hora, int minuto, int segundo) { //Constructor in fields, classe pode ser gerada com os atributos dia, mes, ano, hora, minuto e segundo.
this (dia,mes,ano);		

this.hora = hora;
this.minuto = minuto;
this.segundo = segundo;
	}
	
	
	
	public void imprimir (int formato) { //Método imprimir de retorno vazio que requer um formato, sendo ele o de 24 horas e o de 12 horas
		String data = dia +"/" + mes + "/" + ano; //Variavel data que armazena os atributos dia, mes e ano; e os separa com uma barra.
		
		if (hora == -1) { //Caso a hora seja = a -1 ou seja não tenha sido iniciada o método só ira imprimir a variavel data
			System.out.println(data);
		}else { //Caso a hora não tenha sido iniciada com -1, ou seja, caso a data tenha algum valor atribuido faça:
			
			String horario = ":" + minuto + ":" + segundo; // Variavel horario que guarda o minuto e o segundo e os separam por ":"
			
			if(formato == FORMATO_24H) { // Se o formato for igual ao de 24 horas imprimi normalmente o formato
				horario = hora + horario;
			}else { // Se o formato não for 24 horas faça:
				if (hora == 0) { // Se a hora for igual a 0 adiciona 12 para poder realizar o formato 12 horas (Lógica).
					horario = 12 + horario;
					horario += " AM";
				}else if (hora >= 12) { // Se a hora for maior ou igual a 12 faz a hora menos 12 e a adiociona ao horario(Para caso for tarde)
					horario = (hora - 12) + horario;
					horario += " PM";
				} else {  // Se não for nenhuma das outras opções  Adiciona a hora no horario normalmente
					horario = hora + horario;
					horario += " AM";
				}
			}
			 System.out.println(data + " " + horario); // Mostra no console as datas.
		}
	}
	//<--------------------------------Getters--------------------------->
	public int getDia() {
		return dia;
	}

	public int getMes() {
		return mes;
	}

	public int getAno() {
		return ano;
	}

	public int getHora() {
		return hora;
	}

	public int getMinuto() {
		return minuto;
	}

	public int getSegundo() {
		return segundo;
	}
	//<--------------------------------Getters--------------------------->
}
