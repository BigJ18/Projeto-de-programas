package br.edu.uea;

public class MinhaContaTeste {
  
  public static void main(String[] args) {
    
    MinhaConta minhaConta;
    minhaConta = new MinhaConta();
    minhaConta.nomeCliente = "Anna Maria";
    minhaConta.agencia = "0001";
    minhaConta.numeroConta = "1234-5";
    minhaConta.saldo = 1000;
    System.out.println("Cliente: " + minhaConta.nomeCliente);
    System.out.println("O saldo é " + minhaConta.saldo);
    
    minhaConta.sacar(100);
    
  }
 
}
