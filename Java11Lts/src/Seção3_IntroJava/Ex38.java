package Seção3_IntroJava;
import java.util.Scanner;
public class Ex38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		double salario, aumento=1.25;
		System.out.println("Informe seu salario");
		salario = in.nextDouble();
		
		salario = salario * aumento;
		System.out.println("Seu novo salário = " +salario);
		in.close();
	}

}
