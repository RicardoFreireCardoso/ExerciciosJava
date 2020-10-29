package Seção3_IntroJava;
//leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro
import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num1, sucessor, antecessor,soma;
		System.out.println("Informe um valor inteiro");
		num1 = in.nextInt();
		
		antecessor = num1 -1;
		sucessor = num1 +1;
		soma = (sucessor*3) + (antecessor *2);
		System.out.println(soma);
		in.close();
	}

}
