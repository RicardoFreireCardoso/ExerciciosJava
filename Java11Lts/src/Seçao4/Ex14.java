package Seçao4;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double media_ponderada=0, nota_lab =0, ava_semestral=0, exame_final=0;
		System.out.println("Informe sua nota de laboratório: ");
		nota_lab = in.nextDouble();
		System.out.println("Informe sua nota na avaliação semestral");
		ava_semestral = in.nextDouble();
		System.out.println("Informe sua nota no Exame final:");
		exame_final = in.nextDouble();
		if (nota_lab > 10|| nota_lab < 0 ||ava_semestral > 10 || ava_semestral < 0 || exame_final > 10 || exame_final < 0) {
			System.out.println("Valor de nota invalida");
		} else {
			media_ponderada =((nota_lab*2) + (ava_semestral*3) + (exame_final*5)) / 10 ;
			if(0<= media_ponderada && media_ponderada <= 2.9 ) {
				System.out.println("sua média = " + media_ponderada);
				System.out.println("Reprovado");
			} else if (3<= media_ponderada && media_ponderada <= 4.9) {
				System.out.println("sua média = " + media_ponderada);
				System.out.println("Recuperação");
			} else {
				System.out.println("sua média = " + media_ponderada);
				System.out.println("Aprovado");
			}
		}
	in.close();	
	} 
	
	
}
