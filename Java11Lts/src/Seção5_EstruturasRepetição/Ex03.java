package Seção5_EstruturasRepetição;
//Faça um algoritmo utilizando o comando while que mostra uma contagem regressiva na tela, iniciando em 10 e terminado em 0. Mostrar uma mensagem "FIM!" após a contagem!
public class Ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=10;
		while(num<=10 && num>=0) {
			System.out.println(num);
			num--;
		}
		System.out.println("FIM!");
	}

}
