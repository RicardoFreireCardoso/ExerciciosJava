package Se�ao4;

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
		 System.out.println("Sua Classifica��o � = A");
	 } else if (height < 1.20 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classifica��o � = D");
	 } else if (height < 1.20 && weight > 90) {
		 System.out.println("Sua Classifica��o � = G");
	 } else if (1.20>= height && height <=1.70 && weight<60) {
		 System.out.println("Sua Classifica��o � = B");
	 } else if(1.20>= height && height <=1.70 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classifica��o � = E");
	 } else if(1.20>= height && height <=1.70 && weight > 90 ) {
		 System.out.println("Sua Classifica��o � = H");
	 } else if(height > 1.70 && weight < 60) {
		 System.out.println("Sua Classifica��o � = C");
	 }else if (height > 1.70 && 60>=weight && weight <=90) {
		 System.out.println("Sua Classifica��o � = F");
	 } else if(height > 1.70 && weight > 90) {
		 System.out.println("Sua Classifica��o � = I");
	 }
	 in.close();
	}

}
