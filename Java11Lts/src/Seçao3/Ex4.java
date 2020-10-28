package Seçao3;
import java.util.Scanner;
public class Ex4 {
//Leia um numero real e imprima o resultado ao quadrado desse numero;
	public static void main(String[] args) {
		double num1, resultado;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um numero real e será exibido o valor dele ao quadrado!!");
		num1 = in.nextDouble();
		
		resultado = num1*num1;
		System.out.println(resultado);
		in.close();

	}

}
