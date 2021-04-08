package Seção7_Vetores_MatrizesP1;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a[] = new int [10];
		int par = 0;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("Digite o valor "+(i+1)+": ");
			a[i] = in.nextInt();
		}
		
		for(int i=0; i<a.length; i++) {
			if((a[i]%2)==0) {
				System.out.println("A posição "+i+ " é PAR igual a "+a[i]);
				par = par +1;
			}
			
		}
		System.out.println("A quantidade de elementos pares é :  "+ par);
		in.close();
	}

}
