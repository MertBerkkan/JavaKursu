package bolum.bes.sorular;

public class S26 {
    public static void main(String[] args) {
        int sayac = 1;
        double toplam = 0;

        for (double i = 1; sayac <= 100000; i++) {
            toplam += 1 / i * (i - 1);

            sayac++;

            if (sayac == 10000 || sayac == 20000 || sayac == 30000 || sayac == 40000 || sayac == 50000 || sayac == 60000 || sayac == 70000 || sayac == 80000 || sayac == 90000 || sayac == 100000) {
                System.out.println(sayac + ". denemede e' nin yaklaşık değeri: " + toplam + 1);
            }

        }
    }
}
