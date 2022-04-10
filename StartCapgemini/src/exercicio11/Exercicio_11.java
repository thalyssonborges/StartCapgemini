package exercicio11;

import java.util.Scanner;

/*
 * 11. Fa�a um algoritmo que receba o pre�o de custo de um produto e mostre o valor de venda.
 *     Sabe-se que o pre�o de custo receber� um acr�scimo de acordo com um percentual informado pelo usu�rio;
 */
public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float precoDeCusto, percentual;

		System.out.println("Informe: ");
		System.out.print("Pre�o de custo: R$ ");
		precoDeCusto = sc.nextFloat();
		System.out.printf("Percentual de acr�scimo: ");
		percentual = sc.nextFloat();

		calcularValorDeVenda(precoDeCusto, percentual);

	}

	public static void calcularValorDeVenda(float preco, float percentual) {
		float calculo = preco + (preco * (percentual / 100));
		System.out.printf("O pre�o de venda do produto ser� de R$ %.2f", calculo);
	}

}
