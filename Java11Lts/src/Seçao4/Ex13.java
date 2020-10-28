package Seçao4;
import java.util.Scanner;
public class Ex13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double p1,p2,p3,p4, media_ponderada;
		
		System.out.println("Calculo usando média ponderada");
		System.out.println("Informe a nota da 1° prova");
		p1 = in.nextDouble();
		
		System.out.println("Informe a nota da 2° prova");
		p2 = in.nextDouble();
		
		System.out.println("Informe a nota da 3° prova");
		p3 = in.nextDouble();
		
		System.out.println("Informe a nota da 4° prova");
		p4 = in.nextDouble();
		
		media_ponderada = (p1*1) + (p2*2) + (p3*3) + (p4*4);
		media_ponderada = media_ponderada /10;
		System.out.println("Sua média é igual a: " +media_ponderada);
		
		if(media_ponderada > 6) {
			System.out.println("Vc foi aprovado");
		} else {
			System.out.println("Vc foi reprovado");
		}
		in.close();
	}

}
