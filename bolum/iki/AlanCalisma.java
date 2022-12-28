package bolum.iki;

import java.util.Scanner;

public class AlanCalisma {
	
	public static void main(String[] args) {
		
		Scanner girdi = new Scanner(System.in);
	
		double alan;
		double yaricap;
		
		System.out.println("Lütfen alanını hesaplamak istediğinşz cemberin yaricapini girin.");

		yaricap = girdi.nextInt();
		alan = yaricap * yaricap * 3.14159;
		
		
		System.out.println("yaricapi " + yaricap + " olan cemberin alani " + alan + " dir ");
		
		
	}

}


