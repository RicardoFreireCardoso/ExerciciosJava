 package Seção5_EstruturasRepetição;

import java.util.Scanner;
//Faça um programa que calcule a área do triangulo, cuja base e altura são fornceidas pelo usuário.
//Esse programa não pode permitir a entrada de dados inválidos, ou seja, medidas menores ou iguais a 0.
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
