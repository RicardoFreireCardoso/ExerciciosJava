package Seçao4;
import java.util.Scanner;
public class Ex18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double num1, num2, soma, divisao, sub, mult;
		int escolha;
		
		System.out.println("Digite o 1° valor");
		num1 = in.nextDouble();
		
		System.out.println("Digite o 2° valor");
		num2 = in.nextDouble();
		
		System.out.println("Agora escolha qual tipo de operação deseja fazer");
		System.out.println("1- soma, 2-subtrair, 3- multiplicar, 4-divisão");
		escolha = in.nextInt();
		
		switch(escolha) {
		case 1: 
			soma = num1+num2;
			System.out.println(num1+ " + "+ num2+ " = " +soma);
			break;
		case 2:
			sub = num1 + num2;
			System.out.println(num1+ " - "+ num2+ " = " +sub);
			break;
		case 3:
			mult = num1 * num2;
			System.out.println(num1+ " * "+ num2+ " = " +mult);
			break;
		case 4:
			divisao = num1 / num2;
			System.out.println(num1+ " / "+ num2+ " = " +divisao);
			break;
		default:
			System.out.println("Opção inválida");
		}
		in.close();
	}

}
