package bolum.alti;

public class S16 {
    public static void main(String[] args) {
        for (int yil = 2000; yil <= 2022; yil++){
            System.out.println(yil + " yılı " + yildakiGunSayisi(yil) + " gün çeker.");
        }
    }

    private static int yildakiGunSayisi(int yil) {
        if (yil % 4 == 0 || yil % 100 == 0 || yil % 400 == 0){
            return 366;
        }else {
            return 365;
        }
    }
}
