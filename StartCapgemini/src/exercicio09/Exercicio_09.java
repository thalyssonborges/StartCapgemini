package exercicio09;

import java.util.Iterator;
import java.util.Scanner;

/*
 * 9. Fa�a um algoritmo que receba um valor que foi depositado 
 *    e exiba o valor com rendimento ap�s um m�s. 
 *    Considere fixo o juro da poupan�a em 0,07% a. m;
 */
public class Exercicio_09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float valorDepositado;
		int meses;

		System.out.println("Informe: ");
		System.out.printf("Valor para deposito: R$ ");
		valorDepositado = sc.nextFloat();
		System.out.printf("Meses aplicados: ");
		meses = sc.nextInt();

		calcularRendimentos(valorDepositado, meses);
	}

	public static void calcularRendimentos(float valor, int qtdMeses) {
		float rendimento = valor;
		for (int i = 0; i < qtdMeses; i++) {
			rendimento = (float) (rendimento + (rendimento * (0.07 / 100)));
		}
		if (qtdMeses == 1) {
			System.out.printf("\nO rendimento ap�s " + qtdMeses + " m�s � de: R$ %.2f", rendimento);
		} else {
			System.out.printf("\nO rendimento ap�s " + qtdMeses + " meses � de: R$ %.2f", rendimento);
		}
	}

}
