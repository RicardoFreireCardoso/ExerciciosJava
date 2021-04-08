package Seção5_EstruturasRepetição;

import java.util.Scanner;

//Faça um programa que leia um numero inteiro positivo N e imprima todos os numeros naturais de 0 até N em ordem decrescente.
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Informe um valor: ");
		int num = in.nextInt();
		for (int i = num; i >= 0; i--){
			System.out.println(i);
			}

		in.close();
	}

}
