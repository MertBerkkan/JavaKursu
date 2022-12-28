package bolum.bes.sorular;

public class SutunBolme {
    public static void main(String[] args) {
        int sayi = 100;
        int sayac = 0;
        final int satirSayi = 10;
        while (sayi < 10000000) {

            if (sayi % 30 == 0) {
                sayac++;

                if (sayac % satirSayi == 0) {
                    System.out.println(sayi);
                } else {
                    System.out.print(sayi + " ");
                }
            }

            sayi++;
        }
    }
}

