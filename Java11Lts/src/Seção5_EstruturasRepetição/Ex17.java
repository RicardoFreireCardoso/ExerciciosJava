package Se��o5_EstruturasRepeti��o;
//Fa�a um programa que leia um n�mero inteiro positivo N e calcule a soma dos N primeiros numeros naturais.

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Informe um numero inteiro positivo: ");
		int num = in.nextInt();
		int soma = 0;
		
		if(num>0) {
			for(int i = 0; i <= num; i++) {
				soma = soma + i;
				
			}
		} else {
			System.out.println("O valor informado n�o � positivo ou inteiro!");
		}
		System.out.println("a soma dos " +num+ " primeiro n�meros naturais � igual a " +soma);
		in.close();
	}

}
