package Seçao4;
import java.util.Scanner; 

public class Ex20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double l1,l2,l3;
 	Scanner in = new Scanner (System.in);
 	
 	System.out.println("Digite o 1° lado do triangulo");
 	l1 = in.nextDouble();
 	System.out.println("Digite o 2° lado do triangulo");
 	l2 = in.nextDouble();
 	System.out.println("Digite o 3° lado do triangulo");
 	l3 = in.nextDouble();
 	
 	if(l1==l2 && l1==l3) {
 		System.out.println("Triangulo equilatero");
 	} else if(l1==l2 || l1==l3 || l2==l3) {
 		System.out.println("Triangulo isoceles");
 	} else {
 		System.out.println("triangulo escaleno");
 	}
 	in.close();
 	
	}

}
