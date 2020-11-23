package Seção3_IntroJava;

import java.util.Scanner;
import java.lang.Math;
public class Ex51 {
	public static void main(String[] args) {
		double distance, x, y;
		Scanner in = new Scanner (System.in);
		System.out.println("Achando a distancia entre dois pontos!!");
		System.out.println("Informe um valor para X: ");
		x = in.nextDouble();
		System.out.println("Informe um valor para Y: ");
		y = in.nextDouble();
		distance = Math.pow(-x, 2) +  Math.pow(-y, 2);
		distance = Math.sqrt(distance);
		System.out.println("A distancia entre esses dois pontos até a sua origem 0,0 é "+(float)distance);
		in.close();
	}
}
