package Seçao3;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		double c, k;
		Scanner in = new Scanner (System.in);
		System.out.println("Conversão de kelvin para celsius");
		System.out.println("digite um valor em kelvin para a conversão!");
		k = in.nextDouble();
		
		c = k - 273.15 ;
	System.out.println(c +" celsius");
		
		
		in.close();
	}

}
