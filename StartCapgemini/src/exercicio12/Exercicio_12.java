package exercicio12;

import java.util.Scanner;

/*
 * 12. O custo de um carro novo ao consumidor é a soma 
 *     do custo de fábrica mais o percentual do distribuidor e dos 
 *     impostos aplicados (primeiro os impostos são aplicados sobre
 *     o custo de fábrica, e depois o percentual do distribuidor sobre o resultado).
 *     Supondo que o percentual do distribuidor seja de 28% e os impostos 45%, 
 *     escreva um algoritmo que leia o custo de fábrica de um carro 
 *     e informe o custo ao consumidor do mesmo;
 */
public class Exercicio_12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float custoFabricaCarro;

		System.out.println("Informe: ");
		System.out.printf("Preço de custo do carro: R$ ");
		custoFabricaCarro = sc.nextFloat();

		calcularCustoFinalCarro(custoFabricaCarro);
	}

	public static void calcularCustoFinalCarro(float custo) {
		float calculoImposto = (float) (custo + (custo * 45 / 100));
		float calculoDistribuidor = (float) (calculoImposto + (calculoImposto * 28 / 100));
		System.out.printf("O valor do carro com todos os tributos é de R$ %.2f", calculoDistribuidor);
	}

}
