package Se�ao4;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner in = new Scanner (System.in);
	int num =0;
	System.out.println("Digite um valor inteiro");
	num = in.nextInt();
	
	if(num % 2 ==0) {
		System.out.println("� par!");
	} else {
		System.out.println("� impar");
	}
	
	in.close();	
	}

}
