package exercicio01;

import java.util.Scanner;

/*
 * 1. Fa�a um algoritmo que receba dois n�meros e exiba o resultado da sua soma;
 */
public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2, soma;

		System.out.print("Informe o primeiro n�mero: ");
		numero1 = sc.nextInt();
		System.out.print("Informe o segundo n�mero: ");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		System.out.println("A soma dos n�meros �: " + soma);

	}

}
