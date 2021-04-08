package Seção5_EstruturasRepetição;
//Escreva um programa que escreva na tela, de 1 até 100, de 1 em 1, 3 vezes. A primeira vez deve usar a estrutura de repetição for, a segunda while e a terceira do while.
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 1, num1=1;
		for(int i=1; i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("------------------1°---------------------");
		while(num<=100) {
			System.out.println(num);
			num++;
		}
		System.out.println("-------------------2°--------------------");
		do {
			System.out.println(num1);
			num1++;
			
		} while(num1 <=100);
		System.out.println("--------------------3°-----------------------");
		
	}

}
