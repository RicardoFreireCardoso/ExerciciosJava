//crie um programa que lê 6 valores inteiros pares e em seguida, mostre na tela os valores lidos na ordem inversa. 

package Seção7_Vetores_MatrizesP1;
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] firstArray = new int [6];
		int [] secondArray = new int [6];
		Scanner in = new Scanner (System.in);
		
		
		for(int i = 0; i<firstArray.length; i++) {
			System.out.println("Digite o "+(i+1)+" ^ valor:  ");
			firstArray[i] = in.nextInt();
		
		}
		
	for(int i = firstArray.length - 1; i >= 0; i++) {
		secondArray[secondArray.length - i - 1] = firstArray[i];
		System.out.println(" ");
	}
	in.close();
	}

}
