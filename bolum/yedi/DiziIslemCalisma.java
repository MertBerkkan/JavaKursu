package bolum.yedi;

import java.util.Scanner;

public class DiziIslemCalisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final int diziSayisi = 100;

        int[] dizi = new int[diziSayisi];

        //Dizideki sayıların yazdırımı:
        diziyiYazdir(dizi);

        diziyiRassalSayilarlaDoldur(dizi);

        diziyiYazdir(dizi);

        //Dizideki sayıların toplamı:
        int toplam = dizidekiSayilarinToplaminiBul(dizi);

        System.out.println("Dizideki sayıların toplamı : " + toplam);

        dizininEnBuyukElemaniVeIndeksiBul(dizi);

        diziyiKaristir(dizi);

        diziyiYazdir(dizi);

        DiziyiSolaKaydir(dizi);

        diziyiYazdir(dizi);
    }

    private static void DiziyiSolaKaydir(int[] dizi) {
        int ilkIndeks = dizi[0];

        for (int i = 0; i < dizi.length - 1;i++){
            dizi[i] = dizi[i + 1];
        }
        dizi[dizi.length - 1] = ilkIndeks;
    }

    private static void diziyiYazdir(int[] dizi) {
        for (int i = 0; i <= dizi.length - 1; i++){
            System.out.printf("%4d ", dizi[i]);
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
        System.out.println("-----------------------------------------------------");

    }

    private static void diziyiKaristir(int[] dizi) {
        for (int i = 0; i <= dizi.length - 1; i++) {
            int rastgeleIndeks = (int)(Math.random() * dizi.length);

            int gecici = dizi[i];
            dizi[i] = dizi[rastgeleIndeks];
            dizi[rastgeleIndeks] = gecici;
        }
    }

    private static void dizininEnBuyukElemaniVeIndeksiBul(int[] dizi) {
        int enBuyukEleman = 0;
        int enBuyukElemaninEnKucukIndeksi = -1;
        
        for (int i = 0 ; i <= dizi.length - 1; i++){
            if(enBuyukEleman < dizi[i]){
                enBuyukEleman = dizi[i];
                enBuyukElemaninEnKucukIndeksi = i;
            }
        }
        System.out.println("--------------------------------------------------------------------------");
        System.out.println("Dizinin en büyük elemanı : " + enBuyukEleman);
        System.out.println("En büyük elemanın en küçük indeks değeri : " + enBuyukElemaninEnKucukIndeksi);
        System.out.println("----------------------------------------------------------------------------");
    }

    private static int dizidekiSayilarinToplaminiBul(int[] dizi) {
        int toplam = 0;
        for (int i = 0; i <= dizi.length - 1; i++){
            toplam += dizi[i];
        }
        return toplam;
    }

    private static void diziyiRassalSayilarlaDoldur(int[] dizi) {

        for (int i = 0; i <= dizi.length - 1; i++){
            dizi[i] = (int)(Math.random() * 100);
        }
    }

}


