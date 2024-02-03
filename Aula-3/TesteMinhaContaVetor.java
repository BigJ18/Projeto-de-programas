package br.edu.uea;

public class TesteMinhaContaVetor {

	public static void main(String[] args) {
		
		MinhaConta c1 = new MinhaConta();
		c1.depositar(1000);
		c1.cliente = new Cliente();
		c1.cliente.nome = "Anna";
	
		MinhaConta c2 = new MinhaConta();
		c2.depositar(2000);
		c2.cliente = new Cliente();
		c2.cliente.nome = "Maria";
		
		MinhaConta [] cadastro = new MinhaConta[2];
		
		cadastro[0] = c1;
		cadastro[1] = c2;
		
		for (int i = 0; i < cadastro.length; i++) {
			
			System.out.println(cadastro[i].cliente.nome + " - " + (cadastro[i].saldo));
		}
		
		for (int i = 0; i < cadastro.length; i++) {
			MinhaConta conta = cadastro[i];
			
			System.out.println(conta.cliente.nome + " - " + conta.saldo);
		
		}
				
	}
	
}
