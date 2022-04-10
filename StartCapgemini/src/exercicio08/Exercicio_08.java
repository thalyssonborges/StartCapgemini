package exercicio08;

import java.util.Scanner;

/*
 * 8. Elabore um algoritmo que efetue a apresentação do valor da conversão em real (R$) 
 *    de um valor lido em dólar (US$). O algoritmo deverá solicitar o valor da cotação
 *    do dólar e também a quantidade de dólares disponíveis com o usuário;
 */
public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float moedaDolar, cotacaoDolar;

		System.out.println("Informe:");
		System.out.printf("Quantidade em dólar: US$ ");
		moedaDolar = sc.nextFloat();
		System.out.printf("Cotação do dólar: R$ ");
		cotacaoDolar = sc.nextFloat();

		converterMoeda(moedaDolar, cotacaoDolar);

	}

	public static void converterMoeda(float dolar, float cotacao) {
		float calculo = dolar * cotacao;
		System.out.println("\nAtenção! Dólar foi convertido em Reais.");
		System.out.println("Quantidade em reais: R$ " + calculo);
	}

}
