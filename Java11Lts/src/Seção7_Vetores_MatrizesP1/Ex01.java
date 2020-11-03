package Seção7_Vetores_MatrizesP1;

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a [] = {1, 0, 5, -2, -5, 7}, o=0;
		
		int soma = a[0]+a[1]+a[5];
		System.out.println("A soma das posições [0], [1] e [5] é "+soma);
		a[4] = 100;
		for (int i : a) {
			System.out.println("Posição a["+o+"] = " +i);
			o++;
		}
	}

}
