package Se�ao4;
import java.util.Scanner;
public class Ex25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		double x1 , x2, x, a, b, c, delta;
		System.out.println("Equa��o do 2� grau");
		System.out.println("Insira um valor para A");
		a = in.nextDouble();
		System.out.println("Insira um valor para B");
		b = in.nextDouble();
		System.out.println("Insira um valor para C");
		c = in.nextDouble();
		if(a==0) {
			System.out.println("N�o � equa��o do 2� grau");
		}else if (a!=0) {
			delta =  (b*b) - 4 * a * c;
			if(delta < 0) {
				System.out.println("N�o existe raiz");
				System.out.println("DELTA = " +delta);
			} else if(delta == 0) {
				x = -b + Math.sqrt(delta) / 2 * a;
				System.out.println(x);
			} else if (delta > 0) {
				x1 =  -b + Math.sqrt(delta) / 2 * a;
				x2 =  -b - Math.sqrt(delta) / 2 * a;
				System.out.println("x1 = " +x1);
				System.out.println("x2 = " +x2);
			}
		}
		in.close();
	}

}
