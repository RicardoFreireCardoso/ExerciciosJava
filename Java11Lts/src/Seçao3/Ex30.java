package Seçao3;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float real, dolar, conversao_p_dolar;
		System.out.println("Informe o valor em reais");
		real = in.nextFloat();
		
		System.out.println("Infome a cotação do dolar");
		dolar = in.nextFloat();
		
		conversao_p_dolar = real / dolar ;
		System.out.println(conversao_p_dolar + " dolares");
		in.close();
	}

}
