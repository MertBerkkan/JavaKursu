package bolum.alti;

public class BasitMetod {
    public static void main(String[] args) {
        System.out.println("1 den 10 a kadar olan sayıların toplamı : " + toplam(1, 10));
        System.out.println("10 dan 30 a kadar olan sayıların toplamı : " + toplam(10, 30));
        System.out.println("30 dan 50 ye kadar olan sayıların toplamı : " + toplam(30, 50));

    }

    static int toplam(int sayi1, int sayi2){
        int toplam = 0;

        for (int i = sayi1; i <= sayi2; i++){
            toplam += i;
        }

        return toplam;
    }
}
