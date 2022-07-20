package fundamentos;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Funcionario funcionario1 = new Funcionario();
		Funcionario funcionario2 = new Funcionario();
		Scanner teclado = new Scanner(System.in); // Instância um scaner

		System.out.println("Digite seu nome: ");
		funcionario1.setNome(teclado.next());

		System.out.println("Digite seu salario");
		funcionario1.setSalario(teclado.nextFloat());

		System.out.println("<-------------------------------------------------------------------->");
		System.out.println("Digite seu nome: ");
		funcionario2.setNome(teclado.next());

		System.out.println("Digite seu salario");
		funcionario2.setSalario(teclado.nextFloat());

		if (funcionario1.getSalario() > funcionario2.getSalario()) {
			float Mv = funcionario1.getSalario() - funcionario2.getSalario();
			System.out.println(funcionario1.getNome() + " tem " + Mv + " a mais do que " + funcionario2.getNome());
		} else {
			float Mv = funcionario2.getSalario() - funcionario1.getSalario();
			System.out.println(funcionario2.getNome() + " tem " + Mv + " a mais do que " + funcionario1.getNome());
		}
	}

}
