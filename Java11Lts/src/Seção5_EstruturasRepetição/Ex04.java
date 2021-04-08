package Seção5_EstruturasRepetição;
//Escreva um rpogrma que declare um inteiro, inicialize-o com 0, e incremente-o de 1000 em 1000, imprimindo seu valor na tela, até que seu valor seja 100.000.
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =0;
		while (num<=100000) {
			System.out.println(num);
			num = num + 1000;
		}
	}

}
