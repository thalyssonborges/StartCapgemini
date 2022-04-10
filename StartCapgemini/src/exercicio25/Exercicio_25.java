package exercicio25;

import java.util.Scanner;

/*
 * 25. Faça um algoritmo que leia dois números e identifique 
 *     se são iguais ou diferentes. Caso eles sejam iguais 
 *     imprima uma mensagem dizendo que eles são iguais. Caso
 *     sejam diferentes, informe qual número é o maior, e uma
 *     mensagem que são diferentes;
 */
public class Exercicio_25 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int num1, num2;
		
		System.out.println("Informe: ");
		System.out.printf("Primeiro número: ");
		num1 = sc.nextInt();
		System.out.printf("Segundo número: ");
		num2 = sc.nextInt();
		verificarNumeros(num1, num2);
		
	}
	public static void verificarNumeros(int n1, int n2) {
		if(n1 == n2) {
			System.out.println("Números são iguais!");
		}else {
			System.out.println("Números são diferentes!");
			if(n1>n2) {
				System.out.println("Primeiro número MAIOR que o segundo!");
			}else {
				System.out.println("Segundo número é MAIOR que o primeiro!");
			}
		}
	}

}
