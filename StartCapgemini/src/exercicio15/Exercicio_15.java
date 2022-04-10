package exercicio15;

import java.util.Scanner;

/*
 * 15. Fa�a um algoritmo que receba um n�mero e diga se este n�mero est� no intervalo entre 100 e 200;
 */

public class Exercicio_15 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe: ");
		System.out.printf("N�mero: ");
		numero = sc.nextInt();

		verificarIntervaloNumerico(numero);

	}

	public static void verificarIntervaloNumerico(int numero) {
		if (numero > 100 && numero < 200) {
			System.out.println("O n�mero est� entre 100 e 200!");
		} else {
			System.out.println("N�o est� no intervalo!");
		}
	}

}
