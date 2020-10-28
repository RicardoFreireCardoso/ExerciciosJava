package Seçao5;

public class Ex36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long num=1,num2=1, soma_quad, quadrado_soma=0,i=0,r=0, soma_quad2=0, resultado;
		while(i<100) {
			soma_quad = (long) Math.pow(num, 2);
			//System.out.println(soma_quad);
			num++;
			i++;
			soma_quad2 = soma_quad2+ soma_quad;
		}
		System.out.println(soma_quad2 + " soma dos quadrados");
		while(r<100) {
			quadrado_soma = quadrado_soma + num2;
			num2++;
			r++;
		}
		System.out.println((long) Math.pow(quadrado_soma, 2) + " o quadrado das somas");
		System.out.println("A diferença entre a soma dos quadraods dos 100 primeiros números naturais e o quadrado da soma é :");
		resultado = (long) Math.pow(quadrado_soma, 2) - soma_quad2;
		System.out.println(+(long) Math.pow(quadrado_soma, 2)+ " - " +soma_quad2+ " = " +resultado);	
	}
}
