package exercicio24;

import java.util.Scanner;

/*
 * 24. Fa�a um algoritmo que receba �N� n�meros e mostre 
 *     positivo, negativo ou zero para cada n�mero;
 */
public class Exercicio_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros, numero;
		
		System.out.printf("Informe quantos n�meros deseja testar: ");
		qtdNumeros = sc.nextInt();
		System.out.println("- - - - - - - - - - -");
		
		for(int i=0; i<qtdNumeros; i++) {
			System.out.printf("\nDigite o n�mero: ");
			numero = sc.nextInt();
			verificarSinalDoNumero(numero);
			System.out.println("\n- - - - - - - - - - -");
		}
	}
	public static void verificarSinalDoNumero(int n) {
		if(n==0) {
			System.out.println("N�mero Neutro");
		}else {
			if(n>0) {
				System.out.println("N�mero Positivo");
			}else {
				System.out.println("N�mero Negativo");
			}
		}
	}

}
