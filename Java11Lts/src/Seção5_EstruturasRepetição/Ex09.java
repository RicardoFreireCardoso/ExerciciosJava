package Se��o5_EstruturasRepeti��o;

import java.util.Scanner;

//Fa�a um progrma que leia um n�mero inteiro N e depois imprima os N primeiros n�meros naturais impares
public class Ex09 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int num;
		System.out.println("Informe um valor para ver seus antecessores impares: ");
		num = in.nextInt();
		System.out.println("\n---------\n");
		for(int i =0; i< num; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
		in.close();

	}

}
