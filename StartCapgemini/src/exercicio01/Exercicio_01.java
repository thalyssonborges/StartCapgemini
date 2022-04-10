package exercicio01;

import java.util.Scanner;

/*
 * 1. Faça um algoritmo que receba dois números e exiba o resultado da sua soma;
 */
public class Exercicio_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int numero1, numero2, soma;

		System.out.print("Informe o primeiro número: ");
		numero1 = sc.nextInt();
		System.out.print("Informe o segundo número: ");
		numero2 = sc.nextInt();
		soma = numero1 + numero2;
		System.out.println("A soma dos números é: " + soma);

	}

}
