package Se�ao3;
import java.util.Scanner;
public class Ex8 {

	public static void main(String[] args) {
		double c, k;
		Scanner in = new Scanner (System.in);
		System.out.println("Convers�o de kelvin para celsius");
		System.out.println("digite um valor em kelvin para a convers�o!");
		k = in.nextDouble();
		
		c = k - 273.15 ;
	System.out.println(c +" celsius");
		
		
		in.close();
	}

}
