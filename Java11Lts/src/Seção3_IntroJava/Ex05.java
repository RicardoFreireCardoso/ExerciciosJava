package Seção3_IntroJava;
import java.util.Scanner;
public class Ex05 {
	//Leia um numero real e imprima o resultado da quinta parte desse numero;
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double num1, resultado;
		
		System.out.println("Digite um numero para obter o resultado da quinta parte desse numero!");
		num1 = in.nextDouble();
		
		resultado = num1 / 5;
		System.out.println(resultado);
		in.close();
	}

}
