package exercicio07;
/*
 * 7. Leia uma temperatura em graus Celsius e apresentá-la convertida em graus Fahrenheit.
 *    A fórmula de conversão é: F=(9*C+160) / 5, sendo F a temperatura em Fahrenheit e 
 *    C a temperatura em Celsius;
 */

import java.util.Scanner;

public class Exercicio_07 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		float temperaturaCelsius;

		System.out.println("Informe: ");
		System.out.printf("Temteratura em graus Celsius: ");
		temperaturaCelsius = sc.nextFloat();
		converterTemperaturaParaFahrenheit(temperaturaCelsius);

	}

	public static void converterTemperaturaParaFahrenheit(float temperaturaCelsius) {
		float calculo = (9 * temperaturaCelsius + 160) / 5;
		System.out.println("Temperatura em Fahrenheit: " + calculo);
	}

}
