package br.edu.uea;

public class TesteSacarBoolean {

	public static void main(String[] args) {

		MinhaConta minhaConta = new MinhaConta();
		minhaConta.depositar(500);
		
		if (minhaConta.sacar(-100)) {

			System.out.println("Saque realzado com sucesso.");

		} else {

			System.out.println("Saldo insuficiente.");
		}
		System.out.println("Saldo: " + minhaConta.saldo);
	}

}
