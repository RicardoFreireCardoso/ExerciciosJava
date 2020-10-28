package Seçao4;
import java.util.Scanner;
public class Ex19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int a;
		System.out.println("Insira um valor");
		a = in.nextInt();
		if (((a % 3) ==0) && ((a % 5)  ==0)) {
            System.out.println("O número " + a + " é Divisivel por 3 e 5");
        } else {
            if ((a % 3) == 0) {
                System.out.println("O número " + a + " é Divisivel por 3");
            } else {
                if ((a % 5) == 0) {
                    System.out.println("O número " + a + " é Divisivel por 5");
                } else {
                	System.out.println("Não é divisivel nem por 3 ou 5");
                }
            }
            in.close();
        
        }
    }

}
