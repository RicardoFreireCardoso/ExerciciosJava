package Se�ao5;
import java.util.Scanner;
public class Ex47 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double adi��o, sub, mult, div, op, num,num1;
		do {
			System.out.println("Informe o que deseja fazer, digite");
			System.out.println("1 - Adi��o");
			System.out.println("2 - subtra��o");
			System.out.println("3 - Multiplica��o");
			System.out.println("4 - Divis�o");
			System.out.println("5 - Sair (encerrar programa)");
			op= in.nextDouble();
			if(op==1) {
				System.out.println("Informe o 1� valor");
				num = in.nextDouble();
				System.out.println("Informe o 2� valor");
				num1 = in.nextDouble();
				adi��o = num1+ num;
				System.out.println("A soma: " +num+ " + " + num1+ " = " + adi��o );	
				System.out.println("*************************************************************");
				System.out.println("*************************************************************");
			} else if (op==2) {
				System.out.println("Informe o 1� valor");
				num = in.nextDouble();
				System.out.println("Informe o 2� valor");
				num1 = in.nextDouble();
				if(num>=num1) {
					sub = num - num1;
					System.out.println("A diferen�a entre " +num+ " e " +num1+ " = " +sub);
					System.out.println("*************************************************************");
					System.out.println("*************************************************************");
				}else  {
					sub = num1-num;
					System.out.println("A diferen�a entre " +num1+ " e " +num+ " = " +sub);
					System.out.println("*************************************************************");
					System.out.println("*************************************************************");
				}
			} else if(op==3) {
				System.out.println("Informe o 1� valor");
				num = in.nextDouble();
				System.out.println("Informe o 2� valor");
				num1 = in.nextDouble();
				mult = num*num1;
				System.out.println("A multiplica��o entre "+ num + " * " +num1+ " = " +mult);
				System.out.println("*************************************************************");
				System.out.println("*************************************************************");
			} else if(op==4) {
				System.out.println("Informe o 1� valor");
				num = in.nextDouble();
				System.out.println("Informe o 2� valor");
				num1 = in.nextDouble();
				if( num1==0) {
					System.out.println("N�o pode dividir por zero");
					System.out.println("*************************************************************");
					System.out.println("*************************************************************");
				} else {
					div = num / num1;
					System.out.println("A divis�o entre " +num+ " e " +num1+ " = " +div);
					System.out.println("*************************************************************");
					System.out.println("*************************************************************");
				}
			}else if(op!=1 && op!=2 && op!=3 && op!=4 && op!=5) {
				System.out.println("Op��o inv�lida");
				System.out.println("*************************************************************");
				System.out.println("*************************************************************");
			}else {
				System.out.println("Voc� encerrou o programa! :(");
			}
			}while(op!=5) ;
		in.close();	
	}
}
