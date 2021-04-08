package Seção7_Vetores_MatrizesP1;
import java.util.Scanner;
public class Teste1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int idade;
	      int anos;
	      int mes;
	      int dias;
	      idade = in.nextInt();
	         
	anos = idade/365; 
	mes = (idade/12)-(365*anos);
	dias = idade/1;
	System.out.println(anos);
	System.out.println(mes);
	System.out.println(dias);
	}

}
