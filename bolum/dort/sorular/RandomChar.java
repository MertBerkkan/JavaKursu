package bolum.dort.sorular;

import java.util.Random;

public class RandomChar {

	public static void main(String[] args) {

		Random a = new Random();
		int harfsayisi = a.nextInt(26) + 65;
		char harf = (char)harfsayisi;
		System.out.println(harf);
		

		
	}

}
