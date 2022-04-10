package exercicio34;
/*
 * 34. Elabore um algoritmo que, dada a idade de um nadador. Classifique-o em uma das seguintes categorias:
		a. Infantil A = 5 - 7 anos;
		b. Infantil B = 8 - 10 anos;
		c. Juvenil A = 11- 13 anos;
		d. Juvenil B = 14 - 17 anos;
		e. Sênior = 18 - 25 anos.
	   Apresentar mensagem “idade fora da faixa etária” quando for outro ano não contemplado;
 */

import java.util.Scanner;

public class Exercicio_34 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int idade;
		
		System.out.printf("Informe a idade do nadador: ");
		idade = sc.nextInt();
		verificarCategoria(idade);
		
	}

	static void verificarCategoria(int idade) {
		if(idade > 4 && idade < 8) {
			System.out.println("Categoria Infantil A = 5 - 7 anos!");
		}else if(idade > 7 && idade < 11) {
			System.out.println("Categoria Infantil B = 8 - 10 anos!");
		}else if(idade > 10 && idade < 14) {
			System.out.println("Categoria Juvenil A = 11 - 13 anos!");
		}else if(idade > 13 && idade < 18) {
			System.out.println("Categoria Juvenil B = 14 - 17 anos!");
		}else if(idade > 17 && idade < 26) {
			System.out.println("Categoria Sênior = 18 - 25 anos!");
		}else {
			System.out.println("Idade fora da faixa etária!");
		}
		
	}

}
