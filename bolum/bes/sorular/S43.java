package bolum.bes.sorular;

public class S43 {
    public static void main(String[] args) {
        int sayac = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 7; j++) {
                if (i != j) {
                    System.out.println(i + " " + j);
                    sayac++;
                }
            }
        }
        System.out.println("Tüm kombinasyonlar toplam " + sayac + " tanedir.");


    }
}
