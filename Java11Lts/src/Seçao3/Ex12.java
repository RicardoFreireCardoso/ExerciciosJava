package Seçao3;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double milhas, km;
		System.out.println("CONVERTOR MILHAS PARA KM");
		System.out.println("Digite um valor em milhas para converter");
		milhas = in.nextDouble();
		
		km = 1.61 * milhas;
		System.out.println(km+ " KM/H");
		in.close();
		
	}

}
