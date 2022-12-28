package bolum.bes;

import java.util.Scanner;

public class PalindronMu {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Bir şeyler yazınız.");
        String cumle = klavye.nextLine();
        boolean palindronMu = true;
        for (int i = 0, j = cumle.length()-1; i < j; i++, j--){
            char ch1 = cumle.charAt(i);
            char ch2 = cumle.charAt(j);
            if (ch1 != ch2){
                palindronMu = false;
            }
        }
        if(palindronMu){
            System.out.println(cumle + " bir palindrondur.");
        } else {
            System.out.println(cumle + " bir palindron değildir.");
        }
    }
}
