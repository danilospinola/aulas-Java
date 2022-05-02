
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1 = new Cliente();
		cliente1.setNome("Danilo");
		cliente1.setCpf(43628);
		cliente1.setNumConta(555156);

		System.out.println(cliente1);

		Cliente cliente2 = new Cliente();

		cliente2.setNome("Danilo");
		cliente2.setCpf(43628);
		cliente2.setNumConta(555156);

		System.out.println(cliente2);

		if (cliente1 == cliente2) {
			System.out.println("os  endereços de objetos são iguais");
		} else {
			System.out.println("os endereços de objetos são diferentes");
		}

		if (cliente1.equals(cliente2)) {
			System.out.println("os atributos são iguais");
		} else {
			System.out.println("os atributos são diferentes");
		}
	}
}
