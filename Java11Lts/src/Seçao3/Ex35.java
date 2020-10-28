package Seçao3;
import java.util.Scanner;
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double ladoA, ladoB, hipo;
		
		System.out.println("Digite um cateto");
		ladoA = in.nextDouble();
		
		System.out.println("Digite outro cateto");
		ladoB = in.nextDouble();
		
		hipo = Math.sqrt(Math.pow(ladoA, 2) + Math.pow(ladoB, 2));
		
		System.out.println(hipo);
		in.close();
		
		
	}

}
