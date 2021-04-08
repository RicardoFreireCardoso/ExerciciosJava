package Seção5_EstruturasRepetição;

import java.util.Scanner;

//Escreva um algoritmo que leia certa quantidade de números e imprima o maior deles e quantas vezes o maior numero foi lido. A quantidade de números a serem lidos deve ser fornecidos pelo usuário.
public class Ex18 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Informe a quantidade de valores que deseja declarar: ");
		int contador=0, recebidoMax =0;
		int numeros = in.nextInt(); 
		int[] declara = new int[numeros];
		for (int i = 0; i < numeros; i++) {
			System.out.println("Informe o " + (i + 1) + "ª valor");
			declara[i] = in.nextInt();
			if (declara[i] >= recebidoMax) {
				recebidoMax = declara[i];
				contador += 1;
			}
		}
		System.out.println("Maior valor recebido = "+recebidoMax);
		System.out.println("Quantas vezes o maior número de repete = "+ contador);
		in.close();
	}
	
}
