package Seçao4;
import java.util.Scanner;
public class Ex17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double bMaior, bMenor, altura, area;
		
		System.out.println("Digite a Base maior");
		bMaior = in.nextDouble();
		
		System.out.println("Digite a Base menor");
		bMenor = in.nextDouble();
		
		System.out.println("Digite a altura");
		altura = in.nextDouble();
		
		
		area = (bMaior + bMenor)* altura / 2;
		System.out.println("A área do trapezio " +area);
		
		in.close();
	}

}
