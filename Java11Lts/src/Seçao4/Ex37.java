package Seçao4;
import java.util.Scanner;
public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		float partida_hora, partida_min, chegada_hora, chegada_min, valor1, valor2;
		System.out.println("TABELA DE PREÇOS DO ESTACIONAMENTO \n * Primeira e Segunda hora: R$ 1,00 cada \n * Terceira e Quarta hora: R$ 1,40 cada \n * Quinta e seguintes: 2,00 cada");
		System.out.println("Informe a hora de chegada");
		chegada_hora = in.nextInt();
		System.out.println("Informe os minutos de chegada:");
		chegada_min = in.nextInt();
		System.out.println("Informe a hora de partida");
		partida_hora = in.nextInt();
		System.out.println("Informe os minutos de partida");
		partida_min = in.nextInt();
		
		valor1 = chegada_hora * 60 + chegada_min;
		valor2 = partida_hora * 60 + partida_min;
		System.out.println(valor1);
		System.out.println(valor2);
		valor2 = valor2-valor1;
		if(valor2 <=120) {
			valor2 = ((valor2/60) * 1);
			System.out.println(valor2);
		} else if(valor2<=240) {
			valor2 = (float) (((valor2/60) * 1.40));
			System.out.println(valor2);
		}else { 
			valor2 = ((valor2/60) * 2);
			System.out.println(valor2);
		}
		System.out.println(valor2);
		
	}

}
