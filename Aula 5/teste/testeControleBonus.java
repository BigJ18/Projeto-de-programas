package br.edu.uea.teste;

import br.edu.uea.control.controleBonus;
import br.edu.uea.model.funcionario2;
import br.edu.uea.model.Gerente;


public class testeControleBonus {
	
	public static void main(String[] args) {
		controleBonus controle = new controleBonus();
		funcionario2 f1 = new funcionario2(1000);
		controle.adicionarBonus(f1);
		System.out.println(controle.getTotal());
		Gerente g1 = new Gerente(1000);
		controle.adicionarBonus(g1);
		System.out.println(controle.getTotal());
		
		funcionario2 fg = new Gerente(1000);
		System.out.println(fg.getBonus());
		
		funcionario2 fg = new Gerente(1000);
		System.out.println(fg.getBonus());
		((Gerente)fg).getSenha();
	}

}
