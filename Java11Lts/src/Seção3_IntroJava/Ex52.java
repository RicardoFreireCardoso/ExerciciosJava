package Seção3_IntroJava;
import java.util.Scanner;
public class Ex52 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double amigo1, amigo2, amigo3, valor_premio, soma;
		System.out.println("Insira o valor investido do 1° amigo");
		amigo1= in.nextDouble();
		System.out.println("Insira o valor investido do 2° amigo");
		amigo2= in.nextDouble();
		System.out.println("Insira o valor investido do 3° amigo");
		amigo3= in.nextDouble();
		System.out.println("Insira o valor do premio");		
		valor_premio = in.nextDouble();
		soma = amigo1+amigo2+amigo3;
		if(soma==100) {
			amigo1 = valor_premio*(amigo1/100);
			System.out.println(amigo1);
			amigo2 = valor_premio*(amigo2/100);
			System.out.println(amigo2);
			amigo3 = valor_premio*(amigo3/100);
			System.out.println(amigo3);
		}else {
			System.out.println("Valor investido incorreto");
		}
		in.close();
	}

}
