package exercicio13;

import java.util.Scanner;

/*
 * 13. Faça um algoritmo que receba um número e mostre uma mensagem 
 *     caso este número seja maior que 10;
 */

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe: ");
		System.out.printf("Número: ");
		numero = sc.nextInt();
		verificarNumero(numero);
	}

	public static void verificarNumero(int numero) {
		if (numero > 10) {
			System.out.println("\nNúmero maior que 10!");
		}
	}

}
