package Seção3_IntroJava;
import java.util.Scanner;
//Leia um valor em acres e apresente a conversão em metros quadrados.
//Formula da conversão M = A * 4048,58.
//M = metros & A = acres
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double  acres;
		float metros;
		System.out.println("Informe a área em acres: ");
		acres = in.nextDouble();
	metros = (float) (acres * 4048.58);
	System.out.println("área em metros quadrados: "+metros);
	in.close();
	}

}
