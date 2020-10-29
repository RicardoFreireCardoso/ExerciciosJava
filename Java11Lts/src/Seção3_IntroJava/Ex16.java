package Seção3_IntroJava;

import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double polegadas, cm;
		System.out.println("Polegadas -> centimentros");
		System.out.println("Digite um valor em Polegadas para converter");
		polegadas = in.nextDouble();
		
		cm = polegadas * 2.54;
		System.out.println(cm + " centimentros");
		in.close();

	}

}
