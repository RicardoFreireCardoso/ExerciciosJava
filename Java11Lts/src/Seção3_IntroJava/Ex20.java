package Seção3_IntroJava;

import java.util.Scanner;

public class Ex20 {
 public static void main(String[] args) {
	Scanner in = new Scanner (System.in);
	double kg, libras;
	
	System.out.println("Digite um valor KG para converter em libras");
	kg = in.nextDouble();
	
	libras = kg / 0.45;
	System.out.println(libras + " libras");
	in.close();
	
}
}
