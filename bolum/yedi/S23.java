package bolum.yedi;

import java.util.Scanner;

public class S23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ADAM ASMACA OYUNU");

        String[] kelimeler = {"FOK", "ASLAN", "AT", "YILAN", "KAPLAN", "MAYMUN", "TAVUK", "BUKELAMUN", "KEDİ", "KÖPEK", "GÜVERCİN"};

        int sayac = 0;

        while (sayac < 1000) {
            String kelime = kelimeler[(int) (Math.random() * kelimeler.length)];

            int kelimeUzunluk = kelime.length();

            char[] yildiz = new char[kelimeUzunluk];
            char[] kelimeChar = kelime.toCharArray();
            for (int i = 0; i < kelimeUzunluk; i++) {
                yildiz[i] = '*';
            }

            while (sayac < 1000) {
                System.out.print(" 'SORU' : KELİMEYİ BULUN : ");
                for (int i = 0; i < kelimeUzunluk; i++) {
                    System.out.print(yildiz[i]);
                }
                String cevapS = input.nextLine().toUpperCase();
                char cevap = cevapS.charAt(0);

                int[] deger = charIcindemi(kelimeChar, cevap);
                int[] degeryildiz = charIcindemi(yildiz, cevap);

                for (int i = 0; i < kelimeUzunluk; i++) {
                    if (deger[i] >= 1) {
                        if (degeryildiz[i] >= 1) {
                            System.out.println(cevap + "Zaten kelimede var.");
                        } else {
                            for (int j = 0; j < kelimeUzunluk; j++) {
                                if (deger[i] > 0) {
                                    yildiz[i] = cevap;
                                }
                            }
                        }
                    }
                }

                if(esitMi(kelimeChar, yildiz)){
                    break;
                }
            }

            System.out.print(" 'SORU' : KELİMEYİ BULUN : ");
            for (int i = 0; i < kelimeUzunluk; i++) {
                System.out.print(yildiz[i]);
            }
            System.out.println("\nTEBRİKLER..... Devam etmek için E yazınız.\n               Bitirmek için H yazınız.");
            String cevapSon = input.nextLine().toUpperCase();
            char cevapSonChar = cevapSon.charAt(0);
            if (cevapSonChar != 'E') {
                break;
            }
        }
    }


    private static int[] charIcindemi(char[] liste, char arananChar) {

        int[] cevap = new int[liste.length];
        for (int i = 0; i < liste.length; i++) {
            if (liste[i] == arananChar) {
                cevap[i] = i + 1;
            }
        }
        return cevap;
    }

    public static boolean esitMi(char[] kelimeChar, char[] yildiz) {
        for (int i = 0; i < kelimeChar.length; i++) {
            if (kelimeChar[i] == yildiz[i]) {
                if (kelimeChar[kelimeChar.length - 1] == yildiz[kelimeChar.length - 1]) {
                    return true;
                } else {
                    return false;
                }
            }
        }
        return false;
    }
}

