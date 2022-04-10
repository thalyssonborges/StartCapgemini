package exercicio19;

import java.util.Scanner;

/*
 * 19. Escreva um algoritmo que leia o nome e o sexo de 56 pessoas e 
 *     informe o nome e se ela é homem ou mulher. No final informe total
 *     de homens e de mulheres;
 */
public class Exercicio_19 {

	public static void main(String[] args) {

		totalPessoasPorSexo();

	}

	public static void totalPessoasPorSexo() {

		Scanner sc = new Scanner(System.in);

		String nomePessoa;
		String sexo;
		int contadorMasculino = 0, contadorFeminino = 0;

		System.out.println("Informe: ");
		for (int i = 0; i < 5; i++) {
			System.out.printf("Nome: ");
			nomePessoa = sc.nextLine();
			System.out.printf("Sexo: M (Masculino) e F (Feminino) ");
			sexo = sc.nextLine();
			if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
				contadorMasculino++;
				System.out.println("Masculino");
			} else if (sexo.charAt(0) == 'F' || sexo.charAt(0) =='f') {
				contadorFeminino++;
				System.out.println("Feminino");
			}
			System.out.println();
		}
		System.out.println("Total de pessoas do sexo masculino: " + contadorMasculino);
		System.out.println("Total de pessoas do sexo feminino: " + contadorFeminino);
	}

}
