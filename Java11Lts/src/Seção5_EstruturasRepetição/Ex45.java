package Seção5_EstruturasRepetição;
import java.util.Scanner;
public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double op, km, ms;
		do {
			System.out.println("1 - km/h -> m/s");
			System.out.println("2 - m/s -> km/h");
			System.out.println("3 - Encerrar");
			op = in.nextDouble();
			if(op==1) {
				System.out.println("Informe um valor em KM/H");
				km = in.nextDouble();
				ms = km / 3.6;
				System.out.println(ms + " m/s");
			} else if(op==2) {
				System.out.println("Informe um valor em M/S");
				ms= in.nextDouble();
				km = ms * 3.6;
				System.out.println(km + " KM/H");
			} else if(op==3) {
				System.out.println("Programa finalizado");
			}else {
				System.out.println("Opção inválida");
			}
			
		}while(op!=3);
		in.close();
		}

}
