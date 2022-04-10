package exercicio18;

import java.util.Scanner;

/*
 * 18. Faça um algoritmo que receba a idade de 75 pessoas e mostre mensagem informando 
 *     “maior de idade” e “menor de idade” para cada pessoa. Considere a idade a partir
 *     de 18 anos como maior de idade;
 */
public class Exercicio_18 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int idade[] = new int[75];

		System.out.println("Informe: ");
		for (int i = 0; i < 75; i++) {
			System.out.printf("Idade: ");
			idade[i] = sc.nextInt();
			verificarMaioridade(idade[i]);
			System.out.println();
		}

	}

	public static void verificarMaioridade(int idade) {
		if (idade >= 18) {
			System.out.println("Maior de Idade");
		} else {
			System.out.println("Menor de Idade");
		}
	}

}
