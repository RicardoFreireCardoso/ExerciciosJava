package Seçao4;
import java.util.Scanner;
public class Ex34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float nota, falta;
		System.out.println("Informe sua nota: ");
		nota = in.nextFloat();
		System.out.println("Informe o número de faltas");
		falta = in.nextFloat();
		if(9<=nota && nota<=10 && falta<=20) {
			System.out.println("Conceito A");
		} else if (9<=nota && nota<=10 && falta>20) {
			System.out.println("Conceito B");
		} else if (7.5<=nota && nota<=8.9 && falta<=20) {
			System.out.println("Conceito B");
		} else if (7.5<=nota && nota<=8.9 && falta>20) {
			System.out.println("Conceito C");
		} else if (5<=nota && nota<=7.4 && falta<=20) {
			System.out.println("Conceito C");
		} else if (5<=nota && nota<=7.4 && falta>20) {
			System.out.println("Conceito D");
		}	else if (4<=nota && nota<=4.9 && falta<=20) {
			System.out.println("Conceito D");
		}	else if (4<=nota && nota<=4.9 && falta>20) {
			System.out.println("Conceito E");
		}	else if(0<=nota && nota <=3.9 && falta <=20) {
			System.out.println("Conceito E");
		} 	else if (0<=nota && nota <=3.9 && falta >20) {
			System.out.println("Conceito E");
		} else {
			System.out.println("Nota inválida");
		}
		in.close();
	} 

}
