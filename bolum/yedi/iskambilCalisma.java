package bolum.yedi;

import java.util.Scanner;

public class iskambilCalisma {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("İskambil destesinden kaç kart çekmek istersiniz ?");

        int kartSayi = input.nextInt();

        String[] tipDizi = {"Kupa", "Karo", "Maça", "Sinek"};
        String[] sayiDizisi = {"As", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Vale", "Kız", "Papaz"};

        int[] deste = new int[52];

        for (int i = 0; i < deste.length; i++){
            deste[i] = i;
        }

        for (int i = 0; i < deste.length; i++){
            int rastgeleIndeks = (int)(Math.random() * 52);

            int gecici = deste[i];
            deste[i] = deste[rastgeleIndeks];
            deste[rastgeleIndeks] = gecici;
        }

        for (int i = 0; i <= kartSayi; i++){
            String tip = tipDizi[(deste[i] / 13)];
            String sayi = sayiDizisi[(deste[i] % 13)];

            System.out.println(tip + " " + sayi);
        }

    }

}
