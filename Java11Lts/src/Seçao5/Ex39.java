package Seçao5;

import java.util.Scanner;

public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double altura, base, area;
		do {
			System.out.println("Informe o valor da Base do triangulo");
			base = in.nextDouble();
			System.out.println("Informe o valor da altura do triangulo:");
			altura = in.nextDouble();
			if(altura <=0 || base <= 0) {
				System.out.println("Área inválida");
			} else {
				area = base * altura;
				System.out.println("O triangulo de base: "+base+ " e altura igual a "+altura+ " resulta em uma área de "+area);
			}
			
		}while(altura >0 || base >0);
		in.close();
	}

}
