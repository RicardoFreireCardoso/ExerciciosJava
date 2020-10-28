package Seçao4;
import java.util.Scanner;
public class Ex30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double n1, n2, n3;
		System.out.println("Digite 3 valores ");
		System.out.println("1º valor");
		n1 = in.nextDouble();
		System.out.println("2º valor");
		n2 = in.nextDouble();
		System.out.println("3º valor");
		n3 = in.nextDouble();
		
		if(n1 > n2 && n1>n3 && n2>n3) {
			System.out.println(n3);
			System.out.println(n2);
			System.out.println(n1);
		}else if (n2>n1 && n2>n3 && n1< n3) {
			System.out.println(n1);
			System.out.println(n3);
			System.out.println(n2);
		} else if(n3>n2 && n3>n1 && n2>n1 ) {
			System.out.println(n1);
			System.out.println(n2);
			System.out.println(n3);
		} else if(n1<n2 && n1>n3 && n2>n3) {
			System.out.println(n3);
			System.out.println(n1);
			System.out.println(n2);
		} else if (n1>n2 && n1>n3 && n3>n2) {
			System.out.println(n2);
			System.out.println(n3);
			System.out.println(n1);
		} else if (n1>n2 && n1<n3 && n2 < n3) {
			System.out.println(n2);
			System.out.println(n1);
			System.out.println(n3);
		}
		in.close();
			
	}

}
