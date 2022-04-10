package exercicio27;

import java.util.Scanner;

/*
 * 27. A concession�ria de ve�culos �CARANGO� est� vendendo os seus ve�culos
 *     com desconto. Fa�a um algoritmo que calcule e exiba o valor do desconto
 *     e o valor a ser pago pelo cliente. O desconto dever� ser calculado 
 *     sobre o valor do ve�culo de acordo com o combust�vel 
 *     (�lcool � 25%, gasolina � 21% ou diesel �14%). 
 *     Com valor do ve�culo zero encerra entrada de dados. 
 *     Informe total de desconto e total pago pelos clientes;
 */
public class Exercicio_27 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		float valorVeiculo;
		
		
		System.out.println("Informe: ");
		System.out.printf("valor do Ve�culo: R$ ");
		valorVeiculo = sc.nextFloat();
		System.out.println("Tipo de combustivel: ");
		boolean condicao = true;
		while(condicao) {
			int opcao;
			System.out.printf("SELECIONE: 1) �LCOOL | 2) GASOLINA | 3) DIESEL :");
			opcao = sc.nextInt();
			if(opcao == 0) {
				condicao = false;
			}else if((opcao != 1) && (opcao != 2) && (opcao !=3))  {
				System.out.println("Informe um n�mero v�lido!");
			}else {
				calcularDesconto(valorVeiculo, opcao);
				condicao = false;
			}
		}
		
	}
	public static void calcularDesconto(float valor, int opc) {
		float calculo, desconto;
		if(opc == 1) {       //   �lcool 25% desconto
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
