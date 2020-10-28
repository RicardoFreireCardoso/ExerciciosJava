package Seçao4;
import java.util.Scanner;
public class Ex40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double custo_fabrica, custo_consumidor;
		
		System.out.println("Insira o valor de fabrica: ");
		custo_fabrica = in.nextDouble();
		
		if (custo_fabrica < 12000) {
			custo_consumidor = custo_fabrica * 1.05;
			System.out.println("O  consumidor terá que pagar: " + custo_consumidor);
		} if(12000 <= custo_fabrica && custo_fabrica <= 25000 ) {
			custo_consumidor = custo_fabrica * 1.25;
			System.out.println("O  consumidor terá que pagar: " + custo_consumidor);
		}if (custo_fabrica > 25000) {
			custo_consumidor = custo_fabrica * 1.35;
			System.out.println("O consumidor terá que pagar: " + custo_consumidor);
		}else {
			in.close();
		}

	}

}
