package exercicio23;

import java.util.Scanner;

/*
 * 23. Fa�a um algoritmo que receba um n�mero e mostre
 *     uma mensagem caso este n�mero seja maior que 80,
 *     menor que 25 ou igual a 40;
 */
public class Exercicio_23 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int numero;
		
		System.out.printf("Informe um n�mero: ");
		numero = sc.nextInt();
		
		verificarNumero(numero);
		
	}
	public static void verificarNumero(int n) {
		if(n>80) {
			System.out.println("N�mero maior que 80!");
		}else if(n == 40){
			System.out.println("N�mero igual a 40!");
		}else if(n<25) {
			System.out.println("N�mero menor que 25!");
		}
		
	}

}
