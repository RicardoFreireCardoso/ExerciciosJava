package Seçao4;
import java.util.Random;
import java.util.Scanner;
public class Ex29 {
public static void main(String[] args) {
	int sum, question=1, hits=0, error=0, num1, num2;
	Scanner in = new Scanner(System.in);
	Random random = new Random();
	do {
		num1 = random. nextInt(100)+1;
		num2 = random. nextInt(100)+1;
		System.out.println("Questão "+question+": "+num1+" + "+num2+" = ");
		sum = in.nextInt();
		if(sum == num1+num2) {
			System.out.println("Certa resposta!");
			hits= hits+1;
		}else {
			System.out.println("Resposta Incorreta!");
			System.out.println("A resposta correta era: "+(num1+num2));
			error=error+1;
		}
		question++;
	}while(question<=5);
	System.out.println("Você conseguiu "+hits+ " acertos");
	System.out.println("Seu número de erros é "+error);
	in.close();
}
}
