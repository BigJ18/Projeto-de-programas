package br.edu.uea.model;

public class funcionario2 {
      private String cpf;
      private String nome;
      private double salario;
      
      public funcionario2(double salario) {
    	  this.salario = salario;
      }
      
      public double getBonus() {
    	  return salario * 1.2;
      }
      
      public funcionario2() {
    	  
      }
      
      public funcionario2(String cpf, String nome, double salario) {
    	  this.cpf = cpf;
    	  this.nome = nome;
    	  this.salario = salario;
      }
      
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
