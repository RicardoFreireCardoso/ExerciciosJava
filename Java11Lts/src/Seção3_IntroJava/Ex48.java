package Seção3_IntroJava;
import java.util.Scanner;
public class Ex48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner (System.in);;
		int segundos;
		System.out.println("Informe o valor em segundos");
		segundos = in.nextInt();
		int segundo = segundos % 60;
		int minutos = segundos / 60;
		int minuto = minutos % 60;
		int hora = minutos / 60;
		String hms = String.format ("%02dh :%02dm :%02ds", hora, minuto, segundo); 
		System.out.println (hms);
		in.close();
	}
}
