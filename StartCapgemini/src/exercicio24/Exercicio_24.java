package exercicio24;

import java.util.Scanner;

/*
 * 24. Faça um algoritmo que receba “N” números e mostre 
 *     positivo, negativo ou zero para cada número;
 */
public class Exercicio_24 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int qtdNumeros, numero;
		
		System.out.printf("Informe quantos números deseja testar: ");
		qtdNumeros = sc.nextInt();
		System.out.println("- - - - - - - - - - -");
		
		for(int i=0; i<qtdNumeros; i++) {
			System.out.printf("\nDigite o número: ");
			numero = sc.nextInt();
			verificarSinalDoNumero(numero);
			System.out.println("\n- - - - - - - - - - -");
		}
	}
	public static void verificarSinalDoNumero(int n) {
		if(n==0) {
			System.out.println("Número Neutro");
		}else {
			if(n>0) {
				System.out.println("Número Positivo");
			}else {
				System.out.println("Número Negativo");
			}
		}
	}

}
