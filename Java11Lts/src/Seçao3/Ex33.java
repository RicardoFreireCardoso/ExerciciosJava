package Se�ao3;
import java.util.Scanner;
public class Ex33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float lado, area_quadrado;
		Scanner in = new Scanner (System.in);
		System.out.println("informe o tamanho do lado do quadrado");
		lado = in.nextFloat();
		
		area_quadrado = lado * lado;
		System.out.println("A �rea do quadrado � igual a:" +area_quadrado+ " metros");
		in.close();
		
	}

}
