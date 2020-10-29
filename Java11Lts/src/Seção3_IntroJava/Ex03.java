package Seção3_IntroJava;

import java.util.Scanner;

public class Ex03 {
	//peça ao usuario para digitar 3 valores inteiros e imprima a soma deles.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int num1, num2, num3, soma;
		 
		 Scanner in = new Scanner (System.in);
		 System.out.println("Digite o 1º valor para a soma");
		 num1 = in.nextInt();
		 System.out.println("Digite o 2º valor para a soma");
		 num2 = in.nextInt();
		 System.out.println("Digite o 3º valor para a soma");
		 num3 = in.nextInt();
		 
		 soma = num1 + num2 + num3;
		 System.out.println("A soma dos números informados foi: " + soma );
		 
		 in.close();
	}

}
