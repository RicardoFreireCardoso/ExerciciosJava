package Seçao3;
import java.util.Scanner;
public class Ex21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double libra,kg;
		System.out.println("Informe um valor em libras para converter:");
		libra = in.nextDouble();
		kg = libra *0.45;
		System.out.println(kg+ " kilos");
		
		in.close();
	}

}
