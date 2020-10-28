package Seçao3;
import java.util.Scanner;
public class Ex9 {

	public static void main(String[] args) {
	double c, k;
	Scanner in = new Scanner (System.in);
		System.out.println("Convertor celsius para kelvin"); 
		System.out.println("Digite um valor em celsius para a conversão");
		c = in.nextDouble();
		
		k = c + 273.15;
		System.out.println(k +" kelvin");
		in.close();
		
		
		

	}

}
