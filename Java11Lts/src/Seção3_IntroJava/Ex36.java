package Seção3_IntroJava;
import java.util.Scanner;
public class Ex36 {
	//Calculando o volume do cilindro 
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double volume, altura, raio, pi= 3.151592;
		
		System.out.println("Vamos calcular o vol. cilindro");
		System.out.println("Digite a altura do cilindro");
		altura = in.nextDouble();
		
		System.out.println("digite o raio do cilindro");
		raio = in.nextDouble();
		
		volume = pi * raio * raio * altura;
		System.out.println("O volume do cilindro é "+volume);
		in.close();

	}

}
