package Seção5_EstruturasRepetição;

import java.util.Scanner;

//Faça um programa que leia um numero inteiro positivo ímpar N e imprima todos os números impares de 1 até N em ordem crescente.
public class Ex15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numImpar;
		System.out.println("Informe um número ímpar: ");
		numImpar = in.nextInt();
		System.out.println("Em ordem crescente");
		if(numImpar % 2 == 1) {
			for(int i =0; i<=numImpar; i++) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			}
		}else if (numImpar < 0 || numImpar % 2== 0){
			System.out.println("O número não é ímpar ou não é positivo!");
		}
		in.close();
	}
}
