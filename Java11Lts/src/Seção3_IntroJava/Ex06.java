package Seção3_IntroJava;
import java.util.Scanner;
public class Ex06 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner in = new Scanner (System.in);
		System.out.println("Conversão de celsius para fahrenheit");
		System.out.println("Digite uma temperatura em celsius para obter esssa em fahrenheit");
		celsius = in.nextDouble();
		
		fahrenheit = (celsius * 9 / 5 ) + 32;
		System.out.println(fahrenheit);
		in.close();
	}

}
