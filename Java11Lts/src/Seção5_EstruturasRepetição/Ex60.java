package Seção5_EstruturasRepetição;

import java.util.Scanner;

public class Ex60 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int vezes;
		int contPar=0, somaPar=0;
		double soma=0, valores, media=0;
		double maior = Double.NEGATIVE_INFINITY;
		double menor = Double.MAX_VALUE;
		System.out.println("Insira quantas vezes deseja inserir valores: ");
		vezes = in.nextInt();
		if(vezes >0) {
		for (int i=0; i<vezes; i++) {
			System.out.println("Insira um valor");
			valores= in.nextDouble();
			soma = soma + valores;
			media = soma / vezes;
			if(valores > maior) {
				maior = valores;
			} 
			if (valores < menor) {
				menor = valores;
			}
			if (valores% 2 == 0) {
                contPar++;
                somaPar += valores;
			}
		}
		System.out.println("A soma dos números digitados: "+soma);
		System.out.println("A quantidade de números digitados: "+vezes+ " números");
		System.out.println("A média dos números informados é igual a "+media);
		System.out.println("Maior número é "+maior);
		System.out.println("Menor número é "+menor);
		System.out.println("A média dos números pares é: "+(float)somaPar/contPar);
		} else {
			System.out.println("Entrada de dados finalizada");
		}
		in.close();
	}

}
