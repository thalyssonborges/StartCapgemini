package exercicio03;

import java.util.Scanner;

/*
 * 3. Escreva um algoritmo para determinar o consumo médio de um automóvel 
 *    sendo fornecida a distância total percorrida pelo automóvel e o total de combustível gasto;
 */
public class Exercicio_03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float distanciaPercorrida, combustivelGasto;

		System.out.print("Informe a distancia percorrida em kilometros: ");
		distanciaPercorrida = sc.nextFloat();
		System.out.print("Informe o combustivel gasto em litros: ");
		combustivelGasto = sc.nextFloat();
		System.out.printf("O consumo médio foi de: %.2f Km/L", consumoMedio(distanciaPercorrida, combustivelGasto));

	}

	public static float consumoMedio(float distancia, float combustivel) {
		return distancia / combustivel;
	}

}
