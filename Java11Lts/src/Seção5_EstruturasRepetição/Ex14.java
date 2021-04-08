package Seção5_EstruturasRepetição;

import java.util.Scanner;

//Faça um programa que leia um numero inteiro positivo par N e imprima todos os numeros pares de 0 até N em ordem decrescente.
public class Ex14 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numPar;
		System.out.println("Informe um número par: ");
		numPar = in.nextInt();
		System.out.println("Em ordem decrescente...");
		if(numPar % 2 == 0) {
			for(int i = numPar; i >= 0; i--) {
				if(i%2 == 0) {
					System.out.println(i);
				}
			}
		}else if (numPar < 0 || numPar % 2== 1){
			System.out.println("O número não é par ou não é positivo!");
		}
		in.close();
	}
}
