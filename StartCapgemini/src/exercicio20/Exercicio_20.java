package exercicio20;

import java.util.Scanner;

/*
 * 20. A concessionária de veículos “CARANGO VELHO” está vendendo os 
 *     seus veículos com desconto. Faça um algoritmo que calcule e 
 *     exiba o valor do desconto e o valor a ser pago pelo cliente de
 *     vários carros. O desconto deverá ser calculado de acordo com o
 *     ano do veículo. Até 2000 - 12% e acima de 2000 - 7%. O sistema
 *     deverá perguntar se deseja continuar calculando desconto até 
 *     que a resposta seja: “(N) Não”. Informar total de carros com ano
 *     até 2000 e total geral;
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
			
			System.out.printf("\nDeseja Continuar?  Digite: Não (Para Sair) | Sim (Para Continuar): ");
			sair = sc.next();
			if (sair.contains("n") || (sair.contains("N"))) {
				opcSair = false;
				System.out.println("Total de Carros: "+totalCarros);
				System.out.println("Total de Carros com Ano de fabricação até 2000: "+totalCarrosAteAno2000);
			}
			System.out.println();
		}

	}

	public static void calcularDescontoVeiculo(int ano, float valor, int totalCarros) {
		float desconto;
		if (ano > 2000) {
			desconto = (float) (valor - (valor * 0.07));
			System.out.println("\n--- Relatório ---");
			System.out.println("Ano do Veiculo: " + ano);
			System.out.println("Valor do Veiculo: R$ " + valor);
			System.out.println("Desconto 7%: R$ " + (valor * 0.07));
			System.out.println("Valor Total: R$ " + desconto);
		} else {
			desconto = (float) (valor - (valor * 0.12));
			System.out.println("\n--- Relatório ---");
			System.out.println("Ano do Veiculo: " + ano);
			System.out.println("Valor do Veiculo: R$ " + valor);
			System.out.println("Desconto 12%: R$ " + (valor * 0.12));
			System.out.println("Valor Total: R$ " + desconto);
		}
	}

}
