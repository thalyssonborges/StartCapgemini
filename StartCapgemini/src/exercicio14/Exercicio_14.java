package exercicio14;

import java.util.Scanner;

/*
 * 14. Escreva um algoritmo que leia dois valores inteiro distintos e informe qual � o maior;
 */
public class Exercicio_14 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1 = 0, numero2 = 0;

		while (numero1 == numero2) {
			System.out.printf("Escreva o primeiro n�mero: ");
			numero1 = sc.nextInt();
			System.out.printf("Escreva o segundo n�mero: ");
			numero2 = sc.nextInt();
			while (numero1 == numero2) {
				System.out.println("\nATEN��O! Segundo n�mero deve ser diferente do primeiro n�mero.");
				System.out.printf("Escreva novamente o segundo n�mero: ");
				numero2 = sc.nextInt();
			}
			if (numero1 > numero2) {
				System.out.println("\nN�mero 1 � o Maior!");
			} else {
				System.out.println("\nN�mero 2 � o Maior!");
			}
		}
	}

}
