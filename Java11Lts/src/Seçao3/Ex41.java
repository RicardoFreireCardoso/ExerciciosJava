package Seçao3;

import java.util.Scanner;

public class Ex41 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		double valor, num_horas, valor_pago;
		System.out.println("Informe o valor por hora trabalhada");
		valor = in.nextDouble();
		
		System.out.println("Informe a qauntidade de horas trabalhadas");
		num_horas = in.nextDouble();
		
		valor_pago = (valor * num_horas) * 1.10;
		System.out.println("O valor pago é de "+valor_pago);
			in.close();	
	}

}
