package br.edu.uea.teste;

import br.edu.uea.model.Gerente;

public class testeGerente {
	 
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		gerente.setCpf("111.111.111-11");
		gerente.setNome("Szafir");
		gerente.setSalario(1000);
		gerente.setSenha(1234);
		
		System.out.println(gerente.getNome()+" - "+gerente.getSenha());
		
	}

}
