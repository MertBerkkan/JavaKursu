package bolum.bes.sorular;

public class AsciiYazdir {
    public static void main(String[] args) {
        int sayac = 1;
        for (int ascii = 33; ascii <= 126; ascii++, sayac++) {
            if (sayac % 10 == 0) {
                System.out.println((char) ascii);
            } else {
                System.out.print((char) ascii + " ");
            }
        }

    }
}
