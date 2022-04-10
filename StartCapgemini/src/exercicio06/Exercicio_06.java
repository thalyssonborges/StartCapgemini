package exercicio06;

import java.util.Scanner;

/*
 * 6. Leia dois valores para as vari�veis A e B, e 
 *    efetuar as trocas dos valores de forma que a vari�vel A
 *    passe a possuir o valor da vari�vel B e a vari�vel B passe
 *    a possuir o valor da vari�vel A. Apresentar os valores trocados;
 */
public class Exercicio_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float A, B;

		System.out.println("Informe: ");
		System.out.printf("Valor de A: ");
		A = sc.nextFloat();
		System.out.printf("Valor de B: ");
		B = sc.nextFloat();

		permutarVariaveis(A, B);

	}

	public static void permutarVariaveis(float a, float b) {
		float aux;
		aux = a;
		a = b;
		b = aux;
		System.out.println("\nAten��o! As vari�veis foram trocadas.");
		System.out.println("Novo valor de A: " + a);
		System.out.println("Novo valor de B: " + b);
	}

}
