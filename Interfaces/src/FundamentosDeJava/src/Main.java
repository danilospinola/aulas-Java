import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		

				
				//int x = 100;
				//double y = 200;
				//int a = 0;
				//double b = 0;
				//short z = (short) 10000;
				//System.out.println(z);
				
				//a = (int)y;
				//b = x;
				//System.out.println(a);
				//System.out.println(b);
				
				//int idadePessoa = 17;
				
				//if(idadePessoa < 18) {
					//System.out.println("Voc� n�o pode beber");
				//}
				
				//else if(idadePessoa < 60) {
					//System.out.println("Bora tomar uma");
				//}
				
				//else {
					//System.out.println("Voc� est� na terceira idade");
				//}
				
				//System.out.println("Voc� tem " + idadePessoa + " anos");
					
				//valores constantes usa-se o switch case
				//o break determina um limite para o seu codigo
				
//				int num = 8;
//				switch (num) {
//				
//					case 1:
//						System.out.println("Hoje � Domingo");
//							break; 
//					case 2:
//						System.out.println("Hoje � Segunda-feira");
//							break;
//					case 3:
//						System.out.println("Hoje � Ter�a-fera");
//							break;
//					case 4:
//						System.out.println("Hoje � Quarta-feira");
//							break;
//					case 5:
//						System.out.println("Hoje � Quinta-feira");
//							break;
//					case 6:
//						System.out.println("Hoje � Sexta-feira");
//							break;
//					case 7: 
//						System.out.println("Hoje � Sabado");
//							break;
//					default:
//						System.out.println("Esse n�mero n�o representa um dia da semana");
//				}
//				
//				char caractere = 'a';
//				
//				switch (caractere) {
//				case 'a':
//					System.out.println("Seu caractere � a");
//					break;
//				case 'b':
//					System.out.println("Seu caractere � b");
//					break;
//				default:
//					System.out.println("valor inv�lido");
//					
//			}
				
//					String farol = "verde";
//						
//					switch (farol) {
//					
//					case "vermelho":
//						System.out.println("Pare");
//						break;
//					case "amarelo":
//						System.out.println("Aten��o");
//						break;
//					case "verde":
//						System.out.println("Prossiga");
//						break;
//						
//					default: 
//						System.out.println("Valor inv�lido");
//						
//					}
				//teste de condicional, mostrando a condi��o
		
		
//				int x = 0;
//				while(x < 10) { 
//				
//					System.out.println(x);
//					x = x+1;
		// }

//			int x=0;
//			while(x<10) {
//				System.out.println(x);
//				x=x+1;
//			}
		//	
//			x=0;
//			//Se a condi��o for verdadeira ele executa o seguinte c�digo:
//			do {
//				System.out.println(x);
//				x=x+1;
//			} while (x<10);
			
				//
//				for(int x=0; x<=10; x++) {
//					System.out.println("9 x " + x + " = " + x*9);
//				}
		
		int x1 = 3;
		int y1 = 5;
		int z1 = 7;
		
		   
		System.out.println(x1);
		System.out.println(y1);
		System.out.println(z1);         //Mostrando o valor das variaveis uma por uma
		
		System.out.println("--------------------------------------");//separador de exemplo
		
		double x[] = {3, 5, 7}; //Cria��o de matriz de double com tamanho indefinido.
		
		for (int aux = 0; aux < x.length; aux++) {
			System.out.println("Valor do indice " + aux + " = " + x[aux]); //Mostra o valor do indice dos numeros da matriz e tambem mostra o valor do numero da matriz
		}
		
		System.out.println("--------------------------------------"); //separador de exemplo
		
		
		String nome [] = {"Danilo", "Caio", "Isa", "Kaique", "Medina"}; // Matriz de String com tamanho indefinido
		
		
		for (int aux1 = 0; aux1 < nome.length; aux1++) {
			System.out.println(nome[aux1]);
			if (nome[aux1] == "Danilo") { //procura o nome Danilo na matriz
				System.out.println("O indice de Danilo � = " + aux1); //Mostra o indice da Matriz do nome procurado
			}
		}
		
		System.out.println("--------------------------------------"); //separador de exemplo
		
		int[] arrayInt = new int [5];  //matriz de tamanho 5 do tipo int
		String[] ArrayString = new String[4]; //matriz de tamanho 4 do tipo String
		double[] Arraydouble = new double[3]; //matriz de tamanho 4 do tipo double
		
		
		arrayInt[3] = 4;
		
		int[] numero = new int[6]; // Gera uma matriz de tamanho 6 do tipo int
		Scanner teclado = new Scanner (System.in); //Inst�ncia um scanner
		
		for (int aux2 = 0; aux2 < numero.length; aux2++ ) { //enquanto a variavel aux2 for menor que o tamanho da matriz numero, fa�a:
			System.out.println("Digite um numero qualquer");
			numero[aux2] = teclado.nextInt(); //Aperte enter para ir para o proximo numero da matriz.
		}
		
		for (int aux2 = 0; aux2 < numero.length; aux2++ ) { // mostra os indices de cada numero da matriz.
			System.out.println("Indice " + aux2 + " = " + numero[aux2]);
		}
		
		
			}
	}
