package bolum.bes.sorular;

import java.util.Random;

public class S40 {
    public static void main(String[] args) {
        Random a = new Random();
        String yaziTuraString;
        int sayacYazi = 0;
        int sayacTura = 0;

        for (int sayac = 1; sayac <= 1000000; sayac++) {

            int yaziTura = a.nextInt(2);

            if (yaziTura == 0) {
                yaziTuraString = "Yazı";
                sayacYazi++;
            } else {
                yaziTuraString = "Tura";
                sayacTura++;
            }

            System.out.println(yaziTuraString);
        }
        System.out.println("Toplam yazı sayısı : " + sayacYazi);
        System.out.println("Toplam tura sayısı : " + sayacTura);
    }
}
