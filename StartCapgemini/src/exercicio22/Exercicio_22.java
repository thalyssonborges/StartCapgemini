package exercicio22;

import java.util.Scanner;

/*
 * 22. Fa�a um algoritmo que receba o pre�o de custo e o pre�o de venda de 40 produtos.
 *     Mostre como resultado se houve lucro, preju�zo ou empate para cada produto. 
 *     Informe o valor de custo de cada produto, o valor de venda de cada produto, a
 *     m�dia de pre�o de custo e do pre�o de venda;
 */
public class Exercicio_22 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.printf("Quantidade de produtos: ");
		n = sc.nextInt();
		
		float[] vetorCusto = new float[n];
		float[] vetorVenda = new float[n];
		float custoProduto=0, vendaProduto = 0, somaCusto = 0, somaVenda = 0;
		
		System.out.println("\nInforme: ");

		for(int i=0; i<n; i++) {
			System.out.printf("Pre�o de custo: R$ ");
			custoProduto = sc.nextFloat();
			somaCusto = somaCusto + custoProduto;
			vetorCusto[i] = custoProduto;
			System.out.printf("Pre�o de venda: R$ ");
			vendaProduto = sc.nextFloat();	
			somaVenda = somaVenda + vendaProduto;
			vetorVenda[i] = vendaProduto;
			calcularLucro(custoProduto, vendaProduto);
			
			System.out.println();
		}
		relatorio(vetorCusto, vetorVenda, somaCusto, somaVenda, n);
	}
	
	
	public static void calcularLucro(float custo, float venda) {
		float lucro = venda - custo;
		if(venda < custo) {
			System.out.println("Prejuizo");
		}else if(venda > custo) {
			System.out.println("Lucro");
		}else {
			System.out.println("Empate");
		}
	}
	
	public static void relatorio(float[] vetorCusto, float[] vetorVenda, 
			float somaCusto, float somaVenda, int n) {
		System.out.println("* * * *   R E L A T � R I O   * * * *");
		
		for(int i=0; i<vetorCusto.length; i++) {
			System.out.println("\nProduto "+(i+1)+" - Valor de custo: R$ "+vetorCusto[i]);
			System.out.println("Produto "+(i+1)+" - valor de venda: R$ "+vetorVenda[i]);
			System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -");
		}
		System.out.println("\nM�dia de pre�o dos custos:  R$ "+somaCusto/n);
		System.out.println("M�dia de pre�o das vendas:  R$ "+somaVenda/n);
		System.out.println("\n-  -  -  -  -  -  -  -  -  -  -  -  -");

	}

}
