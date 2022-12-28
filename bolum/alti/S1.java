package bolum.alti;

public class S1 {
    public static void main(String[] args) {

        int sayac = 0;
        for (int i = 0; i <= 100; i++) {

            if (sayac % 10 == 0){
                System.out.println();
            } else {
                System.out.printf("%6d",  besgenselSayilariGetir(i));
            }
            sayac++;
        }
    }
    private static int besgenselSayilariGetir(int i) {
        return (i * ((3 * i) - 1)) / 2;
    }
}
