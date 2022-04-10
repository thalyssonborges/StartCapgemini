package exercicio33;

import java.util.Scanner;

/*
 * 33. A escola �APRENDER� faz o pagamento de seus professores por hora/aula. 
 * 	   Fa�a um algoritmo que calcule e exiba o sal�rio de um professor. 
 * 	   Sabe-se que o valor da hora/aula segue a tabela abaixo:
		a. Professor N�vel 1 R$12,00 por hora/aula;
		b. Professor N�vel 2 R$17,00 por hora/aula;
		c. Professor N�vel 3 R$25,00 por hora/aula.
 */
public class Exercicio_33 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int nivelProfessor, aulasLecionadas;
		
		System.out.println("Informe: ");
		System.out.printf("Nivel do Professor: ");
		nivelProfessor = sc.nextInt();
		System.out.printf("Quantas aulas lecionadas: ");
		aulasLecionadas = sc.nextInt();
		calcularSalario(nivelProfessor, aulasLecionadas, sc);
	}
	public static void calcularSalario(int nivel, int aulas, Scanner sc) {
		float valorHora = 0;
		float calculo = 0;
		boolean condicao = true;
		while(condicao) {
			if(nivel == 1) {
				valorHora = 12;
				calculo = valorHora * aulas;
				System.out.println("O Sal�rio do Professor Nivel 1 � de: R$ "+calculo);
				condicao = false;
			}else if(nivel == 2) {
				valorHora = 17;
				calculo = valorHora * aulas;
				System.out.println("O Sal�rio do Professor Nivel 2 � de: R$ "+calculo);
				condicao = false;
			}else if(nivel == 3) {
				valorHora = 25;
				calculo = valorHora * aulas;
				System.out.println("O Sal�rio do Professor Nivel 3 � de: R$ "+calculo);
			}else {
				System.out.println("\nNivel do Professor n�o corresponde");
				System.out.printf("Informe um nivel v�lido: ");
				nivel = sc.nextInt();
			}
		}
		
		
	}

}
