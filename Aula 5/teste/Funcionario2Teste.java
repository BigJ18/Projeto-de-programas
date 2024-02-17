package br.edu.uea.teste;

import br.edu.uea.model.funcionario2;

public class Funcionario2Teste {
	public static void main(String[] args) {
		funcionario2 funcionario = new funcionario2();
		
		funcionario.setCpf("222.222.222-22");
		System.out.println(funcionario.getCpf());
		funcionario.setNome("Lulu");
		System.out.println(funcionario.getNome());
		funcionario.setSalario(800);
		System.out.println(funcionario.getSalario());
		
		
	}
}
