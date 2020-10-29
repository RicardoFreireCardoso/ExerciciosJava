package Seção3_IntroJava;

import java.util.Scanner;
//1. faça um programa que leia um numero inteiro e o imprima;
//2. faça um programa que leia um numero real e o imprima.
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numeros_inteiros;
		double numero_real; 
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite um numero inteiro:");
		numeros_inteiros = in.nextInt();
		
		System.out.println("Digite um numero real:");
		numero_real = in.nextDouble();
		
		System.out.println("O numero inteiro que vc digitou foi: "+numeros_inteiros);
		System.out.println("O numero real que vc digitou foi: " +numero_real);
		
		in.close();
	}

}
