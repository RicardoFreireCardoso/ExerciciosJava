package Seção5_EstruturasRepetição;

import java.util.Scanner;

//Faça um progrma que leia um numero inteiro positivo N e imprima todos os numeros naturais de 0 até N em ordem crescente.
public class Ex11 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		System.out.println("Informe um valor: ");
		num = in.nextInt();
		System.out.println("\nOrdem crescente...\n");
		for(int i =0; i>=0; i++) {
			
				System.out.println(i);
		}
		System.out.println(num);
		in.close();


	}

}
