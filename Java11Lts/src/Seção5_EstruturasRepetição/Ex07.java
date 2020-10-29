package Seção5_EstruturasRepetição;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int valor, i=1; 
		double media=0, soma=0;
		while(i<=10) {
			System.out.println("Informe o "+i+ "° valor");
			valor = in.nextInt();
			if(valor>0) {
				soma = soma+valor;
				i++;
			}else {
				soma = soma+0;
				i++;
			}
			
		}
		media = soma/10;
		System.out.println("A media dos valores digitados: " +media);
		in.close();
	}

}
