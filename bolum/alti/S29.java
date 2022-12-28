package bolum.alti;

public class S29 {
    public static void main(String[] args) {
        for (int sayi = 2; sayi <= 100; sayi++){
            if (asalMi(sayi) && asalMi(sayi + 2)) {
                System.out.println("(" + sayi + "," + (sayi + 2) + ")");
            }
        }
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
