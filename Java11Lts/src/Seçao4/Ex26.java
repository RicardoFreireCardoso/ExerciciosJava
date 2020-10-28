package Seçao4;
import java.util.Scanner;
public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double km, consumo;
		System.out.println("Digite a distancia em km");
		km = in.nextDouble();
		System.out.println("Infome o consumo de combustivel nesse percurso de "+km+ " km");
		consumo = in.nextDouble();
		
		consumo = km / consumo;
		if(consumo < 8) {
			System.out.println("Consumiu: " +consumo+ " km/l");
			System.out.println("VENDA O CARRO!");
		} else if (8<= consumo && consumo<=12 ) {
			System.out.println("Consumiu: " +consumo+ " km/l");
			System.out.println("ECONOMICO");
		} else if (consumo > 12) {
			System.out.println("Consumiu: " +consumo+ " km/l");
			System.out.println("Super economico");
		}
		in.close();
	}

}
