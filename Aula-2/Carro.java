package br.edu.uea;

public class Carro {
	String cor;
	String modelo;
	double velocidadeAtual;
	double velocidadeMaxima;
	Motor motor;
	
	public void ligar() {
		System.out.println("O carro está ligado");
	}
    public void acelerar(double quantidade) {
    	this.velocidadeAtual += quantidade;
    }
    public void freiar() {
    	System.out.println("O carro está freiando");
    }
}
