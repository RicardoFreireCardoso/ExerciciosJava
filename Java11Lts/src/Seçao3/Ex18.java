package Seçao3;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double metros_cubicos, litros;
		Scanner in = new Scanner (System.in);
		System.out.println("Informe um valor em metros cubicos para ser convertido para litros");
		metros_cubicos = in.nextDouble();
		
		litros = 1000 * metros_cubicos;
		System.out.println(litros + " L");
		in.close();
	}

}
