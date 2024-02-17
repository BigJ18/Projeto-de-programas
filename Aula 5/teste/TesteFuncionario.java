package br.edu.uea.teste;

public class TesteFuncionario {

	public static void main(String[] args) {
		Funcionario funcionario = new Funcionario("Junior");
		System.out.println(funcionario.getNome());
		
		Funcionario funcionario2 = new Funcionario();
		
		funcionario2.setNome("Palhetinha");
		System.out.println(funcionario2.getNome());
		
		
		
	}
}
