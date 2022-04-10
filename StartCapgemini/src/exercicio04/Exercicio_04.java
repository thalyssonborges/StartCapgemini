package exercicio04;

import java.util.Scanner;

/*
 * 4. Escreva um algoritmo que leia o nome de um vendedor,
 *    o seu salário fixo e o total de vendas efetuadas por ele no mês (em dinheiro).
 *    Sabendo que este vendedor ganha 15% de comissão sobre suas vendas efetuadas, 
 *    informar o seu nome, o salário fixo e salário no final do mês;
 */

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeVendedor;
		float salarioVendedor, valorTotalVendasVendedor;

		System.out.println("Informe");
		System.out.print("Nome do vendedor: ");
		nomeVendedor = sc.nextLine();
		System.out.print("Salário fixo: R$ ");
		salarioVendedor = sc.nextFloat();
		System.out.print("Valor das vendas efetuadas: R$ ");
		valorTotalVendasVendedor = sc.nextFloat();

		comissao(valorTotalVendasVendedor);
		salarioTotal(salarioVendedor, valorTotalVendasVendedor);
		relatorio(nomeVendedor, salarioVendedor, valorTotalVendasVendedor);

	}

	public static float comissao(float vendas) {
		return (float) (vendas * 0.15);
	}

	public static float salarioTotal(float salario, float vendas) {
		return salario + comissao(vendas);
	}

	public static void relatorio(String nome, float salarioFixo, float vendas) {
		System.out.println("\n - - - - Relatório - - - - - ");
		System.out.println("Vendedor: " + nome);
		System.out.println("Salario Fixo: R$ " + salarioFixo);
		System.out.println("Comissão: R$ " + comissao(vendas));
		System.out.println("Salario Total: R$ " + salarioTotal(salarioFixo, vendas));
	}

}
