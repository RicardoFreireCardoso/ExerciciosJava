package Se��o5_EstruturasRepeti��o;
import java.util.Scanner;
/*Fa�a um algoritmo que converta uma velocidade expressa em km/h para m/s e vice versa. Voc� deve criar um menu com as duas op��es de convers�o desejar, sendo que o programa s� ser� finalizado quando a op��o de finalizar for escolhida.*/
public class Ex45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double op, km, ms;
		do {
			System.out.println("1 - km/h -> m/s");
			System.out.println("2 - m/s -> km/h");
			System.out.println("3 - Encerrar");
			op = in.nextDouble();
			if(op==1) {
				System.out.println("Informe um valor em KM/H");
				km = in.nextDouble();
				ms = km / 3.6;
				System.out.println(ms + " m/s");
			} else if(op==2) {
				System.out.println("Informe um valor em M/S");
				ms= in.nextDouble();
				km = ms * 3.6;
				System.out.println(km + " KM/H");
			} else if(op==3) {
				System.out.println("Programa finalizado");
			}else {
				System.out.println("Op��o inv�lida");
			}
			
		}while(op!=3);
		in.close();
		}

}
