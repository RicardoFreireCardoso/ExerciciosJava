package Se�ao4;
import java.util.Scanner;
public class Ex22 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int idade, tempo_servi�o; 
		System.out.println("Digite sua idade em anos");
		idade = in.nextInt();
		
		System.out.println("Informe seu tempo de servi�o");
		tempo_servi�o = in.nextInt();
		
		if(idade>=65 || tempo_servi�o >= 30 || idade >= 60 && tempo_servi�o >=25) {
			System.out.println("Pode aposentar");
		} else {
			System.out.println("Vai trabalhar");
		}
		in.close();
	}
}
