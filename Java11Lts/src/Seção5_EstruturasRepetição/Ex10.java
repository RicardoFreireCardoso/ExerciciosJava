package Se��o5_EstruturasRepeti��o;
//Fa�a um programa que calcule e mostre a soma dos 50 n�meros pares.
public class Ex10 {
	public static void main(String[] args) {
		int num = 100;
		int conta = 0;
		System.out.println("\nInciando...\n");
		for(int i =0; i< num; i++) {
			
			if(i % 2 != 0) {
				System.out.println(i);
				conta = conta + i;
			}
		}
		
		System.out.println("--------\n"+conta+" � a soma � dos 50 primeiros n�meros pares");
	}

}
