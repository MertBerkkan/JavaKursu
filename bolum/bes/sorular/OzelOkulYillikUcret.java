package bolum.bes.sorular;

public class OzelOkulYillikUcret {

    public static void main(String[] args) {

        int yillikUcret = 10000;
        int yil = 2;
        int dortYilToplam = 0;
        System.out.println("1.yıl okul ücreti 10000");

        while (yil < 15) {
            yillikUcret = (int) (yillikUcret * 0.05 + yillikUcret);
            if (yil > 10) {
                dortYilToplam += yillikUcret;
            } else {
                System.out.println(yil + ".yıl okul ücreti " + yillikUcret);
            }
            yil++;
        }
        System.out.println(" 10 yıldan sonraki 4 yıllık toplam ücreti: " + dortYilToplam);
    }
}
