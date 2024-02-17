package br.edu.uea.model;

public class Gerente extends funcionario2{
	
    private int senha;
    
    public double getBonus() {
  	  return getSalario() * 1.5;
    }
    
    public Gerente(double salario) {
    	super(salario);
    }
    
    public Gerente() {
    
    }
    
    public boolean autenticar(int senha) {
    	return this.senha == senha;
    	
    }

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
    
    
}
