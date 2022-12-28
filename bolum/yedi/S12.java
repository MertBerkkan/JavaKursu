package bolum.yedi;

import java.util.Scanner;

public class S12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Öğrenci sayısını giriniz.");
        int mevcut = input.nextInt();
        String [] isimler = new String[mevcut];
        double [] puanlar = new double[mevcut];

        isimPuanAta(input, isimler, puanlar);
        puanSirala(isimler, puanlar);
        siralamaYazdir(isimler, puanlar);
    }

    private static void siralamaYazdir(String[] isimler, double[] puanlar) {
        for (int i = 0; i < puanlar.length; i++){
            System.out.println(isimler[i] + "'nın puanı: " + puanlar[i]);
        }
    }

    private static void isimPuanAta(Scanner input, String[] isimler, double[] puanlar) {
        System.out.println("Öğrenci isim ve puanlarını giriniz.(Mehmet 70 )");
        for (int i = 0; i < puanlar.length; i++){
            isimler[i] = input.next();
            puanlar[i] = input.nextDouble();
        }

    }

    public static void puanSirala (String[] isimler, double[] puanlar){

        String durak = "";
        double gecici = 0;
        int mevcut = isimler.length;
        for (int i = 0; i < mevcut; i++){
            for (int j = 1;j < mevcut; j++)
                if (puanlar[j - 1] < puanlar[j]) {
                    gecici = puanlar[j - 1];
                    durak = isimler[j - 1];
                    puanlar[j - 1] = puanlar[j];
                    isimler[j - 1] = isimler[j];
                    puanlar[j] = gecici;
                    isimler[j] = durak;
                }
        }
    }
}
