package Seçao4;
import java.util.Scanner;
public class Ex27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int idade;
		System.out.println("Para descobrir a sua categoria informe sua idade");
		idade = in.nextInt();
		
		if(idade <5) {
			System.out.println("Muito novo para nadar");
		} else if (5<= idade && idade <=7) {
			System.out.println("Infantil A");
		} else if (8<= idade && idade <=10) {
			System.out.println("Infantil B");
		} else if (11<= idade && idade <=13) {
			System.out.println("Juvenil A");
		} else if (14<= idade && idade <=17) {
			System.out.println("Juvenil B");
		}else if (idade >=18) {
			System.out.println("Senior");
		} else {
			System.out.println("Numero invalido");
		}
		in.close();
	}

}
