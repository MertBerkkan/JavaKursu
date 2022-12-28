package bolum.yedi;

public class S6 {
    public static void main(String[] args) {
        System.out.println("İlk 50 asal sayı:");
        int [] dizi = asalSayiyiDiziGetir(50);
        asalSayiDiziYazdir(dizi);
    }

    private static void asalSayiDiziYazdir(int[] asalSayiyiDiziGetir) {
        int satirSayi = 10;

        for (int i = 0; i < asalSayiyiDiziGetir.length; i++) {
            if ((i+1) % satirSayi == 0) {
                System.out.println();
            } else {
                System.out.printf("%4d  ", asalSayiyiDiziGetir[i]);
            }
        }
    }

    public static int[] asalSayiyiDiziGetir(int asalSayiAdeti) {
        int sayi = 2;
        int dizi = 0;
        int diziAsal[] = new int[50];

        while (dizi < asalSayiAdeti) {
            if (asalMi(sayi)) {
                diziAsal[dizi] = sayi;
                sayi++;
                dizi++;
            }else{
                sayi++;
            }
        }
        return diziAsal;
    }


    private static boolean asalMi(int sayi) {
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                return false;
            }
        }

        return true;
    }
}
