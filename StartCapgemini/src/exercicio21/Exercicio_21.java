package exercicio21;

import java.util.Scanner;

public class Exercicio_21 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nome = null, sexo = null, saude = null;
		int idade = 0, qtdPessoas, contadorApto = 0, contadorInapto = 0;

		System.out.println("Informe: ");
		System.out.printf("Quantidade de pessoas a serem avaliadas: ");
		qtdPessoas = sc.nextInt();
		System.out.println("-  -  -  -  -  -  -  -  -");

		verificarSituacaoServicoMilitar(qtdPessoas, sc, nome, sexo, idade, saude, contadorApto, contadorInapto);

	}

	public static void verificarSituacaoServicoMilitar(int qtdPessoas, Scanner sc, String nome, String sexo, int idade,
			String saude, int contadorApto, int contadorInapto) {
		for (int i = 0; i < qtdPessoas; i++) {
			System.out.printf("Nome: ");
			nome = sc.next();
			System.out.printf("Sexo: ");
			sexo = sc.next();
			System.out.printf("Idade: ");
			idade = sc.nextInt();
			System.out.printf("Saudável: ");
			saude = sc.next();

			if (sexo.charAt(0) == 'M' || sexo.charAt(0) == 'm') {
				if (idade > 17) {
					if (saude.charAt(0) == 'S' || saude.charAt(0) == 's') {
						contadorApto++;
						System.out.println("APTO, cumpre TODOS os requisitos!");
					} else {
						contadorInapto++;
						System.out.println("INAPTO, requisito SAUDÁVEL (não) não corresponde as exigências!");
					}
				} else {
					contadorInapto++;
					System.out.println("INAPTO, requisito IDADE (menor de idade) não corresponde as exigências!");
				}
			} else {
				contadorInapto++;
				System.out.println("INAPTO, requisito SEXO (feminino) não corresponde as exigências!");
			}
			System.out.println("-  -  -  -  -  -  -  -  -");
		}
		System.out.println("\nS E R V I Ç O   M I L I T A R   O B R I G A T Ó R I O");
		System.out.println("Total de pessoas avaliadas: " + qtdPessoas);
		System.out.println("Total de pessoas aptas: " + contadorApto);
		System.out.println("Total de pessoas inaptas: " + contadorInapto);
	}
}
