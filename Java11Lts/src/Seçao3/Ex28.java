package Seçao3;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
		double num1, num2, num3, resultado;
		Scanner in = new Scanner (System.in);
		System.out.println("Informe o 1° valor");
		num1 = in.nextDouble();
		System.out.println("Informe o 2° valor");
		num2 = in.nextDouble();
		System.out.println("Informe o 3° valor");
		num3 = in.nextDouble();
		
		resultado = (num1*num1) + (num2*num2) + (num3*num3);
		System.out.println(resultado);
		in.close();

	}

}
