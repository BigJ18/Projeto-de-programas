package br.edu.uea;

public class MinhaConta {
  
  String numeroConta;
  String agencia;
  String nomeCliente;
  double saldo;
  
  

  void sacar(double valor){
	  saldo = saldo - valor;
      
  }
  
  void depositar(double valor) {
	    saldo = saldo + valor;
  }

}
