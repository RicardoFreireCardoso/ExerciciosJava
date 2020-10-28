package Seçao4;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputScan = new Scanner(System.in);
		int ano =0;
		System.out.println("Digite o ano a ser verificado: ");
		ano = inputScan.nextInt();

		if (ano % 4 != 0 && ano % 400 != 0) {

			System.out.println("Ano não é bissexto");
		} else {
			System.out.println("Ano bissexto");
		}
		inputScan.close();
	}

}
