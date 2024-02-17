package br.edu.uea.teste;

import br.edu.uea.model.funcionario2;
import br.edu.uea.model.Gerente;

public class testeBonus {
	public static void main(String[] args) {
		
		funcionario2 funcionario = new funcionario2(1000.0);
		Gerente gerente = new Gerente(1000.0);
		System.out.println("Bonus Funcionario:"+ funcionario.getBonus());
		System.out.println("Bonus Gerente:"+ gerente.getBonus());
		
	}

}
