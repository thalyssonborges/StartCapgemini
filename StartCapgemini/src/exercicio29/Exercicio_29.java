package exercicio29;

import java.util.Scanner;

/*
 * 29. Faça um algoritmo que receba o número do mês e mostre
 *     o mês correspondente. Valide mês inválido;
 */
public class Exercicio_29 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int numeroMes;
		
		System.out.println("Informe: ");
		System.out.printf("Número referente ao mês que deseja exibir: ");
		numeroMes = sc.nextInt();
		
		boolean condicao = true;
		while(condicao) {
			verificarMes(numeroMes);
			if(numeroMes < 1 || numeroMes > 12) {
				System.out.printf("Informe um número válido referente ao mês que deseja exibir: ");
				numeroMes = sc.nextInt();
			}else {
				condicao = false;
			}
		}
		
		
	}
	public static void verificarMes(int mes) {
		switch (mes) {
		case 1: {
			System.out.println("Janeiro");
			break;
		}
		case 2: {
			System.out.println("Fevereiro");
			break;
		}
		case 3: {
			System.out.println("Março");
			break;
		}
		case 4: {
			System.out.println("Abril");
			break;
		}
		case 5: {
			System.out.println("Maio");
			break;
		}
		case 6: {
			System.out.println("Junho");
			break;
		}
		case 7: {
			System.out.println("Julho");
			break;
		}
		case 8: {
			System.out.println("Agosto");
			break;
		}
		case 9: {
			System.out.println("Setembro");
			break;
		}
		case 10: {
			System.out.println("Outubro");
			break;
		}
		case 11: {
			System.out.println("Novembro");
			break;
		}
		case 12: {
			System.out.println("Dezembro");
			break;
		}
		default:
			System.out.println("Mês inválido!");
			break;
		}
	}

}
