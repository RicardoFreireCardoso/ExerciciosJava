package Seçao3;

import java.util.Scanner;

public class Ex50 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int ano_nascimento, ano_atual = 2020, idade;
		System.out.println("informe sua idade");
		idade = in.nextInt();
		
		ano_nascimento = ano_atual - idade;
		System.out.println("Vc nasceu no ano: "+ano_nascimento);
		in.close();

	}

}
