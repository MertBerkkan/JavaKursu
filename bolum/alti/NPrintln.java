package bolum.alti;

public class NPrintln {
    public static void main(String[] args) {
        yazdir("Deneme metod", 52);
    }

    static void yazdir(String yazdirilan, int yazmaSayisi) {
        for (int j = 0; j <= yazmaSayisi; j++){
            System.out.println(yazdirilan);
        }
    }
}
