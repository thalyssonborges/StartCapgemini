package exercicio08;

import java.util.Scanner;

/*
 * 8. Elabore um algoritmo que efetue a apresenta��o do valor da convers�o em real (R$) 
 *    de um valor lido em d�lar (US$). O algoritmo dever� solicitar o valor da cota��o
 *    do d�lar e tamb�m a quantidade de d�lares dispon�veis com o usu�rio;
 */
public class Exercicio_08 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float moedaDolar, cotacaoDolar;

		System.out.println("Informe:");
		System.out.printf("Quantidade em d�lar: US$ ");
		moedaDolar = sc.nextFloat();
		System.out.printf("Cota��o do d�lar: R$ ");
		cotacaoDolar = sc.nextFloat();

		converterMoeda(moedaDolar, cotacaoDolar);

	}

	public static void converterMoeda(float dolar, float cotacao) {
		float calculo = dolar * cotacao;
		System.out.println("\nAten��o! D�lar foi convertido em Reais.");
		System.out.println("Quantidade em reais: R$ " + calculo);
	}

}
