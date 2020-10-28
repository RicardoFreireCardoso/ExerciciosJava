 package Seçao4;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double num1;
		System.out.println("Digite um valor");
		num1 = in.nextDouble();
		
		if (num1 >= 1) {
			System.out.println( "A raiz de " +num1+ " é = " + Math.sqrt(num1));
		} else if (num1 <=0) {
			System.out.println("Valor inválido");
		}
		in.close();
	}

}