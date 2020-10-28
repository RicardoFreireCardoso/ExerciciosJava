package Seçao3;
import java.util.Scanner;
public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float comprimento, largura, PreçoMetroTela, custo, perimetro;
		
		System.out.println("Informe o comprimento (metros) do terreno");
		comprimento = in.nextFloat();
		System.out.println("Informe a largura (metros) do terreno");
		largura = in.nextFloat();
		
		perimetro = (comprimento * 2) + (largura * 2 );
		System.out.println("O perimentro desse terreno é: " +perimetro);
		
		System.out.println("Informe o preço por metro de tela");
		PreçoMetroTela = in.nextFloat();

		custo = perimetro * PreçoMetroTela;
		System.out.println("O custo para cercar o terreno é de: R$ "+custo);
		in.close();
	}

}
