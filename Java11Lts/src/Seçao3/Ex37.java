package Seçao3;
import java.util.Scanner;
public class Ex37 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double valor, desconto= 0.88;
		System.out.println("Digite um valor para obter ele com desconto");
		valor = in.nextDouble();
		valor = valor * desconto ;
		System.out.println(valor);
		in.close();
	}

}
