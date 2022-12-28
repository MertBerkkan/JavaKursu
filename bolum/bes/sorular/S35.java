package bolum.bes.sorular;

public class S35 {
    public static void main(String[] args) {

        double toplam = 0;
        for (double i = 1, j = 2; i <= 624; i++, j++){

            toplam += 1 / Math.sqrt(i) + Math.sqrt(j);
        }
        System.out.println(toplam);
    }
}
