package Se�ao4;
import java.util.Scanner;
public class Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double  num1;
		System.out.println("Insira um valor para obter sua raiz quadrada e seu valor ao quadrado");
		num1 = in.nextDouble();
		
		if(num1 >= 1 ) {
			System.out.println( "A raiz de " +num1+ " � = " + Math.sqrt(num1));
			System.out.println( "Esse valor ao quadrado � = " + Math.pow(num1 , 2));
		} else {
			System.out.println("N�mero inv�lido, digite um valor positivo");
		}
		in.close();
	}

}
