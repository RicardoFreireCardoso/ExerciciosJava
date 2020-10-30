package Seção3_IntroJava;
import java.util.Scanner;
public class Ex46 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner entrada = new Scanner(System.in);
	     
	     Integer valorUsuario=0;
	     
	     System.out.print("Entre com um valor de 3 casas (inteiro): ");
	     valorUsuario = entrada.nextInt();
	     if(100<=valorUsuario && valorUsuario<=999) {
	    	 StringBuilder palavraRevertida = new StringBuilder(valorUsuario.toString());
	            System.out.println(Integer.parseInt(palavraRevertida.reverse().toString()));
	     }else {
	    	 System.out.println("Valor inválido");
	     }
	     entrada.close();
	}

}
