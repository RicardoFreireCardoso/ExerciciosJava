package Seçao4;
import java.util.Scanner;
public class Ex12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double num1, base;
		System.out.println("Insira um valor para calcular o log");
		num1 = in.nextDouble();
		
		if(num1 <= 0) {
			System.out.println("Número inválido");
		} else {
			System.out.println("Informe a base de log");
			base = in.nextDouble();
			System.out.println(Math.log(num1)/Math.log(base));
		}
		in.close();
	}

}
