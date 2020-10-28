package Seçao3;
import java.util.Scanner;
public class Ex22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double jardas, metros;
		System.out.println("Informe um valor em jardas e converta para metros:");
		jardas = in.nextDouble();
		
		metros = 0.91 * jardas;
		System.out.println(metros+ " metros");
		in.close();
	}

}
