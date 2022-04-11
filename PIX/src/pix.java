import java.util.Scanner;

public class pix {

	public static void main(String[] args) {
int Menu;
		
System.out.println("Digite que tipo de função deseja: ");
System.out.println("1 para digitar nome");
System.out.println("2 para transferir");
System.out.println("3 para Receber");

Scanner input = new Scanner(System.in);
Pessoa pessoa1 = new Pessoa();


Menu = input.nextInt();
if (Menu == 1) {
	System.out.println("Digite seu nome: ");
	pessoa1.nome = input.next();
}

pessoa1.transferir(0);
pessoa1.receber(0);


	}

}
