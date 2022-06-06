
public class Main {

	public static void main(String[] args) {
	
//		ContaBancaria conta1 = new ContaBancaria(true, 3.0); //ContaBancaria(); = Sendo o contrutor e conta1 =  como a variável
//		ContaBancaria conta2 = new ContaBancaria(true, 5.0); 
//		
//		conta1.ativo = true;  
//		conta1.numConta = 1234;
//		conta1.saldo = 100.50;
//		 
		//Mostra no console os dados da conta 1
//		System.out.println(conta1.ativo);
//		System.out.println(conta1.numConta);
//		System.out.println(conta1.saldo);
//		
		//Mostra no console a conta1 recebendo dinheiro e mostrando o saldo
//		System.out.println("Conta 1 \n");
//		conta1.receber(100.8);
//		System.out.println("O saldo da conta 1 agora é de "+conta1.saldo()+" reais \n");
		//Transfere para conta 1 uma quantia e mostra o saldo.
//		conta1.transferir(30);
//		System.out.println("O saldo da conta 1 agora é de "+ conta1.saldo()+" reais \n");
//		
		//Mesma coisa da conta1 só que dessa vez com a conta 2
//		System.out.println("Conta 2 \n");
//		conta2.receber(200);
//		System.out.println("O saldo da conta 2 agora é de "+conta2.saldo()+" reais \n");
//		conta2.transferir(400);
//		System.out.println("O saldo da conta 2 agora é de "+ conta2.saldo()+" reais \n");
//		
		Cliente cliente = new Cliente(); // Cria um cliente
		
		//Coloca os dados do cliente.
		cliente.setNome("Danilo");
		cliente.setCpf(121);
		cliente.setNumConta(5546543);
		
		//Mostra os dados do cliente.
		System.out.println(cliente);
		
		Cliente cliente2 = new Cliente();
		cliente2.setNome("Danilo");
		cliente2.setCpf(121);
		cliente2.setNumConta(5546543);
		
//		 //Mostra os dados do cliente. 
		System.out.println(cliente2);	
		
		if(cliente.equals(cliente2)) { //Se os dados do cliente 1 for igual ao dos cliente 2 mostra no console que os dados são iguais.
			System.out.println("Os dados são iguais");
		}else {
			System.out.println("Os dados são diferentes");
		}
		
//		if(cliente == cliente2) {
//			System.out.println("Os objetos são iguais");
//		} else {
//			System.out.println("Os objetos são diferentes");
//		}

	}

}
