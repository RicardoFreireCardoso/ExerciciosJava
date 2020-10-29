package Seção3_IntroJava;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double ganhador1 = 0.46, ganhador2 = 0.32, ganhador3 = 0.22, premio = 780000;
		Scanner in = new Scanner (System.in);
		ganhador1 = premio*ganhador1;
		ganhador2 = premio*ganhador2;
		ganhador3 = premio*ganhador3;
		System.out.println("O 1ª ganhador ganha R$ "+ganhador1);
		System.out.println("O 2ª ganhador ganha R$ "+ganhador2);
		System.out.println("O 3ª ganhador ganha R$ "+ganhador3);
		in.close();
	}

}
