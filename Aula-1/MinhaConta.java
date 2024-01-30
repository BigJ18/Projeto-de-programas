package br.edu.uea;

public class MinhaConta {
  
  String numeroConta;
  String agencia;
  String nomeCliente;
  double saldo;
  
  
  

  boolean sacar(double valor){
	  if (saldo >= valor && valor>0) {
		saldo = saldo - valor;
		return true;
	  
	  }
		 return false;
	  }
     
  
  void depositar(double valor) {
	    saldo = saldo + valor;
  }

}
