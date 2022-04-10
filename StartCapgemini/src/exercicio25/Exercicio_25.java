package exercicio25;

import java.util.Scanner;

/*
 * 25. Fa�a um algoritmo que leia dois n�meros e identifique 
 *     se s�o iguais ou diferentes. Caso eles sejam iguais 
 *     imprima uma mensagem dizendo que eles s�o iguais. Caso
 *     sejam diferentes, informe qual n�mero � o maior, e uma
 *     mensagem que s�o diferentes;
 */
public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int num1, num2;
		
		System.out.println("Informe: ");
		System.out.printf("Primeiro n�mero: ");
		num1 = sc.nextInt();
		System.out.printf("Segundo n�mero: ");
		num2 = sc.nextInt();
		verificarNumeros(num1, num2);
		
	}
	public static void verificarNumeros(int n1, int n2) {
		if(n1 == n2) {
			System.out.println("N�meros s�o iguais!");
		}else {
			System.out.println("N�meros s�o diferentes!");
			if(n1>n2) {
				System.out.println("Primeiro n�mero MAIOR que o segundo!");
			}else {
				System.out.println("Segundo n�mero � MAIOR que o primeiro!");
			}
		}
	}

}
