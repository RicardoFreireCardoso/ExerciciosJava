package Se��o5_EstruturasRepeti��o;

import java.util.Scanner;

//Fa�a um programa que leia um numero inteiro positivo �mpar N e imprima todos os n�meros impares de 1 at� N em ordem crescente.
public class Ex15 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numImpar;
		System.out.println("Informe um n�mero �mpar: ");
		numImpar = in.nextInt();
		System.out.println("Em ordem crescente");
		if(numImpar % 2 == 1) {
			for(int i =0; i<=numImpar; i++) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			}
		}else if (numImpar < 0 || numImpar % 2== 0){
			System.out.println("O n�mero n�o � �mpar ou n�o � positivo!");
		}
		in.close();
	}
}
