package Seçao4;
import java.util.Scanner;
public class Ex39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		double salario_atual, reajuste1 = 1.25, reajuste2 = 1.20, reajuste3 = 1.15, reajuste4 = 1.10, semReajuste = 1, tempo;
		
		System.out.println("Informe seu salario atual: ");
		salario_atual = in.nextDouble();
		
		System.out.println("Informe seu tempo de serviço (em anos)");
		tempo = in.nextDouble();
		
		if (salario_atual <= 500 && tempo <1) {
			salario_atual = (salario_atual * reajuste1) + 0;
			System.out.println("Vc não tem direito ao bonus ainda.");
			System.out.println("Seu salário reajustado é de R$ " +salario_atual);
		}else if(501<= salario_atual && salario_atual <= 1000 && 1<= tempo && tempo <= 3 ) {
			salario_atual = salario_atual * reajuste2 +100;
			System.out.println("Seu salário reajustado é de R$ " +salario_atual);
		}else if (1001 <= salario_atual && salario_atual <= 1500 && 4<= tempo && tempo <= 6) {
			salario_atual = salario_atual * reajuste3 +200;
			System.out.println("Seu salário reajustado é de R$ " +salario_atual);
		}else if(1501 <= salario_atual && salario_atual <= 2000 && 7 <= tempo && tempo <= 10) {
			salario_atual = salario_atual * reajuste4 +300;
			System.out.println("Seu salário reajustado é de R$ " +salario_atual);
		}else if (salario_atual > 2000 && tempo > 10 ) {
			salario_atual = salario_atual * semReajuste +500;
			System.out.println("Seu salário reajustado é de R$ " +salario_atual);
		}else {
			System.out.println("Erro na concordancia de salario por tempo de serviço");
		}
		in.close();
	}

}
