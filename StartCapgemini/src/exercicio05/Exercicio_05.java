package exercicio05;

import java.util.Scanner;

/*
 * 5. Escreva um algoritmo que leia o nome de um aluno e as notas das três provas 
 *    que ele obteve no semestre. No final informar o nome do aluno e a sua média (aritmética);
 */
public class Exercicio_05 {

	public static void main(String[] args) {

		String nomeAluno;
		float nota1, nota2, nota3;

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nome do aluno: ");
		nomeAluno = sc.nextLine();
		System.out.print("Informe a nota 1: ");
		nota1 = sc.nextFloat();
		System.out.print("Informe a nota 2: ");
		nota2 = sc.nextFloat();
		System.out.print("Informe a nota 3: ");
		nota3 = sc.nextFloat();

		System.out.printf("A média do aluno foi: %.2f", mediaAritmetica(nota1, nota2, nota3));

	}

	public static float mediaAritmetica(float n1, float n2, float n3) {
		return (n1 + n2 + n3) / 3;
	}

}
