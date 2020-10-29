package Seção3_IntroJava;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double metros_cubicos, litros;
		Scanner in = new Scanner (System.in);
		System.out.println("informe um valor em litros para converter para metros cubicos");
		litros = in.nextDouble();
		
		metros_cubicos = litros / 1000;
		System.out.println(metros_cubicos);
		in.close();
	}

}
