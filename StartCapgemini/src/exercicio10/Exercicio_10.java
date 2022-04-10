package exercicio10;

import java.util.Scanner;

/*
 * 10. A Loja Mam�o com A��car est� vendendo seus produtos em 5(cinco) presta��es sem juros.
 *     Fa�a um algoritmo que receba um valor de uma compra e mostre o valor das presta��es;
 */
public class Exercicio_10 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float valorDaCompra;

		System.out.println("Informe: ");
		System.out.printf("Valor da compra: R$ ");
		valorDaCompra = sc.nextFloat();

		calcularPrestacao(valorDaCompra);

	}

	public static void calcularPrestacao(float valor) {
		System.out.println("\nO valor da compra foi d�: R$ " + valor);
		for (int i = 1; i < 6; i++) {
			System.out.printf("O valor da compra em " + (i) + " parcela(s) SEM JUROS: R$ %.2f", (valor / i));
			System.out.println();
		}

	}

}
