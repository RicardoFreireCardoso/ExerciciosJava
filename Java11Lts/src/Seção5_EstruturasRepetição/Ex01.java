package Se��o5_EstruturasRepeti��o;
import java.util.Scanner;
//Fa�a um programa que determine e mostre os cincos primeiros multiplos de 3, considerando n�meros maiores que 0.

public class Ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int num, multi =1;
		for(int i= 0; i<5; i++) {
			num = 3 * multi;
			System.out.println(num);
			multi++;
		}
		in.close();
	}

}
