package Seção7_Vetores_MatrizesP1;
import java.util.Scanner;
public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int[] prog = new int [5];
		int o=0;
		
		for (int i=0;i< prog.length; i++) {
			System.out.println("Digite o valor "+(i+1)+": ");
			prog[i] = in.nextInt();
			
		}
		for (int i : prog) {
			System.out.println("Posição a["+(o)+"] = " +i);
			o++;
		}
		in.close();
	}

}
