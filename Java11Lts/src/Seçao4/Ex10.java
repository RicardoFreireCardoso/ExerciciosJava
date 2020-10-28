package Seçao4;

import java.util.Scanner;

public class Ex10 {
 public static void main(String[] args) {
	 Scanner in = new Scanner (System.in);
	String sexo;
	double altura = 0, peso;
	System.out.println("Qual o genero da pessoa");
	sexo = in.next();
	System.out.println("Qual sua altura em cm??");
	altura = in.nextDouble();
	
	switch (sexo) {
	case ("h") :
		peso = (72.7 * altura ) - 58;
	System.out.println("Peso ideal " +peso+ " kg");
	break;
	case ("m") : 
		peso = (62.1 * altura ) - 44.7;
	System.out.println("Peso ideal " +peso+ " kg");
	break;
	default: 
		System.out.println("Resposta Inválida");
	}
	in.close();
}
}
