package Se�ao4;
import java.util.Scanner;
public class Ex21 {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int escolha;
	double n1,n2, soma, div, mult, dif;
	System.out.println("Insira o 1� valor");
	n1 = in.nextDouble();
	System.out.println("Insira o 2� valor");
	n2 = in.nextDouble();
	System.out.println("Selecione o que deseja fazer");
	System.out.println("1 - Soma de 2 numeros");
	System.out.println("2 - diferen�a entre 2 numeros");
	System.out.println("3 - Produto entre dois numeros");
	System.out.println("4 - Divis�o entre 2 numeros");
	escolha = in.nextInt();
	switch(escolha) {
	case 1: 
		soma = n1 +n2;
		System.out.println("A soma entre " +n1+ " e "+n2+ " � igual a "+soma);
		break;
	case 2:
		if(n1>=n2) {
			dif = n1 - n2;
			System.out.println("A diferen�a entre " +n1+ " e " +n2+ " = " +dif);
		}else  {
			dif = n2-n1;
			System.out.println("A diferen�a entre " +n2+ " e " +n1+ " = " +dif);
		}
		break;
	case 3:
		mult = n1 * n2;
		System.out.println("O produto entre " +n1+ " e " +n2+ " = " +mult);
		break;
	case 4:
		if( n2==0) {
			System.out.println("N�o pode dividir por zero");
		} else {
			div = n1 / n2;
			System.out.println("A divis�o entre " +n1+ " e " +n2+ " = " +div);
		}
		break;
	default: 
		System.out.println("ERRO, op��o inv�lida");
	}
	in.close();
}
}
