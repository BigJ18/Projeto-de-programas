package br.edu.uea;

public class MinhaConta {

	private String numeroConta;
	private String agencia;
	private Cliente cliente;
	private double saldo;
	
	private static int contador;
	
	public int getContador() {
		return contador;
	}
	
	
	public MinhaConta() {
		
		contador++;
		saldo = 50;
		System.out.println("Chamou o construtor padrão");
	}
	
	public MinhaConta(double saldo) {
		contador++;
		this.saldo = saldo;
		
	}
	

	public String getNumeroConta() {
		
		return numeroConta;
	
	}

	public void setNumeroConta(String numeroConta) {
		
		this.numeroConta = numeroConta;
	
	}

	public Cliente getCliente() {
		
		return cliente;
	
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getAgencia() {

		return agencia;

	}
	
	public void setAgencia(String agencia) {
		
		this.agencia = agencia;
		
	}

	public double getSaldo() {

		return saldo;
	}

	boolean sacar(double valor) {
		if (saldo >= valor && valor > 0) {
			saldo = saldo - valor;
			return true;

		}
		return false;
	}

	void depositar(double valor) {
		saldo = saldo + valor;
	}

	boolean transferir(double valor, MinhaConta contaDestino) {

		if (sacar(valor)) {
			contaDestino.depositar(valor);
			return true;
		}
		return false;

	}
	
	void definirNumeroConta(String numConta) {
		
		numeroConta = numConta;
		
	}
	
}
