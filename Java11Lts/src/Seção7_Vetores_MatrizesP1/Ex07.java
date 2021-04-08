package Seção7_Vetores_MatrizesP1;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner in = new Scanner (System.in);
		
		int num [] = new int [10];
		int max = 0 ;
		int maiorPosicao = 0;
		
		for(int i = 0; i<num.length; i++) {
			System.out.println("Digite o "+(i+1)+" ^ valor:  ");
			num[i] = in.nextInt();
		if(num[i] > max) {
			max = num[i];
			maiorPosicao = i+1;
			
		}
		}
		
		System.out.println("Maior valor do vetor = "+max);
		System.out.println("O maior valor está na posição: "+maiorPosicao);
		in.close();
	}

}
