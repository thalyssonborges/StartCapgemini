package exercicio11;

import java.util.Scanner;

/*
 * 11. Faça um algoritmo que receba o preço de custo de um produto e mostre o valor de venda.
 *     Sabe-se que o preço de custo receberá um acréscimo de acordo com um percentual informado pelo usuário;
 */
public class Exercicio_11 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float precoDeCusto, percentual;

		System.out.println("Informe: ");
		System.out.print("Preço de custo: R$ ");
		precoDeCusto = sc.nextFloat();
		System.out.printf("Percentual de acréscimo: ");
		percentual = sc.nextFloat();

		calcularValorDeVenda(precoDeCusto, percentual);

	}

	public static void calcularValorDeVenda(float preco, float percentual) {
		float calculo = preco + (preco * (percentual / 100));
		System.out.printf("O preço de venda do produto será de R$ %.2f", calculo);
	}

}
