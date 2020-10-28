package Seçao4;
import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float num1, num2;
		
		System.out.println("Insira o 1° valor");
		num1 = in.nextFloat();
		System.out.println("Insira o 2° valor");
		num2 = in.nextFloat();
		
		if (num1 > num2) {
			System.out.println(num1+ " é maior");
		}else if (num2 > num1) {
			System.out.println(num2+ " é maior");
		} else {
			System.out.println("Vc digitou valores identicos");
		}
		in.close();

	}

}
