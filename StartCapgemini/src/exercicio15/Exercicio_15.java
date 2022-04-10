package exercicio15;

import java.util.Scanner;

/*
 * 15. Faça um algoritmo que receba um número e diga se este número está no intervalo entre 100 e 200;
 */

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe: ");
		System.out.printf("Número: ");
		numero = sc.nextInt();

		verificarIntervaloNumerico(numero);

	}

	public static void verificarIntervaloNumerico(int numero) {
		if (numero > 100 && numero < 200) {
			System.out.println("O número está entre 100 e 200!");
		} else {
			System.out.println("Não está no intervalo!");
		}
	}

}
