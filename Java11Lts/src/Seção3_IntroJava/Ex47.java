package Seção3_IntroJava;

import java.util.Scanner;

public class Ex47 {
	
public static void main(String[] args) {
 Scanner entrada = new Scanner(System.in);
     
     int valorUsuario,quarto, terceiro,segundo,primeiro;
     
     System.out.print("Entre com um valor de 4 casas (inteiro): ");
     valorUsuario = entrada.nextInt();
     if(1000<=valorUsuario && valorUsuario<=9999) {
    	 quarto = valorUsuario % 10;
         valorUsuario /= 10;
         terceiro = valorUsuario % 10;
         valorUsuario /= 10;
         segundo = valorUsuario % 10;
         valorUsuario /= 10;
         primeiro = valorUsuario % 10;
         System.out.println(primeiro+" Primeiro \n"+segundo+" Segundo \n"+terceiro+" Terceiro \n"+quarto+" Quarto");
     }else {
    	 System.out.println("Valor inválido");
     }
     entrada.close();
    
}
}
