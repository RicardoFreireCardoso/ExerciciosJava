package Se�ao4;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a ,b;
		System.out.println("Digite o 1� valor");
		a = in.nextInt();
		System.out.println("Digite o 2� valor");
		b = in.nextInt();
		
		if(a>b) {
			System.out.println(a + " maior que " +b);
			a = a-b;
			System.out.println("A diferen�a entre os valores � " +a);
		}else if (a<b) {
			System.out.println(b + " maior que " +a);
			b = b - a;
			System.out.println("A diferen�a entre os valores � " +b);
		} else if (a==b) {
			System.out.println("Numeros iguais");
			
		} else {
			System.out.println("Valor invalido");
		}
		in.close();
	}

}
