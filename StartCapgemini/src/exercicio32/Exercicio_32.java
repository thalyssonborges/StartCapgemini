package exercicio32;

import java.util.Scanner;

/*
 * 32. Escreva um algoritmo que leia tr�s valores inteiros e verifique se eles 
 *     podem ser os lados de um tri�ngulo. Se forem, informar qual o tipo de 
 *     tri�ngulo que eles formam: equil�tero, is�scele ou escaleno. 
 *     Propriedade: o comprimento de cada lado de um tri�ngulo � menor do que a 
 *     soma dos comprimentos dos outros dois lados.
	   a. Tri�ngulo Equil�tero: aquele que tem os comprimentos dos tr�s lados iguais;
	   b. Tri�ngulo Is�scele: aquele que tem os comprimentos de dois lados iguais.
	   c. Tri�ngulo equil�tero � tamb�m is�scele;
	   d. Tri�ngulo Escaleno: aquele que tem os comprimentos de seus tr�s lados diferentes;
 */
public class Exercicio_32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Informe os lados de um tri�ngulo: ");
		System.out.printf("Lado 1: ");
		lado1 = sc.nextInt();
		System.out.printf("Lado 2: ");
		lado2 = sc.nextInt();
		System.out.printf("Lado 3: ");
		lado3 = sc.nextInt();
		
		informarTriangulo(lado1, lado2, lado3);
		
	}
	public static void informarTriangulo(int L1, int L2, int L3) {
		int somaLados1 = L1 + L2;
		int somaLados2 = L1 + L3;
		int somaLados3 = L2 + L3;
		
		if(L3 < somaLados1 && L2 < somaLados2 && L1 < somaLados3) {
			System.out.println("� um Triangulo!");
			if(L1 == L2 && L2 == L3) {
				System.out.println("Este Tri�ngulo � Equilatero (Todos os lados iguais).");
				System.out.println("Este Tri�ngulo tamb�m � Is�scele (Dois lados iguais).");
			}else if(L1 == L2 || L1 == L3 || L2 == L3) {
				System.out.println("Este Tri�ngulo � Is�scele (Dois lados iguais).");
			}else {
				System.out.println("Este Tri�ngulo � Escaleno (Todos os lados s�o diferentes).");
			}
		}else {
			System.out.println("N�o tem as propriedades de um tri�ngulo!");
		}
	}

}
