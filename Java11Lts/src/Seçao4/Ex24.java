package Seçao4;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double valor;
		String estado;
		
		System.out.println("Informe o valor do produto");
		valor = in.nextDouble();
		
		System.out.println("Informe o estado");
		estado = in.next();
		
		if(estado.equalsIgnoreCase("MG")) {
			valor = valor * 1.07;
			System.out.println("VALOR = " +valor);
		} else if (estado.equalsIgnoreCase("SP")) {
			valor = valor * 1.12;
			System.out.println("VALOR = " +valor);
		} else if (estado.equalsIgnoreCase("RJ")) {
			valor = valor * 1.15;
			System.out.println("VALOR = " +valor);
		} else if (estado.equalsIgnoreCase("MS")) {
			valor = valor * 0.08;
			System.out.println("VALOR em " +estado+ " é = " +valor);
		} else {
			System.out.println("Estado informado não é valido");
		}
		in.close();
	}

}
