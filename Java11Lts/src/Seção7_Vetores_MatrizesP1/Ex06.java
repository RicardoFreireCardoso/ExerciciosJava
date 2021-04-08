package Seção7_Vetores_MatrizesP1;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);
		
		int num [] = new int [10];
		int max = 0 , min = Integer.MAX_VALUE;
		
		for(int i = 0; i<num.length; i++) {
			System.out.println("Digite o "+(i+1)+" ^ valor:  ");
			num[i] = in.nextInt();
		if(num[i] > max) {
			max = num[i];
			
		}
		}
		for(int j = 0; j < num.length; j++) {
			if(num[j] < min) {
				min = num[j];
			}
		}
		System.out.println("Maior valor do vetor = "+max);
		System.out.println("Menor valor do vetor = "+min);
		
		in.close();
	}

}
