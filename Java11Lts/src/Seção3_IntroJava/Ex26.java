package Se��o3_IntroJava;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double  acres;
		float metros;
		System.out.println("Informe a �rea em metros: ");
		metros = in.nextFloat();
	acres =  metros * 0.0001;
	System.out.println("�rea em acres: "+acres);
	in.close();
	}

}
