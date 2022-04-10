package exercicio28;

import java.util.Scanner;

/*
 * 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a 
 *     seus 584 funcion�rios de acordo com os seguintes crit�rios:
		a. 50% para aqueles que ganham menos do que tr�s sal�rios m�nimos;
		b. 20% para aqueles que ganham entre tr�s at� dez sal�rios m�nimos;
		c. 15% para aqueles que ganham acima de dez at� vinte sal�rios m�nimos;
		d. 10% para os demais funcion�rios.
		Leia o nome do funcion�rio, seu sal�rio e o valor do sal�rio m�nimo. 
		Calcule o seu novo sal�rio reajustado. Escrever o nome do funcion�rio, 
		o reajuste e seu novo sal�rio. Calcule quanto � empresa vai aumentar sua 
		folha de pagamento;
 */
public class Exercicio_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		float salario = 0.0f , salario_minimo = 0.0f;
		
		System.out.println("Informa��es do Funcion�rio: ");
		System.out.printf("Nome: ");
		nome = sc.nextLine();
		System.out.printf("Sal�rio: R$ ");
		salario = sc.nextFloat();
		System.out.printf("Sal�rio m�nimo: R$ ");
		salario_minimo = sc.nextFloat();
		
		calcularReajusteFuncionarios(nome, salario, salario_minimo);
	}
	
	public static void calcularReajusteFuncionarios(String nome, float salario, float SALARIO_MINIMO) {
		float condicao1 = SALARIO_MINIMO * 3;
		float condicao2 = SALARIO_MINIMO * 10;
		float condicao3 = SALARIO_MINIMO * 20;
		float reajuste;
		
		System.out.println("__________________________________________");
		System.out.println();
		
		if(salario < SALARIO_MINIMO) {
			System.out.println("ATEN��O! O sal�rio do funcion�rio n�o pode ser inferior ao sal�rio m�nimo!");
		}else {
			if(salario < condicao1) {
				System.out.println("Funcion�rio: "+nome);
				System.out.println("Reajuste Salarial de 50%");
				reajuste = salario * 50/100;
				salario = salario + reajuste;
				System.out.println("Sal�rio Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao1 && salario < condicao2) {
				System.out.println("Funcion�rio: "+nome);
				System.out.println("Reajuste Salarial de 20%");
				reajuste = salario * 20/100;
				salario = salario + reajuste;
				System.out.println("Sal�rio Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao2 && salario < condicao3) {
				System.out.println("Funcion�rio: "+nome);
				System.out.println("Reajuste Salarial de 15%");
				reajuste = salario * 15/100;
				salario = salario + reajuste;
				System.out.println("Sal�rio Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao3) {
				System.out.println("Funcion�rio: "+nome);
				System.out.println("Reajuste Salarial de 10%");
				reajuste = salario * 10/100;
				salario = salario + reajuste;
				System.out.println("Sal�rio Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}
		}
		System.out.println("___________________________________________");
	}

}
