package Se�ao3;
import java.util.Scanner;
public class Ex6 {

	public static void main(String[] args) {
		double celsius, fahrenheit;
		Scanner in = new Scanner (System.in);
		System.out.println("Convers�o de celsius para fahrenheit");
		System.out.println("Digite uma temperatura em celsius para obter esssa em fahrenheit");
		celsius = in.nextDouble();
		
		fahrenheit = (celsius * 9 / 5 ) + 32;
		System.out.println(fahrenheit);
		in.close();
	}

}
