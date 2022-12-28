package bolum.yedi;

import static bolum.yedi.BinaryArama.binaryArama;

public class BinaryAramaCalistir {
    public static void main(String[] args) {
        int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
        int i = binaryArama(list, 2);
        int j = binaryArama(list, 11);
        int k = binaryArama(list, 12);
        int l = binaryArama(list, 1);
        int m = binaryArama(list, 3);


        System.out.println(i + "|" + j + "|" + k + "|" + l + "|" + m);
    }
}
