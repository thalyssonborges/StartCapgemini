package exercicio13;

import java.util.Scanner;

/*
 * 13. Fa�a um algoritmo que receba um n�mero e mostre uma mensagem 
 *     caso este n�mero seja maior que 10;
 */

public class Exercicio_13 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero;

		System.out.println("Informe: ");
		System.out.printf("N�mero: ");
		numero = sc.nextInt();
		verificarNumero(numero);
	}

	public static void verificarNumero(int numero) {
		if (numero > 10) {
			System.out.println("\nN�mero maior que 10!");
		}
	}

}
