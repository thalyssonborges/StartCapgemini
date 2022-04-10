package exercicio31;

import java.util.Scanner;

/*
 * 31. Dados três valores A, B e C, em que A e B são números reais e C 
 *     é um caractere, pede-se para imprimir o resultado da operação de
 *     A por B se C for um símbolo de operador aritmético; 
 *     caso contrário deve ser impressa uma mensagem de operador não definido. 
 *     Tratar erro de divisão por zero;
 */
public class Exercicio_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float A, B;
		char C;
		
		System.out.println("Informe: ");
		System.out.printf("Número Real A: ");
		A = sc.nextFloat();
		System.out.printf("Número Real B: ");
		B = sc.nextFloat();
		System.out.printf("Operador Matemático (+ - * /) C: ");
		C = sc.next().charAt(0);
		
		calcular(A, B, C);
		
	}
	public static void calcular(float a, float b, char c) {
		float calculo;
		if(c == '-' ) {
			calculo = a - b;
			System.out.println("Resultado de A - B -> ("+a+" - "+b+") =  "+calculo);
		}else if(c == '+') {
			calculo = a + b;
			System.out.println("Resultado de A + B -> ("+a+" + "+b+") =  "+calculo);
		}else if(c == '*') {
			calculo = a * b;
			System.out.println("Resultado de A * B -> ("+a+" * "+b+") =  "+calculo);
		}else if(c == '/') {
			calculo = a / b;
			if(b == 0) {
				System.out.println("Impossivél dividir por ZERO!");
			}else {
				System.out.println("Resultado de A / B -> ("+a+" / "+b+") =  "+calculo);			
			}
		}else {
			System.out.println("Operador não definido!");
		}
	}

}
