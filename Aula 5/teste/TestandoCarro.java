package br.edu.uea.teste;

public class TestandoCarro {

	public static void main(String[] args) {
		Carro carro = new Carro();
		
		carro.ligar();
		carro.acelerar(50);
		carro.freiar();
		
		carro.gasolina();
	}
}
