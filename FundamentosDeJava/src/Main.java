import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	// TODO Auto-generated method stub
			// int x = 100;

			// double y = 200;

			// int a = 0;
			// double b = 0;

			// a = (int)y;
			// b = x;

			// System.out.println(a);
			// System.out.println(b);

//			//int idadePessoa = 10;
	//
//			//if (idadePessoa < 18) {
//				//System.out.println("Você não pode beber");   // Se a idade da pessoa  for menor que 18 mostra no console "Você não pode beber"
//			//}
	//
//			//else if (idadePessoa < 60) {                    //Se a idade da pessoa for menor que 60 mostra no console "Bora tomar uma"
//			//	System.out.println("Bora tomar uma");
//			}else {
//				System.out.println("Vai dormir idoso!");
//			}
	//
//			System.out.println("Você tem " + idadePessoa + " anos");
			
//			
//			int diasSemana = 8;
	//
//			 switch(diasSemana) {
//			 	case 1 :
//			 		System.out.println("Domingo");
//			 		break;
//			 	case 2:
//			 		System.out.println("Segunda");
//			 		break;
//			 	case 3:
//			 		System.out.println("Terça");
//			 		break;
//			 	case 4:
//			 		System.out.println("Quarta");
//			 		break;
//			 	case 5:
//			 		System.out.println("Quinta");
//			 		break;
//			 	case 6:
//			 		System.out.println("Sexta");
//			 		break;
//			 	case 7:
//			 		System.out.println("Sábado");
//			 		break;
//			 	default:
//			 		System.out.println("Esse número não representa um dia da semana");
//			 	
//		}
			
			
	//
	//}
	//}
			
			
//			char caractere = 'a';
//					
//					switch(caractere) {
//					case'a':
//						System.out.println("Seu caractere é a");
//						break;
//					case 'b':
//						System.out.println("Seu caractere é b");
//						break;
//					default:
//						System.out.println("Valor inválido");
//						
//					}
	//
//		}
//		}
			
//			String farol = "vermelho";
//			
//			switch(farol) {
//			case "vermelho":
//				System.out.println("Tampa a placa e vai");
//				break;
//			case "amarelo":
//				System.out.println("Celeraa muito");
//				break;
//			case "verde":
//				System.out.println("Celera mas agora legalmente");
//				break;
//				default:
//					System.out.println("Cê é burro?");
//			}}}
			
			
//			

			
//			for(int x = 2; x<11; x++ ) {
//				System.out.println(x);
//			}
//		}
	//}
//			
//			int valorUsuario;
//			int multiplicador = 0;
//			int total = 0;
//			
//			Scanner ler = new Scanner(System.in);
//			System.out.println("Informe um número: ");
//			valorUsuario = ler.nextInt();;
//			
//			for (int x = 0; x<10; x++) {
//				total = valorUsuario * ++multiplicador;
////				System.out.println(valorUsuario +  "x" + multiplicador + " = " + total);
////	}
//    }
		
	//matriz- criar uma variavel, que pod ter varias 
//	int x1 = 3;
//	int y1 = 5;
//	int z1 = 7;
//	
//	System.out.println(x1);
//	System.out.println(y1);
//	System.out.println(z1);
//	
//	double x[] = {3, 5, 3, 5};
//	for (int aux = 0; aux < x.length; aux++) {
//		System.out.println("Valor di indice " + aux + " = " + x [aux]);
//	}
//	
//	String nome[] = { "Isa", "Caio", "Valeria"};
//	
//	for (int aux1 = 0; aux1 < nome.length; aux1++) {
//		System.out.println(nome[aux1]);
//		if(nome[aux1] == "Isa") {
//			System.out.println("O indice de Isa é = " + aux1);
//		}
//	}
//	
//	int[] arrayInt = new int[5];
//	String[] ArrayString = new String [4];
//	double[] ArrayDouble =  new double [3];
//	
//	arrayInt [3] = 4;
//	int[]numero = new int [6];
//	Scanner teclado =  new Scanner (System.in);
//	
//	for (int aux2 = 0; aux2 < numero.length; aux2++) {
//		System.out.println("Digite um numero qualquer");
//	numero[aux2] = teclado.nextInt();
//	}
//	
//	for (int aux2 = 0; aux2 < numero.length; aux2++) {
//		System.out.println("Indice " +aux2+ " = "+ numero[aux2]);
//		
//	}
		int[][] arrayBidirecional = new int[4][3]; //Cria uma matriz com 4 linhas e 3 colunas

		arrayBidirecional[0][0] = 8; //Coloca o valor 8 na linha 0 coluna 0

		arrayBidirecional[2][1] = 7;

		for (int linha = 0; linha < arrayBidirecional.length; linha++) {
			for (int coluna = 0; coluna < arrayBidirecional[0].length; coluna++) {
				System.out.print("Indice [" + linha + "][" + coluna + "] = " + arrayBidirecional[linha][coluna] + " "); //Mostra na tela todas as linhas e colunas da matriz.
			}
			System.out.println();
		}
	}
}
