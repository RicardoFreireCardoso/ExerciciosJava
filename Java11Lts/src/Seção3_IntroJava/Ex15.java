package Seção3_IntroJava;

import java.util.Scanner;

public class Ex15 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double graus, rad, pi=3.14;
		System.out.println("DIgite em radianos para obter em graus");
		rad = in.nextDouble();
		
		graus = (rad * 180) / pi;
		System.out.println(graus);
				
		in.close();
	}

}
