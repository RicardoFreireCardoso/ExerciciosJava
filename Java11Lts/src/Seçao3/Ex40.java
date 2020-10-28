package Seçao3;

import java.util.Scanner;

public class Ex40 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double dia=30, imposto = 0.92, salario_liquido, dias_work;
		System.out.println("Informe o numero de dias trabalhados");
		dias_work = in.nextDouble();
		
		salario_liquido = (dia * dias_work) * imposto;
		System.out.println("O salario liquido é " + salario_liquido);
		in.close();
	}

}
