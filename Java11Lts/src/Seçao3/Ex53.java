package Se�ao3;
import java.util.Scanner;
public class Ex53 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		float comprimento, largura, Pre�oMetroTela, custo, perimetro;
		
		System.out.println("Informe o comprimento (metros) do terreno");
		comprimento = in.nextFloat();
		System.out.println("Informe a largura (metros) do terreno");
		largura = in.nextFloat();
		
		perimetro = (comprimento * 2) + (largura * 2 );
		System.out.println("O perimentro desse terreno �: " +perimetro);
		
		System.out.println("Informe o pre�o por metro de tela");
		Pre�oMetroTela = in.nextFloat();

		custo = perimetro * Pre�oMetroTela;
		System.out.println("O custo para cercar o terreno � de: R$ "+custo);
		in.close();
	}

}
