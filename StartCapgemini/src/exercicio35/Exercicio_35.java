package exercicio35;

import java.util.Scanner;

/*
 * 35. Fa�a um algoritmo que calcule o valor da conta de luz de uma pessoa. Sabe-se que o c�lculo da conta de luz segue a tabela abaixo:
	   Tipo de Cliente Valor do KW/h
		a. (Resid�ncia) 0,60;
		b. (Com�rcio) 0,48;
		c. (Ind�stria) 1,29.
 */

public class Exercicio_35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		char opc;
		int consumoKw;
		
		System.out.println("C�lculo da conta de luz: ");
		System.out.printf("Informe o consumo em KW: ");
		consumoKw = sc.nextInt();
		System.out.println("Selecione o segmento: a - Residencia | b - Com�rcio | c - Ind�stria");
		opc = sc.next().charAt(0);
		
		verificarOpcao(opc, consumoKw, sc);
		
	}
	public static void verificarOpcao(char opc, int consumo, Scanner sc) {
		boolean condicao = true;
		float calculo;
		
		while(condicao) {
			if(opc == 'a' || opc == 'A') {
				calculo = (float) (consumo * 0.60);
				System.out.println("Total a Pagar: R$ "+calculo);
				condicao = false;
			}else if(opc == 'b' || opc == 'B') {
				calculo = (float) (consumo * 0.48);
				System.out.println("Total a Pagar: R$ "+calculo);
				condicao = false;
			}else if(opc == 'c' || opc == 'C') {
				calculo = (float) (consumo * 1.29);
				System.out.println("Total a Pagar: R$ "+calculo);
				condicao = false;
			}else {
				System.out.println("\nOp��o Inv�lida!");
				System.out.println("Selecione a Letra para o segmento correspondente: ");
				System.out.println("a - Residencia | b - Com�rcio | c - Ind�stria");
				opc = sc.next().charAt(0);
			}	
		}
	}

}
