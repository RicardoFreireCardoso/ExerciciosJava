package Seção3_IntroJava;
import java.util.Scanner;
public class Ex10 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double km, ms;
		System.out.println("KM/h para M/S");
		System.out.println("Digite um valor em KM/h para fazer a conversão");
		km = in.nextDouble();
		
		ms = km / 3.6;
		System.out.println(ms + "m/s");
		in.close();

	}

}
