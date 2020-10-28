package Seçao4;
import java.util.Scanner;
public class Ex11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		int num1, soma, resto;
		
		System.out.println("Insira um valor");
		num1 = in.nextInt();
		
		if (num1 > 0) {
			soma = 0;
			while (num1 != 0) {
				resto = num1 % 10;
				num1 = (num1 - resto) / 10;
				soma = soma + resto;
				System.out.println(soma);
			}
		}else {
			System.out.println("Numero invalido");
		}
		in.close();
	}

}
