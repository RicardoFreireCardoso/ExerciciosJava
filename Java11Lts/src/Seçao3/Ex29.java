package Seçao3;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float nota1, nota2, nota3, nota4, media;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Informe a 1° nota");
		nota1 = in.nextFloat();
		System.out.println("Informe a 2° nota");
		nota2 = in.nextFloat();
		System.out.println("Informe a 3° nota");
		nota3 = in.nextFloat();
		System.out.println("Informe a 4° nota");
		nota4 = in.nextFloat();
		
		media = (nota1+nota2+nota3+nota4) / 4;
		System.out.println("Media aritmetica = "+media);
		in.close();
	}

}
