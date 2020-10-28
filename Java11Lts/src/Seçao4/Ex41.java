package Seçao4;
import java.util.Scanner;
public class Ex41 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float imc, peso, altura;
		System.out.println("CALCULADORA DE IMC");
		System.out.println("-------------------------------------------");
		System.out.println("Digite sua altura em metros:");
		altura = in.nextFloat();
		
		System.out.println("Digite seu peso em KG:");
		peso = in.nextFloat();
		
		imc = peso / (altura * altura);
		System.out.println("Seu imc é " +imc);
	
		if (imc <= 18.5) {
			System.out.println("Abaixo do peso");
		} if (18.6 <=imc && imc<= 24.9) {
			System.out.println("Saudavel");
		} if(25 <= imc && imc <=29.9) {
			System.out.println("Peso em excesso");
		}if (30<= imc && imc <= 34.9) {
			System.out.println("Obesidade Grau I");
		} if (35 <= imc && imc <= 39.9) {
			System.out.println("Obesidade Grau II (severa");
		} if (imc >= 40 ) {
			System.out.println("Obesidade Grau III (mórbida)");
		} else {
			in.close();
		}
		
	}

}
