package Seção3_IntroJava;

import java.util.Scanner;

public class Ex02 {
	//2. faça um programa que leia um numero real e o imprima.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double numero_real; 
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um numero real:");
		numero_real = in.nextDouble();
		System.out.println("O número real digitado foi: " +numero_real);
		
		in.close();
	}

}
