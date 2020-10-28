package Seçao3;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		int num1, sucessor, antecessor;
		Scanner in = new Scanner (System.in);
		System.out.println("Informe um valor inteiro");
		num1 = in.nextInt();
		
		antecessor = num1 -1;
		System.out.println(antecessor);
		sucessor = num1 + 1;
		System.out.println(sucessor);
		in.close();

	}

}
