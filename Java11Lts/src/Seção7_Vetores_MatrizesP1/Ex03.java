package Seção7_Vetores_MatrizesP1;
//Ler um conjunto de numeros reais, armazenando-o em vetor e calcular o quadrado dos componentes deste vetor, armazenando o resultado em outro vetor. Os conjuntos tem 10 elementos cada. Imprimir todos os conjuntos. 
import java.util.Scanner;
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in  = new Scanner (System.in);
		double [] vet1 = new double [10];
		double [] vetResultado = new double [10];
		double o = 0;
		
		
		for (double i=0;i< vet1.length; i++) {
			System.out.println("Digite o valor "+(i+1)+": ");
			vet1[(int) i] = in.nextDouble();
			
		}
		vetResultado[0] = vet1[0] * vet1[0];
		vetResultado[1] = vet1[1] * vet1[1];
		vetResultado[2] = vet1[2] * vet1[2];
		vetResultado[3] = vet1[3] * vet1[3];
		vetResultado[4] = vet1[4] * vet1[4];
		vetResultado[5] = vet1[5] * vet1[5];
		vetResultado[6] = vet1[6] * vet1[6];
		vetResultado[7] = vet1[7] * vet1[7];
		vetResultado[8] = vet1[8] * vet1[8];
		vetResultado[9] = vet1[9] * vet1[9];
		
		for(double i : vetResultado) {
			System.out.println("Posição Vetor Resultado["+(o)+"] = " +i);
			o++;
		}
		in.close();
		}
		
	}


