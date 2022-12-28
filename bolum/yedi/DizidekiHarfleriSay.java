package bolum.yedi;

public class DizidekiHarfleriSay {
    public static void main(String[] args) {
        char[] karakterDizisi = rassalDiziYarat();

        rassalDiziYazdir(karakterDizisi);
        int[] sayac = harfleriSay(karakterDizisi);
        sayacYazdir(sayac);
    }

    private static void sayacYazdir(int[] sayac) {
        System.out.println("Sayaç yazdırılıyor................");

        for (int i = 0; i < sayac.length; i++){
            System.out.print((char)('a' + i) + " : " + sayac[i] + "   ");
            if ((i + 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    public static int[] harfleriSay(char[] karakterDizisi) {
        int[] sayac = new int[26];

        for (int i = 0; i < karakterDizisi.length; i++){
            sayac[karakterDizisi[i] - 'a']++;
        }
        return sayac;
    }

    public static void rassalDiziYazdir(char[] karakterDizisi) {
        for (int i = 0; i < karakterDizisi.length; i++){
            System.out.print(karakterDizisi[i] + "  ");

            if((i+ 1) % 10 == 0){
                System.out.println();
            }
        }
    }

    public static char[] rassalDiziYarat() {
        char [] dizi = new char[100];

        for (int i = 0 ; i < dizi.length; i++){
            dizi[i] = charGetir();
        }
        return dizi;
    }

    public static char charGetir() {
        return (char) (int) ((Math.random() * ('z' - 'a' + 1)) + 'a');
    }
}
