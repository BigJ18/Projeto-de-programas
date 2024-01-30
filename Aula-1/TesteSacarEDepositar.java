package br.edu.uea;

public class TesteSacarEDepositar {
	

	public static void main(String[] args) {
	    
	    MinhaConta minhaConta;
	    minhaConta = new MinhaConta();
	    minhaConta.nomeCliente = "Anna Maria";
	    minhaConta.agencia = "0001";
	    minhaConta.numeroConta = "1234-5";
	    minhaConta.saldo = 1000;
	    
	    System.out.println("Cliente: " + minhaConta.nomeCliente);
	    System.out.println("O saldo inicial é " + minhaConta.saldo);
	
	    minhaConta.sacar(100);
	    
	    System.out.println("O saldo após o saque é " + minhaConta.saldo);
	    
	    minhaConta.depositar(500);

	    System.out.println("O saldo após o depósito é " + minhaConta.saldo);
}
	
}
