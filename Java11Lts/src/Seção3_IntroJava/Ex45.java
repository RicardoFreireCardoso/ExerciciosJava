package Se��o3_IntroJava;
import java.util.Scanner;
public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Digite uma String: ");
		  String palavra = in.nextLine();

		  palavra.toLowerCase(); // Esta instru��o n�o altera a palavra digitada.

		  System.out.println("\nPalavra digitada: " + palavra); // Ir� exibir a palavra exatamente como ela foi digitada.
		  System.out.println("Palavra alterada: " + palavra.toLowerCase()); // Ir� exibir a palavra com todas as letras min�sculas.
		  System.out.println("Palavra digitada: " + palavra); // Veja novamente que a palavra n�o � alterada.
		  in.close();
	}

}
