package Seção5_EstruturasRepetição;
import java.util.Scanner;
//Faça um programa que determine e mostre os cincos primeiros multiplos de 3, considerando números maiores que 0.

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num, multi =1;
		for(int i= 0; i<5; i++) {
			num = 3 * multi;
			System.out.println(num);
			multi++;
		}
		in.close();
	}

}
