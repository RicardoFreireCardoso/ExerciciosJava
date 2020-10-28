package Seçao3;
import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double raio, pi=3.141592 , area;
		System.out.println("Insira o raio do circulo");
		raio = in.nextDouble() ;
		
		area = pi * (raio * raio);
		System.out.println("área do circulo: " +area);
		in.close();

	}

}

