package Seçao5;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int valor, i=1; 
		double soma=0;
		while(i<=10) {
			System.out.println("Informe o "+i+ "° valor");
			valor = in.nextInt();
			soma = soma+valor;
			i++;
		}
		System.out.println("A soma dos valores digitados: " +soma);
		in.close();
	}

}
