package Se��o5_EstruturasRepeti��o;

import java.util.Scanner;

//Escreva um algoritmo que leia um n�mero inteiro entre 100 e 999 e imprima na saida cada um dos algarismos que comp�em o n�mero.
public class Ex19 {
	public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int valorUsuario, terceiro, segundo,primeiro;

	System.out.print("Entre com um valor de 3 casas (inteiro): ");
	valorUsuario = in.nextInt();

	terceiro = valorUsuario % 10;
	valorUsuario /= 10;
	segundo = valorUsuario % 10;
	valorUsuario /= 10;
	primeiro = valorUsuario % 10;

	System.out.printf("%d   %d   %d\n",primeiro, segundo, terceiro);
	in.close();

	}//fim m�todo principal main
}

