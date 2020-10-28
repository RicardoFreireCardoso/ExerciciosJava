package Seçao3;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner in = new Scanner (System.in);
		System.out.println("Conversão de fahrenheit para celsius");
		System.out.println("Digite uma temperatura em fahrenheit para obter esssa em celsius");
		fahrenheit = in.nextDouble();
		
		celsius = 5 * (fahrenheit-32) / 9;
		System.out.println(celsius);
		in.close();

	}

}
