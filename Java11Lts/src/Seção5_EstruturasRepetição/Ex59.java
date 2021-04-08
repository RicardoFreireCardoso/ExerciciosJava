package Seção5_EstruturasRepetição;

import java.util.Scanner;

//escreva um programa que leia o número de habitantes de um determinada cidade, o valor do KhW, e para cada habitante entre com os seguintes dados: consumo do mês e o codigo do consumidor (1- residencial , 2 - comercial, 3 - industrial). No final imprima o maior, o menor e a media do consumo dos habitantes. E por fim o total do consumo de cada categoria de consumidor.
public class Ex59 {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("Relatório de consumo");
		System.out.println("Informe o número de habitantes: ");
		int numHabitantes = in.nextInt();
		System.out.println("Informe o valor do KwH da cidade: ");
		@SuppressWarnings("unused")
		float valorKhW = in.nextFloat();
		double media = 0, totalConsumo = 0, totalCategoriaA =0,totalCategoriaB =0, totalCategoriaC =0;
		double consumoA =0, consumoB = 0, consumoC =0, consumoMAX = 0, consumoMIN =9999999;
		float consumo =0 ;
		if(numHabitantes <= 0) {
			System.out.println("Número inválido");
		} else {
			for(int i=1; i<=numHabitantes; i++) {
				System.out.println("Informe o consumo do mês (em KhW):");
				consumo = in.nextFloat();
				System.out.println("Informe o seu código de consumidor \n1 - Residencial \n2 - Comercial\n3 - Industrial");
				int code = in.nextInt();
					if(code==1) {
						totalConsumo = totalConsumo + consumo;
						totalCategoriaA = totalCategoriaA + 1;
						consumoA = consumoA + consumo;
						if(consumo > consumoMAX) {
							consumoMAX = consumo;
						}if(consumo<consumoMIN) {
							consumoMIN = consumo;
						}
					} else if (code == 2){
						totalConsumo = totalConsumo + consumo;
						totalCategoriaB = totalCategoriaB + 1;
						consumoB = consumoB + consumo;
						if(consumo > consumoMAX) {
							consumoMAX = consumo;
						}if(consumo<consumoMIN) {
							consumoMIN = consumo;
						}
					} else if(code == 3) {
						totalConsumo = totalConsumo + consumo;
						totalCategoriaC = totalCategoriaC + 1;
						consumoC = consumoC + consumo;
						if(consumo > consumoMAX) {
							consumoMAX = consumo;
						}
						if(consumo<consumoMIN) {
							consumoMIN = consumo;
						}
					}
			}
		}
		System.out.println("Maior valor: "+ consumoMAX);
        System.out.println("Menor valor: "+ consumoMIN);
		media = totalConsumo / numHabitantes;
		System.out.println("A média de consumo é " + media );
		System.out.println("Total de consumidores na categoria Residencial = "+totalCategoriaA);
		System.out.println("O total de energia consumida na categoria Residencial = "+ consumoA +"\n");
		System.out.println("Total de consumidores na categoria Comercial = "+totalCategoriaB);
		System.out.println("O total de energia consumida na categoria Comercial = "+ consumoB + "\n");
		System.out.println("Total de consumidores na categoria Industrial = "+totalCategoriaC);
		System.out.println("O total de energia consumida na categoria Industrial = "+ consumoC);
		in.close();
	}

}
