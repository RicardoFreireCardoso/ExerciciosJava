package Seçao4;
import java.util.Scanner;
public class Ex08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double nota1, nota2, media;
		System.out.println("Insira a 1º nota");
		nota1 = in.nextDouble();
		System.out.println("Insira a 2º nota");
		nota2 = in.nextDouble();
		if(0<=nota1 && nota1<=10 && 0<=nota2 && nota2 <=10) {
			media = (nota1 + nota2) / 2;
			System.out.println("Media = "+media);
		} else {
			System.out.println("Nota inválida");
		}
		in.close();

	}

}
