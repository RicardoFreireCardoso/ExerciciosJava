package Seção5_EstruturasRepetição;
//Escreva um progrma que leia 10 números e escreva o menor valor lido e o maior valor lido.
import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double num [] = new double [10];
		double max = num[0];
		double min = Integer.MAX_VALUE;
		for(int i=0; i<num.length;i++) {
			System.out.println("Informe um valor: ");
			num[i] = in.nextDouble();
			if(num[i]>max) {
				max = num[i];
			}
		}
		for(int j =0; j < num.length; j++) {
			if(num[j] < min) {
				min = num[j];
			}
		}
		System.out.println("Maior valor = "+ max);
		System.out.println("Menor valor = "+ min);
		in.close();
	}

}
