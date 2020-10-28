package Seçao3;
import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double metros_quadrados, hectares;
		System.out.println("Digite um valor em hectares para converter em metros");
		hectares = in.nextDouble();
		
		metros_quadrados = hectares * 1000;
		System.out.println(metros_quadrados+ " Metros quadrados");
		in.close();
	}

}
