package Se�ao3;

import java.util.Scanner;

public class Ex44 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double altura_degrau, altura_desejada, obj;
		
		System.out.println("Informe qual a altura do degrau");
		altura_degrau = in.nextDouble();
		
		System.out.println("qual altura vc deseja alcan�ar subindo a escada??");
		altura_desejada = in.nextDouble();
		
		obj = altura_desejada / altura_degrau;
		System.out.println("Esse � o numero de degraus que vc precisa subir para atingir o objetivo: "+obj);
		in.close();
	}

}
