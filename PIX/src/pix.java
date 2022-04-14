import java.util.Scanner;

public class pix {

	public static void main(String[] args) {
int Menu = 0;

System.out.println("Digite que tipo de função deseja: ");
System.out.println("1 para digitar nome");
System.out.println("2 para transferir");
System.out.println("3 para Receber");
System.out.println("4 para sair");

Scanner input = new Scanner(System.in);
Pessoa pessoa1 = new Pessoa();
Pessoa pessoa2 = new Pessoa();
pessoa1.total = 250;
pessoa2.total = 500;

while(Menu != 4) {
Menu = input.nextInt();
switch (Menu ) { 



case 1:
	System.out.println("Digite seu nome: ");
	pessoa1.nome = input.next();
	System.out.println("seu nome será "+ pessoa1.nome);
	
	System.out.println("Digite o nome da 2° pessoa: ");
	pessoa2.nome = input.next();
	System.out.println("seu nome será "+ pessoa2.nome);



case 2:
System.out.println("Digite o valor a transferir da 1° pessoa  a 2° pessoa ");
pessoa1.valor = input.nextInt();	
	pessoa1.transferir(pessoa1.valor, pessoa2);
	






case 3:
System.out.println("escreva o valor a receber da 2° pessoa para a 1° pessoa");
pessoa1.valor = input.nextInt();
pessoa1.receber(pessoa2.valor);
	}
}
}
}
