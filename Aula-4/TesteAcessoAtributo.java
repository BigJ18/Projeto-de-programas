package br.edu.uea;

public class TesteAcessoAtributo {

	public static void main(String[] args) {
		
		MinhaConta conta = new MinhaConta(500);
		
		System.out.println(conta.getSaldo());
		
		conta.setAgencia("001");
		System.out.println("Agencia: " + conta.getAgencia());
		
		conta.definirNumeroConta("254672-2");
		
		conta.setCliente(new Cliente());
		
		conta.getCliente().setNome("Anna Maria");
		System.out.println("Cliente: " + conta.getCliente().getNome());
		
		MinhaConta conta2 = new MinhaConta();
		
		System.out.println("Saldo 2: " + conta2.getSaldo());
		
		System.out.println("Contador 1: " + conta.getContador());
		System.out.println("Contador 1: " + conta2.getContador());
		
		
	}

}
