package Seçao4;
import java.util.Scanner;
public class Ex28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double num1, num2, num3, nota;
		int escolha;
		System.out.println("Informe a 1° nota: ");
		num1 = in.nextDouble();
		System.out.println("Informe a 2° nota: ");
		num2 = in.nextDouble();
		System.out.println("Informe a 3° nota: ");
		num3 = in.nextDouble();
		
		System.out.println("Agora informe qual tipo de media vc deseja fazer:");
		System.out.println("1 - Geometrica");
		System.out.println("2 - Ponderada");
		System.out.println("3 - Harmonica");
		System.out.println("4 - Aritmetica");
		escolha = in.nextInt();
		switch(escolha) {
		case 1 :
			System.out.println(Math.cbrt(num1*num2*num3));
			if(Math.cbrt(num1*num2*num3)>=5) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			break;
		case 2:
			nota = (num1*1 + num2 * 2 + num3 * 3) /6;
			System.out.println(nota);
			if(nota >= 5) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			break;
		case 3:
			nota = 1 / (1/num1 + 1/num2 + 1/num3);
			System.out.println(nota);
			if(nota >= 5) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			break;
		case 4 :
			nota = num1+num2+num3 / 3;
			System.out.println(nota);
			if(nota >= 5) {
				System.out.println("APROVADO");
			} else {
				System.out.println("REPROVADO");
			}
			break;
		}
		in.close();
		
	}

}
