package exercicio02;

import java.util.Scanner;

/*
 * 2. Fa�a um algoritmo que receba dois n�meros e ao final 
 * 	  mostre a soma, subtra��o, multiplica��o e a divis�o 
 * 	  dos dois n�meros lidos;
 */
public class Exercicio_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float numero1, numero2;

		System.out.print("Informe o primeiro n�mero: ");
		numero1 = sc.nextFloat();
		System.out.print("Informe o segundo n�mero: ");
		numero2 = sc.nextFloat();
		System.out.println("-  -  - RESULTADOS -  -  -");
		System.out.println("Adi��o: " + somar(numero1, numero2));
		System.out.println("Subtra��o: " + subtrair(numero1, numero2));
		System.out.println("Multiplica��o: " + multiplicar(numero1, numero2));
		System.out.println("Divis�o: " + dividir(numero1, numero2));
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
