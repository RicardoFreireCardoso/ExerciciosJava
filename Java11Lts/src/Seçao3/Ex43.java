package Seçao3;

import java.util.Scanner;

public class Ex43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.println("Programa de ajuda para vendedores");
		double valor_total, total_desconto, parcela, comissao;
	
		
		System.out.println("Digite o valor total");
		valor_total = in.nextDouble();
		
		total_desconto = valor_total * 0.90;
		System.out.println("O valor com desconto inicial é " +total_desconto);
		
		
		comissao = total_desconto * 0.05;
		parcela = total_desconto / 3;
		System.out.println(" 3x: "+parcela+ " sem juros");
		System.out.println("O vendedor receberá R$: "+comissao);
		System.out.println("-------------------------------------------------------------------------");
	
		comissao = valor_total * 0.05;
		System.out.println("O vendedor receberá R$: "+comissao);
		System.out.println("O valor avista é de: "+ total_desconto);
		
		
		in.close();
				
	}

}
