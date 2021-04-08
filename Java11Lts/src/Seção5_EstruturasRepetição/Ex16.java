package Seção5_EstruturasRepetição;
//Faça um programa que leia um número inteiro positivo ímpar N e imprima todos os números impares de 1 até N em ordem decrescente.
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numImpar;
		System.out.println("Informe um número ímpar: ");
		numImpar = in.nextInt();
		System.out.println("Em ordem decrescente...");
		if(numImpar % 2 == 1) {
			for(int i = numImpar; i >= 0; i--) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			}
		}else if (numImpar < 0 || numImpar % 2== 0){
			System.out.println("O número não é ímpar ou não é positivo!");
		}
		in.close();

	}

}
