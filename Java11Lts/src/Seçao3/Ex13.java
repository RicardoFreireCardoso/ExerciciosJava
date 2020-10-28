package Seçao3;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		 double milha, km;
		 System.out.println("KM -> Milhas");
		 System.out.println("digite um valor em km/h para converter:");
		 km = in.nextDouble();
		 
		 milha = km / 1.61;
		 System.out.println(milha + " milhas");
		 in.close();
	}

}
