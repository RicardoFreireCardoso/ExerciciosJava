package Seçao4;
import java.util.Scanner;
public class Ex15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int dia;
	 System.out.println("Olaa");
	 System.out.println("Digite um valor de 1 a 7 para saber o dia que corresponde na semana");
	 dia = in.nextInt();
	 
	 switch (dia) {
	 
	 case 1:
		 System.out.println("Domingo");
		 break;
	 case 2: 
		 System.out.println("Segunda-feira");
		 break;
	 case 3:
		 System.out.println("Terça-feira");
		 break;
	 case 4:
		 System.out.println("Quarta-feira");
		 break;
	 case 5: 
		 System.out.println("Quinta-feira");
		 break;
	 case 6: 
		 System.out.println("Sexta-feira");
		 break;
	 case 7:
		 System.out.println("Sabado");
		 break;
	 default :
		 System.out.println("Número digitado inválido");
			 
	 }
	 in.close();
	
	}

}
