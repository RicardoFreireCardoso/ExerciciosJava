package Se�ao4;
import java.util.Scanner;
public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double venda, comiss�o;
		
		System.out.println("Informe o valor da venda");
		venda = in.nextDouble();
		
		if (venda >= 100000) {
			comiss�o = (venda * 0.16) + 700;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		}  else if (venda < 100000 && venda >= 80000) {
			comiss�o = (venda * 0.14) + 650;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		} else if (venda < 80000 && venda >= 60000) {
			comiss�o = (venda * 0.14) + 600;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		}else if (venda < 60000 && venda >= 40000) {
			comiss�o = (venda * 0.14) + 550;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		} else if (venda < 40000 && venda >= 20000) {
			comiss�o = (venda * 0.14) + 500;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		} else if (venda < 20000) {
			comiss�o = (venda * 0.14) + 400;
			System.out.println("Sua comiss�o nessa venda � de R$ "+comiss�o);
		}
		in.close();
	}

}
