package bolum.bes;

public class HarcHesaplama {
    public static void main(String[] args) {
        double harc = 10000;
        int yil = 0;
        while (harc < 20000){
            harc *= 1.07;
            yil++;
            System.out.println(yil + ". yıl okul harcı: " + (int)(harc * 100) / 100);
        }
    }

}
