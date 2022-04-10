package exercicio30;
/*
 * 30. Escreva um algoritmo que leia tr�s valores inteiros
 *     distintos e os escreva em ordem crescente;
 */

import java.util.Scanner;

public class Exercicio_30 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numero1, numero2, numero3;
		
		System.out.println("Informe 03 n�meros distintos: ");
		System.out.printf("N�mero 1: ");
		numero1 = sc.nextInt();
		System.out.printf("N�mero 2: ");
		numero2 = sc.nextInt();
		System.out.printf("N�mero 3: ");
		numero3 = sc.nextInt();
		
		ordemCrescenteNumerosDistintos(sc, numero1, numero2, numero3);


	}
	public static void ordemCrescenteNumerosDistintos(Scanner sc, int n1, int n2, int n3) {
		boolean condicao = true;
		while(condicao) {
			if(n1 == n2) {
				System.out.println("N�mero 2 igual o N�mero 1!");
				System.out.printf("Informe outro n�mero 2: ");
				n2 = sc.nextInt();
			}else if(n1 == n3) {
				System.out.println("N�mero 3 igual o N�mero 1!");
				System.out.printf("Informe outro n�mero 3: ");
				n3 = sc.nextInt();
			}else if(n2 == n3) {
				System.out.println("N�mero 3 igual o N�mero 2!");
				System.out.printf("Informe outro n�mero 3: ");
				n3 = sc.nextInt();
			}
			else {
				int aux;
				System.out.println("- - VARI�VEIS - -");
				System.out.println("NUMERO 1 : "+n1);
				System.out.println("NUMERO 2 : "+n2);
				System.out.println("NUMERO 3 : "+n3);
				System.out.println("- - ORDENA��O - -");
				boolean opc = true;
				while(opc) {
					if(n1>n2) {
						aux = n2;
						n2 = n1;
						n1 = aux;
					}else if(n2>n3) {
						aux = n3;
						n3 = n2;
						n2 = aux;
					}else {
						opc = false;
					}
				}
				
				System.out.println("NUMERO 1 : "+n1);
				System.out.println("NUMERO 2 : "+n2);
				System.out.println("NUMERO 3 : "+n3);
				
				condicao = false;
			}
			
		}
	}

}
