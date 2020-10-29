package Seção3_IntroJava;
import java.util.Scanner;
public class Ex14 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double graus, rad, pi=3.14;
		System.out.println("DIgite em graus para obter em radianos");
		graus = in.nextDouble();
		
		rad = (graus * pi) / 180;
		System.out.println(rad);
		in.close();

	}

}
