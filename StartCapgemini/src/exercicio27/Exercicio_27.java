package exercicio27;

import java.util.Scanner;

/*
 * 27. A concessionária de veículos “CARANGO” está vendendo os seus veículos
 *     com desconto. Faça um algoritmo que calcule e exiba o valor do desconto
 *     e o valor a ser pago pelo cliente. O desconto deverá ser calculado 
 *     sobre o valor do veículo de acordo com o combustível 
 *     (álcool – 25%, gasolina – 21% ou diesel –14%). 
 *     Com valor do veículo zero encerra entrada de dados. 
 *     Informe total de desconto e total pago pelos clientes;
 */
public class Exercicio_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float valorVeiculo;
		
		
		System.out.println("Informe: ");
		System.out.printf("valor do Veículo: R$ ");
		valorVeiculo = sc.nextFloat();
		System.out.println("Tipo de combustivel: ");
		boolean condicao = true;
		while(condicao) {
			int opcao;
			System.out.printf("SELECIONE: 1) ÁLCOOL | 2) GASOLINA | 3) DIESEL :");
			opcao = sc.nextInt();
			if(opcao == 0) {
				condicao = false;
			}else if((opcao != 1) && (opcao != 2) && (opcao !=3))  {
				System.out.println("Informe um número válido!");
			}else {
				calcularDesconto(valorVeiculo, opcao);
				condicao = false;
			}
		}
		
	}
	public static void calcularDesconto(float valor, int opc) {
		float calculo, desconto;
		if(opc == 1) {       //   álcool 25% desconto
			desconto = valor * 25/100;
			calculo = valor - desconto;
			System.out.println("Valor do desconto referente a 25%: R$ "+desconto);
			System.out.println("Valor total a pagar: R$ "+calculo);
		}else if(opc == 2) { // gasolina 21% desconto
			desconto =  valor * 21/100;
			calculo = valor - desconto;
			System.out.println("Valor do desconto referente a 21%: R$ "+desconto);
			System.out.println("Valor total a pagar: R$ "+calculo);
		}else {              //   diesel 14% desconto
			desconto = valor * 14/100;
			calculo = valor - desconto;
			System.out.println("Valor do desconto referente a 14%: R$ "+desconto);
			System.out.println("Valor total a pagar: R$ "+calculo);
		}
	}

}
