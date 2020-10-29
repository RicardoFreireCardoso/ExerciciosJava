package Seção3_IntroJava;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		double ms, km;
		Scanner in = new Scanner (System.in);
		
		System.out.println("CONVERTOR DE M/S PARA kM/H");
		System.out.println("Digite um valor em m/s");
		ms = in.nextDouble();
		
		km = ms * 3.6;
		System.out.println(km + "KM/H");
		in.close();
	}

}
