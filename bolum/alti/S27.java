package bolum.alti;

public class S27 {
    public static void main(String[] args) {
        int polindromSayac = 1;
        int sayi = 1;

        System.out.println("\tLASAL VE POLİNDROM OLMAYAN SAYILAR");
        System.out.println("---------------------------------------------------");

        while (polindromSayac <= 100) {
            if (lasaMi(sayi)) {
                if (polindromSayac % 10 == 0) {
                    System.out.println();
                } else {
                    System.out.printf("%4d ", sayi);
                }
                polindromSayac++;
            }
            sayi++;

        }
    }

    private static boolean polindromMu(int sayi) {
        String plndrmSayi = String.valueOf(sayi);

        for (int i = 0, j = plndrmSayi.length() - 1; i <= j; i++, j--) {
            char ch1 = plndrmSayi.charAt(i);
            char ch2 = plndrmSayi.charAt(j);
            if (ch1 == ch2) {
                return false;
            }
        }
        return true;

    }

    private static boolean lasaMi(int sayi) {

        if (asalMiIki(sayi)) {
            int ters = 0;
            while (sayi != 0) {

                ters = ters * 10;
                ters = ters + sayi % 10;
                sayi = sayi / 10;
            }

            if (asalMi(ters)) {
                return true;
            }
        }
        return false;
    }

    public static boolean asalMi(int s) {

        for (int i = 2; i < s; i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return polindromMu(s);
    }

    public static boolean asalMiIki(int s) {

        for (int i = 2; i < s; i++) {
            if (s % i == 0) {
                return false;
            }
        }
        return true;
    }
}
