package exercicio16;

import java.util.Scanner;

/*
 * 16. Escreva um algoritmo que leia o nome e as três notas obtidas por um aluno durante o semestre. 
 *     Calcular a sua média (aritmética), informar o nome e sua menção aprovado (media >= 7), 
 *     Reprovado (media <= 5) e Recuperação (media entre 5.1 a 6.9);
 */
public class Exercicio_16 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String nomeAluno;
		float nota1, nota2, nota3;

		System.out.println("Informe: ");
		System.out.printf("Nome do Aluno: ");
		nomeAluno = sc.nextLine();
		System.out.printf("Nota 1: ");
		nota1 = sc.nextFloat();
		System.out.printf("Nota 2: ");
		nota2 = sc.nextFloat();
		System.out.printf("Nota 3: ");
		nota3 = sc.nextFloat();

		mediaNotas(nomeAluno, nota1, nota2, nota3);
	}

	public static void mediaNotas(String nome, float n1, float n2, float n3) {
		float media = (n1 + n2 + n3) / 3;

		if (media >= 7) {
			System.out.println("Parabéns " + nome + ", você foi APROVADO com média "+media+"!");
		} else if (media >= 5.1 && media <= 6.9) {
			System.out.println("Atenção " + nome + ", você está em RECUPERAÇÃO com média "+media+"!");
		} else {
			System.out.println("Infelizmente " + nome + ", você foi REPROVADO com média "+media+"!");
		}

	}

}
