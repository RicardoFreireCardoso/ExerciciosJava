package Seçao4;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, prestação;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Insira a valor de seu salário");
		salario = in.nextDouble();
		System.out.println("Insira o valor da prestação");
		prestação = in.nextDouble();
		
		if(prestação > salario*0.2) {
			System.out.println("Empréstimo não concedido");
		}else {
			System.out.println("Empréstimo concedido");
		}
		in.close();
	}

}
