package exercicio20;

import java.util.Scanner;

/*
 * 20. A concession�ria de ve�culos �CARANGO VELHO� est� vendendo os 
 *     seus ve�culos com desconto. Fa�a um algoritmo que calcule e 
 *     exiba o valor do desconto e o valor a ser pago pelo cliente de
 *     v�rios carros. O desconto dever� ser calculado de acordo com o
 *     ano do ve�culo. At� 2000 - 12% e acima de 2000 - 7%. O sistema
 *     dever� perguntar se deseja continuar calculando desconto at� 
 *     que a resposta seja: �(N) N�o�. Informar total de carros com ano
 *     at� 2000 e total geral;
 */
public class Exercicio_20 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int anoVeiculo, totalCarrosAteAno2000 = 0, totalCarros = 0;
		float valorVeiculo;
		String sair;

		System.out.println("Informe:");

		boolean opcSair = true;
		while (opcSair) {
			System.out.printf("Ano do veiculo: ");
			anoVeiculo = sc.nextInt();
			System.out.printf("valor do veiculo: R$ ");
			valorVeiculo = sc.nextFloat();
			
			totalCarros++;
			if(anoVeiculo<=2000) {
				totalCarrosAteAno2000++;
			}
			
			calcularDescontoVeiculo(anoVeiculo, valorVeiculo, totalCarros);
			
			System.out.printf("\nDeseja Continuar?  Digite: N�o (Para Sair) | Sim (Para Continuar): ");
			sair = sc.next();
			if (sair.contains("n") || (sair.contains("N"))) {
				opcSair = false;
				System.out.println("Total de Carros: "+totalCarros);
				System.out.println("Total de Carros com Ano de fabrica��o at� 2000: "+totalCarrosAteAno2000);
			}
			System.out.println();
		}

	}

	public static void calcularDescontoVeiculo(int ano, float valor, int totalCarros) {
		float desconto;
		if (ano > 2000) {
			desconto = (float) (valor - (valor * 0.07));
			System.out.println("\n--- Relat�rio ---");
			System.out.println("Ano do Veiculo: " + ano);
			System.out.println("Valor do Veiculo: R$ " + valor);
			System.out.println("Desconto 7%: R$ " + (valor * 0.07));
			System.out.println("Valor Total: R$ " + desconto);
		} else {
			desconto = (float) (valor - (valor * 0.12));
			System.out.println("\n--- Relat�rio ---");
			System.out.println("Ano do Veiculo: " + ano);
			System.out.println("Valor do Veiculo: R$ " + valor);
			System.out.println("Desconto 12%: R$ " + (valor * 0.12));
			System.out.println("Valor Total: R$ " + desconto);
		}
	}

}
