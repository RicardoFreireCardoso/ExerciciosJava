package Seçao4;
import java.util.Scanner;
public class Ex32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner (System.in);
		int codigo, quant;
		double valor;
		System.out.println("Informe o código do pedido");
		codigo = in.nextInt();	
		System.out.println("Informe quantidade do pedido");
		quant = in.nextInt();
		
		if(codigo==100 && quant >0) {
			valor = quant * 1.20;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Hot dogs");
				System.out.println("Valor: "+valor);
			} else {
				System.out.println("VC pediu "+quant+ " Hot dog");
				System.out.println("Valor: "+valor);
			}
		} else if (codigo==101 && quant>0) {
			valor = quant * 1.30;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Baurus simples");
				System.out.println("Valor: "+valor);
			} else {	
				System.out.println("VC pediu "+quant+ " Bauru simples");
				System.out.println("Valor: "+valor);
			}
		} else if(codigo == 102 && quant>0) {
			valor = quant * 1.50;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Baurus com ovo");
				System.out.println("Valor: "+valor);
			}else {
				System.out.println("VC pediu "+quant+ " Bauru com ovo");
				System.out.println("Valor: "+valor);
			}
		} else if(codigo==103 && quant >0) {
			valor = quant * 1.20;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Hamburguers");
				System.out.println("Valor: "+valor);
			}else {
				System.out.println("VC pediu "+quant+ " Hamburguer");
				System.out.println("Valor: "+valor);
			}
		} else if (codigo==104 && quant >0) {
			valor = quant * 1.70;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Cheeseburguers");
				System.out.println("Valor: "+valor);
			}else {
				System.out.println("VC pediu "+quant+ " Cheeseburguer");
				System.out.println("Valor: "+valor);
			}
		} else if (codigo==105 && quant > 0) {
			valor = quant * 2.20;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Sucos");
				System.out.println("Valor: "+valor);
			}else {
				System.out.println("VC pediu "+quant+ " Suco");
				System.out.println("Valor: "+valor);
			}
		} else if (codigo==106 && quant > 0) {
			valor = quant * 1.0;
			if(quant > 1) {
				System.out.println("VC pediu "+quant+ " Refrigerantes");
				System.out.println("Valor: "+valor);
			}else {
				System.out.println("VC pediu "+quant+ " Refrigerante");
				System.out.println("Valor: "+valor);
			}
		} else {
			System.out.println("Código inválido ou quantidade inválida");
		}
		
		in.close();
		

	}

}
