package exercicio14;

import java.util.Scanner;

/*
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual é o maior;
 */
public class Exercicio_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1 = 0, numero2 = 0;

		while (numero1 == numero2) {
			System.out.printf("Escreva o primeiro número: ");
			numero1 = sc.nextInt();
			System.out.printf("Escreva o segundo número: ");
			numero2 = sc.nextInt();
			while (numero1 == numero2) {
				System.out.println("\nATENÇÃO! Segundo número deve ser diferente do primeiro número.");
				System.out.printf("Escreva novamente o segundo número: ");
				numero2 = sc.nextInt();
			}
			if (numero1 > numero2) {
				System.out.println("\nNúmero 1 é o Maior!");
			} else {
				System.out.println("\nNúmero 2 é o Maior!");
			}
		}
	}

}
