package Se�ao4;
import java.util.Scanner;
public class Ex09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario, presta��o;
		Scanner in = new Scanner (System.in);
		
		System.out.println("Insira a valor de seu sal�rio");
		salario = in.nextDouble();
		System.out.println("Insira o valor da presta��o");
		presta��o = in.nextDouble();
		
		if(presta��o > salario*0.2) {
			System.out.println("Empr�stimo n�o concedido");
		}else {
			System.out.println("Empr�stimo concedido");
		}
		in.close();
	}

}
