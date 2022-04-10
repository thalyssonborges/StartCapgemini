package exercicio32;

import java.util.Scanner;

/*
 * 32. Escreva um algoritmo que leia três valores inteiros e verifique se eles 
 *     podem ser os lados de um triângulo. Se forem, informar qual o tipo de 
 *     triângulo que eles formam: equilátero, isóscele ou escaleno. 
 *     Propriedade: o comprimento de cada lado de um triângulo é menor do que a 
 *     soma dos comprimentos dos outros dois lados.
	   a. Triângulo Equilátero: aquele que tem os comprimentos dos três lados iguais;
	   b. Triângulo Isóscele: aquele que tem os comprimentos de dois lados iguais.
	   c. Triângulo equilátero é também isóscele;
	   d. Triângulo Escaleno: aquele que tem os comprimentos de seus três lados diferentes;
 */
public class Exercicio_32 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int lado1, lado2, lado3;
		
		System.out.println("Informe os lados de um triângulo: ");
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
			System.out.println("É um Triangulo!");
			if(L1 == L2 && L2 == L3) {
				System.out.println("Este Triângulo é Equilatero (Todos os lados iguais).");
				System.out.println("Este Triângulo também é Isóscele (Dois lados iguais).");
			}else if(L1 == L2 || L1 == L3 || L2 == L3) {
				System.out.println("Este Triângulo é Isóscele (Dois lados iguais).");
			}else {
				System.out.println("Este Triângulo é Escaleno (Todos os lados são diferentes).");
			}
		}else {
			System.out.println("Não tem as propriedades de um triângulo!");
		}
	}

}
