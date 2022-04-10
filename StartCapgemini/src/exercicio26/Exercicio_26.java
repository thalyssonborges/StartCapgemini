package exercicio26;

import java.util.Scanner;

/*
 * 26. Fa�a um algoritmo que leia um n�mero de 1 a 5 
 *     e escreva por extenso. Caso o usu�rio digite 
 *     um n�mero que n�o esteja neste intervalo, exibir
 *     a seguinte mensagem: n�mero inv�lido;
 */
public class Exercicio_26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Informe um n�mero de 1 at� 5: ");
		numero = sc.nextInt();
		
		exibirNumeroPorExtenso(numero);

	}
	public static void exibirNumeroPorExtenso(int num) {
		switch (num) {
		case 1: {
			System.out.println("Um");	
			break;
		}
		case 2: {
			System.out.println("Dois");
			break;
		}
		case 3: {
			System.out.println("Tr�s");
			break;
		}
		case 4: {
			System.out.println("Quatro");
			break;
		}
		case 5: {
			System.out.println("Cinco");
			break;
		}
		default:
			System.out.println("N�mero inv�lido!");
			break;
		}
	}

}
