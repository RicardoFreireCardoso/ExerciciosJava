package Seção5_EstruturasRepetição;
//Faça um programa que calcule e mostre a soma dos 50 números pares.
public class Ex10 {
	public static void main(String[] args) {
		int num = 100;
		int conta = 0;
		System.out.println("\nInciando...\n");
		for(int i =0; i< num; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
				conta = conta + i;
			}
		}
		
		System.out.println("--------\n"+conta+" é a soma é dos 50 primeiros números pares");
	}

}
