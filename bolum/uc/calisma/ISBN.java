package bolum.uc.calisma;

import java.util.Scanner;

public class ISBN {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ISBN numarınızın ilk 9 hanesini girin.(0 ile başlar)");

        String isbnString = input.next();

        int isbn = Integer.parseInt(isbnString);

        int dokuz = isbn % 10;
        int sekiz = (isbn / 10) % 10;
        int yedi = (isbn / 100) % 10;
        int alti = (isbn / 1000) % 10;
        int bes = (isbn / 10000) % 10;
        int dort = (isbn / 100000) % 10;
        int uc = (isbn / 1000000) % 10;
        int iki = (isbn / 10000000) % 10;
        int bir = 0;

        int on = (bir * 1 + iki * 2 + uc * 3 + dort * 4 + bes * 5 + alti * 6 + yedi * 7 + sekiz * 8 + dokuz * 9) % 11;
        if (on % 10 == 0) {
            System.out.println("ISBN numaranız: " + isbn + "X");
        } else {
            System.out.println("ISBN numaranız: " + isbn + on);
        }

    }
}


