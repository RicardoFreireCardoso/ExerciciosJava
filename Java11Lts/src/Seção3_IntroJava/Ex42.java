package Se��o3_IntroJava;

import java.util.Scanner;

public class Ex42 {

	public static void main(String[] args) {
		double salarioBase, salarioReceber, gratifica��o = 1.05, imposto = 0.93;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe o salario base");
		salarioBase = in.nextDouble();
		
		salarioReceber = (salarioBase * gratifica��o) * imposto;
		System.out.println("O salario receber � " +salarioReceber);
		
		in.close();
	}

}
