package bolum.uc.calisma;

import java.util.Random;

public class Deste {

    public static void main(String[] args) {

        Random a = new Random();
        int desteSayilar = a.nextInt(12) + 1;
        int desteTur = a.nextInt(3) + 1;

        String sayilar = desteSayiIsimler(desteSayilar);
        String turler = desteSayiTurler(desteTur);

        System.out.println("Kartınız: " + turler + "-" + sayilar);
    }

    public static String desteSayiIsimler(int kartRakam) {
        switch (kartRakam) {
            case 1:
                return "AS";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case 8:
                return "8";
            case 9:
                return "9";
            case 10:
                return "10";
            case 11:
                return "Vale";
            case 12:
                return "Kız";
            case 13:
                return "Papaz";
            default:
                return "HATA";
        }
    }

    public static String desteSayiTurler(int kartTur) {
        switch (kartTur) {
            case 1:
                return "Sinek";
            case 2:
                return "Karo";
            case 3:
                return "Kupa";
            case 4:
                return "Maça";
            default:
                return "HATA";
        }

    }
}
