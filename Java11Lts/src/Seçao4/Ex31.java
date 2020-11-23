package Seçao4;

import java.util.Scanner;

public class Ex31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	 float height, weight;
	 Scanner in =new Scanner (System.in);
	 System.out.println("Insira sua altura metros:");
	 height = in.nextFloat(); 
	 System.out.println("Insira em peso em KGs:");
	 weight = in.nextFloat();
	 if (height < 1.20 && weight < 60) {
		 System.out.println("Sua Classificação é = A");
	 } else if (height < 1.20 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classificação é = D");
	 } else if (height < 1.20 && weight > 90) {
		 System.out.println("Sua Classificação é = G");
	 } else if (1.20>= height && height <=1.70 && weight<60) {
		 System.out.println("Sua Classificação é = B");
	 } else if(1.20>= height && height <=1.70 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classificação é = E");
	 } else if(1.20>= height && height <=1.70 && weight > 90 ) {
		 System.out.println("Sua Classificação é = H");
	 } else if(height > 1.70 && weight < 60) {
		 System.out.println("Sua Classificação é = C");
	 }else if (height > 1.70 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classificação é = F");
	 } else if(height > 1.70 && weight > 90) {
		 System.out.println("Sua Classificação é = I");
	 }
	 in.close();
	}

}
