package Se��o5_EstruturasRepeti��o;
//Fa�a um programa que leia um n�mero inteiro positivo �mpar N e imprima todos os n�meros impares de 1 at� N em ordem decrescente.
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int numImpar;
		System.out.println("Informe um n�mero �mpar: ");
		numImpar = in.nextInt();
		System.out.println("Em ordem decrescente...");
		if(numImpar % 2 == 1) {
			for(int i = numImpar; i >= 0; i--) {
				if(i%2 == 1) {
					System.out.println(i);
				}
			}
		}else if (numImpar < 0 || numImpar % 2== 0){
			System.out.println("O n�mero n�o � �mpar ou n�o � positivo!");
		}
		in.close();

	}

}
