package bolum.yedi;

public class S7 {
    public static void main(String[] args) {
        int[] tekrarSayisi = new int[10];

        tekrrSayisiBelirle(tekrarSayisi);
        tekrarSatisiYazdir(tekrarSayisi);
    }

    private static void tekrrSayisiBelirle(int[] tekrarSayisi) {
        for (int i = 0; i < 100; i++){
            int random = (int)(Math.random() * 10);

            for (int j = 0; j < tekrarSayisi.length; j++){
                if (j == random){
                    tekrarSayisi[j]++;
                }
            }
        }
    }

    private static void tekrarSatisiYazdir(int[] tekrarSayisi) {
        for (int i = 0; i < 10; i++){
            System.out.println(i + " sayısı " + tekrarSayisi[i] + " kere tekrar etmiştir.");
        }
    }
}
