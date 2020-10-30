package Seção3_IntroJava;
import java.util.Scanner;
public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		System.out.print("Digite uma String: ");
		  String palavra = in.nextLine();

		  palavra.toLowerCase(); // Esta instrução não altera a palavra digitada.

		  System.out.println("\nPalavra digitada: " + palavra); // Irá exibir a palavra exatamente como ela foi digitada.
		  System.out.println("Palavra alterada: " + palavra.toLowerCase()); // Irá exibir a palavra com todas as letras minúsculas.
		  System.out.println("Palavra digitada: " + palavra); // Veja novamente que a palavra não é alterada.
		  in.close();
	}

}
