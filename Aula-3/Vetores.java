package br.edu.uea;

public class Vetores {

	public static void main(String[] args) {

		int[] idades = new int[5];

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * 2;

			System.out.println("O dobro dos elementos do vetor é: \n " + idades[i]);

		}

	}

}

