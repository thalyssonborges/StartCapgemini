package exercicio17;

import java.util.Scanner;

/*
 * 17. Leia 80 n�meros e ao final informar quantos n�mero(s)
 *     est(�)�o no intervalo entre 10 (inclusive) e 150 (inclusive);
 */

public class Exercicio_17 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero[] = new int[80];
		int contador = 0;

		for (int i = 0; i < 80; i++) {
			System.out.printf("N�mero: ");
			numero[i] = sc.nextInt();
			if(numero[i] >= 10 && numero[i] <=150) {
				contador++;
			}
		}
		intervaloNumerico(numero, contador);
		

	}

	public static void intervaloNumerico(int numero[], int contador) {
		System.out.println("\nTotal de n�meros dentro do intervalo entre 10 e 150: "+contador);
		System.out.println("Est�o no intervalo entre 10(inclusive) e 150(inclusive): ");
		for (int i : numero) {
			if (i >= 10 && i <= 150) {
				System.out.print(i+" ");
			}
		}
	}

}
