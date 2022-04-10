package exercicio31;

import java.util.Scanner;

/*
 * 31. Dados tr�s valores A, B e C, em que A e B s�o n�meros reais e C 
 *     � um caractere, pede-se para imprimir o resultado da opera��o de
 *     A por B se C for um s�mbolo de operador aritm�tico; 
 *     caso contr�rio deve ser impressa uma mensagem de operador n�o definido. 
 *     Tratar erro de divis�o por zero;
 */
public class Exercicio_31 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float A, B;
		char C;
		
		System.out.println("Informe: ");
		System.out.printf("N�mero Real A: ");
		A = sc.nextFloat();
		System.out.printf("N�mero Real B: ");
		B = sc.nextFloat();
		System.out.printf("Operador Matem�tico (+ - * /) C: ");
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
				System.out.println("Impossiv�l dividir por ZERO!");
			}else {
				System.out.println("Resultado de A / B -> ("+a+" / "+b+") =  "+calculo);			
			}
		}else {
			System.out.println("Operador n�o definido!");
		}
	}

}
