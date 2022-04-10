package exercicio04;

import java.util.Scanner;

/*
 * 4. Escreva um algoritmo que leia o nome de um vendedor,
 *    o seu sal�rio fixo e o total de vendas efetuadas por ele no m�s (em dinheiro).
 *    Sabendo que este vendedor ganha 15% de comiss�o sobre suas vendas efetuadas, 
 *    informar o seu nome, o sal�rio fixo e sal�rio no final do m�s;
 */

public class Exercicio_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeVendedor;
		float salarioVendedor, valorTotalVendasVendedor;

		System.out.println("Informe");
		System.out.print("Nome do vendedor: ");
		nomeVendedor = sc.nextLine();
		System.out.print("Sal�rio fixo: R$ ");
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
		System.out.println("\n - - - - Relat�rio - - - - - ");
		System.out.println("Vendedor: " + nome);
		System.out.println("Salario Fixo: R$ " + salarioFixo);
		System.out.println("Comiss�o: R$ " + comissao(vendas));
		System.out.println("Salario Total: R$ " + salarioTotal(salarioFixo, vendas));
	}

}
