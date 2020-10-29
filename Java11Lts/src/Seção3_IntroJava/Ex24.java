package Seção3_IntroJava;
import java.util.Scanner;
public class Ex24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double metros_quadrados, ac;
		System.out.println("converter metros quadrados para acres:");
		metros_quadrados = in.nextDouble();
		
		ac = metros_quadrados * 0.000247;
		System.out.println(ac);
		in.close();
	}

}
