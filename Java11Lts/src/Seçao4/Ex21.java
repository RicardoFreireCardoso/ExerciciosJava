package Seçao4;
import java.util.Scanner;
public class Ex21 {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	int escolha;
	double n1,n2, soma, div, mult, dif;
	System.out.println("Insira o 1º valor");
	n1 = in.nextDouble();
	System.out.println("Insira o 2º valor");
	n2 = in.nextDouble();
	System.out.println("Selecione o que deseja fazer");
	System.out.println("1 - Soma de 2 numeros");
	System.out.println("2 - diferença entre 2 numeros");
	System.out.println("3 - Produto entre dois numeros");
	System.out.println("4 - Divisão entre 2 numeros");
	escolha = in.nextInt();
	switch(escolha) {
	case 1: 
		soma = n1 +n2;
		System.out.println("A soma entre " +n1+ " e "+n2+ " é igual a "+soma);
		break;
	case 2:
		if(n1>=n2) {
			dif = n1 - n2;
			System.out.println("A diferença entre " +n1+ " e " +n2+ " = " +dif);
		}else  {
			dif = n2-n1;
			System.out.println("A diferença entre " +n2+ " e " +n1+ " = " +dif);
		}
		break;
	case 3:
		mult = n1 * n2;
		System.out.println("O produto entre " +n1+ " e " +n2+ " = " +mult);
		break;
	case 4:
		if( n2==0) {
			System.out.println("Não pode dividir por zero");
		} else {
			div = n1 / n2;
			System.out.println("A divisão entre " +n1+ " e " +n2+ " = " +div);
		}
		break;
	default: 
		System.out.println("ERRO, opção inválida");
	}
	in.close();
}
}
