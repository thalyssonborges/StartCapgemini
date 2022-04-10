package exercicio02;

import java.util.Scanner;

/*
 * 2. Faça um algoritmo que receba dois números e ao final 
 * 	  mostre a soma, subtração, multiplicação e a divisão 
 * 	  dos dois números lidos;
 */
public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero1, numero2;

		System.out.print("Informe o primeiro número: ");
		numero1 = sc.nextFloat();
		System.out.print("Informe o segundo número: ");
		numero2 = sc.nextFloat();
		System.out.println("-  -  - RESULTADOS -  -  -");
		System.out.println("Adição: " + somar(numero1, numero2));
		System.out.println("Subtração: " + subtrair(numero1, numero2));
		System.out.println("Multiplicação: " + multiplicar(numero1, numero2));
		System.out.println("Divisão: " + dividir(numero1, numero2));
	}

	public static float somar(float n1, float n2) {
		return n1 + n2;
	}

	public static float subtrair(float n1, float n2) {
		return n1 - n2;
	}

	public static float multiplicar(float n1, float n2) {
		return n1 * n2;
	}

	public static float dividir(float n1, float n2) {
		return n1 / n2;
	}

}
