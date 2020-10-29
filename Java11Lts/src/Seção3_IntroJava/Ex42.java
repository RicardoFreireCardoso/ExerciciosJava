package Seção3_IntroJava;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		double salarioBase, salarioReceber, gratificação = 1.05, imposto = 0.93;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o salario base");
		salarioBase = in.nextDouble();
		
		salarioReceber = (salarioBase * gratificação) * imposto;
		System.out.println("O salario receber é " +salarioReceber);
		
		in.close();
	}

}
