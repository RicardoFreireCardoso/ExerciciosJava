package Seçao4;
import java.util.Scanner;
public class Ex35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		int day=0, mounth=0, year, year1=0;
		System.out.println("Informe o dia");
		day = in.nextInt();
		
		System.out.println("Informe o mês");
		mounth = in.nextInt();
		
		System.out.println("Informe o ano");
		year = in.nextInt();
		
		year1 = year % 4;
		if(year1 == 0) {
			year = year % 100;
			if(year ==0) {
				
				if( 1<= mounth && mounth <=12 ) {
					if(mounth==2 && 1<= day && day <=28) {
						System.out.println("Data valida");
					} else {
						System.out.println("Data Inválida");
					}
				}else {}
			} else {
			
				if(1<= mounth && mounth <=12) {
					
					if(mounth==2 && 1<= day && day <=29) {
						System.out.println("Data valida");
					} else {
						System.out.println("Data Inválida");
					}
				}else {}
			}
		} else if(year1 != 0) {
			if(1<= mounth && mounth <=12) {
			
				if(mounth==2 && 1<= day && day <=28) {
					System.out.println("Data valida");
				} else {
					System.out.println("Data Inválida");
				}
			}else {}
			in.close();
		}
	}

}
