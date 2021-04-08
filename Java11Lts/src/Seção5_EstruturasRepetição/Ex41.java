package Se��o5_EstruturasRepeti��o;
//Fa�a um programa que calcula a associa��o em paralelo de dois resistores R1 e R2 fornecidos pelo usu�rio via teclado. O programa fica pedindo estes valores e calculando at� que o usu�rio entre com um valor para resistencia igual a zero. R = (R1 * R2) / (R1 + R2)
import java.util.Scanner;
public class Ex41 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		double resistencia, r1, r2;
		do {
			System.out.println("Informe a primeira resistencia:");
			r1 = in.nextDouble();
			System.out.println("Informe a segunda resistencia:");
			r2 = in.nextDouble();
			if(r1 <=0 || r2 <= 0) {
				System.out.println("�rea inv�lida :(");
			} else {
				resistencia = ((r1 * r2) / (r1 + r2));
				System.out.println("Resistencia = "+resistencia+ " Ohms");
			}
			
		}while(r1 >0 || r2 >0);
		in.close();
	}

}
