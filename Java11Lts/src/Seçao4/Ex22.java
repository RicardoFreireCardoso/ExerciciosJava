package Seçao4;
import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idade, tempo_serviço; 
		System.out.println("Digite sua idade em anos");
		idade = in.nextInt();
		
		System.out.println("Informe seu tempo de serviço");
		tempo_serviço = in.nextInt();
		
		if(idade>=65 || tempo_serviço >= 30 || idade >= 60 && tempo_serviço >=25) {
			System.out.println("Pode aposentar");
		} else {
			System.out.println("Vai trabalhar");
		}
		in.close();
	}
}
