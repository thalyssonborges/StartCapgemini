package exercicio03;

import java.util.Scanner;

/*
 * 3. Escreva um algoritmo para determinar o consumo m�dio de um autom�vel 
 *    sendo fornecida a dist�ncia total percorrida pelo autom�vel e o total de combust�vel gasto;
 */
public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float distanciaPercorrida, combustivelGasto;

		System.out.print("Informe a distancia percorrida em kilometros: ");
		distanciaPercorrida = sc.nextFloat();
		System.out.print("Informe o combustivel gasto em litros: ");
		combustivelGasto = sc.nextFloat();
		System.out.printf("O consumo m�dio foi de: %.2f Km/L", consumoMedio(distanciaPercorrida, combustivelGasto));

	}

	public static float consumoMedio(float distancia, float combustivel) {
		return distancia / combustivel;
	}

}
