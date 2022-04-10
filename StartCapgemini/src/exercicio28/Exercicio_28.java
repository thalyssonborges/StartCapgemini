package exercicio28;

import java.util.Scanner;

/*
 * 28. Escreva um algoritmo para uma empresa que decide dar um reajuste a 
 *     seus 584 funcionários de acordo com os seguintes critérios:
		a. 50% para aqueles que ganham menos do que três salários mínimos;
		b. 20% para aqueles que ganham entre três até dez salários mínimos;
		c. 15% para aqueles que ganham acima de dez até vinte salários mínimos;
		d. 10% para os demais funcionários.
		Leia o nome do funcionário, seu salário e o valor do salário mínimo. 
		Calcule o seu novo salário reajustado. Escrever o nome do funcionário, 
		o reajuste e seu novo salário. Calcule quanto à empresa vai aumentar sua 
		folha de pagamento;
 */
public class Exercicio_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		String nome;
		float salario = 0.0f , salario_minimo = 0.0f;
		
		System.out.println("Informações do Funcionário: ");
		System.out.printf("Nome: ");
		nome = sc.nextLine();
		System.out.printf("Salário: R$ ");
		salario = sc.nextFloat();
		System.out.printf("Salário mínimo: R$ ");
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
			System.out.println("ATENÇÃO! O salário do funcionário não pode ser inferior ao salário mínimo!");
		}else {
			if(salario < condicao1) {
				System.out.println("Funcionário: "+nome);
				System.out.println("Reajuste Salarial de 50%");
				reajuste = salario * 50/100;
				salario = salario + reajuste;
				System.out.println("Salário Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao1 && salario < condicao2) {
				System.out.println("Funcionário: "+nome);
				System.out.println("Reajuste Salarial de 20%");
				reajuste = salario * 20/100;
				salario = salario + reajuste;
				System.out.println("Salário Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao2 && salario < condicao3) {
				System.out.println("Funcionário: "+nome);
				System.out.println("Reajuste Salarial de 15%");
				reajuste = salario * 15/100;
				salario = salario + reajuste;
				System.out.println("Salário Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}else if(salario > condicao3) {
				System.out.println("Funcionário: "+nome);
				System.out.println("Reajuste Salarial de 10%");
				reajuste = salario * 10/100;
				salario = salario + reajuste;
				System.out.println("Salário Reajustado para: R$ "+salario);
				System.out.println("Aumento na folha de pagamento de: R$"+reajuste);
			}
		}
		System.out.println("___________________________________________");
	}

}
