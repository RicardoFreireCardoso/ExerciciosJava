package Seçao4;
import java.util.Scanner;
public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double preco_antigo, preco_novo = 0;
		Scanner in = new Scanner (System.in);
		System.out.println("informe um valor para recebe-lo atualizado");
		preco_antigo = in.nextDouble();
		
		if (preco_antigo < 50) {
			preco_novo = preco_antigo * 1.05;	
			System.out.println(preco_novo);
		} else if (50 <= preco_antigo && preco_antigo <= 100) {
			preco_novo = preco_antigo * 1.10;
			System.out.println(preco_novo);
		} else if (preco_antigo > 100) {
			preco_novo = preco_antigo * 1.15;
			System.out.println(preco_novo);
		} else {
			System.out.println("erro");
		}
		if (preco_novo < 80) {
			System.out.println("Barato");
		} else if (80 <= preco_novo && preco_novo <=120) {
			System.out.println("Normal");
		} else if (120 < preco_novo && preco_novo <= 200) {
			System.out.println("Caro");
		} else if (preco_novo > 200) {
			System.out.println("Muito caro");
		} else {
			System.out.println("ERRO");
		}

		in.close();
		
	}

}
