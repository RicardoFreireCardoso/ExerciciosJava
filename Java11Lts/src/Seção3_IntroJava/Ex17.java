package Seção3_IntroJava;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double polegadas, cm;
		System.out.println("Centimentros -> Polegadas");
		System.out.println("Digite um valor em Centimentros para converter");
		cm = in.nextDouble();
		
		polegadas = cm / 2.54;
		System.out.println(polegadas + " polegadas");
		in.close();
	}

}
