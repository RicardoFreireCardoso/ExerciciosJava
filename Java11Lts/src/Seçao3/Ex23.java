package Seçao3;
import java.util.Scanner;
public class Ex23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double metros, jardas;
		System.out.println("Informe um valor em metros e converta para jardas:");
		metros = in.nextDouble();
		
		jardas = metros / 0.91;
		System.out.println(jardas + " jardas");
		in.close();
		
	}

}
