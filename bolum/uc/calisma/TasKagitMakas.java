package bolum.uc.calisma;

import java.util.Random;
import java.util.Scanner;

public class TasKagitMakas {

    public static void main(String[] args) {

        System.out.println("TAŞ : 0 | KAĞIT : 1 | MAKAS : 2 olacak şekilde değer giriniz.");
        Scanner input = new Scanner(System.in);
        int tahmin = input.nextInt();
        Random a = new Random();
        int tkm = a.nextInt(3);
        if (tahmin > 2 || tahmin < 0) {
            System.out.println("HATALI İFADE GİRDİNİZ.");
        } else if (tkm == 0 && tahmin == 0) {
            sonucMesajiniYazdir("TAŞ", "TAŞ", "Berabere");
        } else if (tkm == 1 && tahmin == 1) {
            sonucMesajiniYazdir("KAĞIT", "KAĞIT", "Berabere");
        } else if (tkm == 2 && tahmin == 2) {
            sonucMesajiniYazdir("MAKAS", "MAKAS", "Berabere");
        } else if (tkm == 0 && tahmin == 1) {
            sonucMesajiniYazdir("TAŞ", "KAĞIT", "Tebrikler");
        } else if (tkm == 1 && tahmin == 0) {
            sonucMesajiniYazdir("KAĞIT", "TAŞ", "Kaybettiniz");
        } else if (tkm == 2 && tahmin == 0) {
            sonucMesajiniYazdir("MAKAS", "TAŞ", "Kazandınız.Tebrikler");
        } else if (tkm == 0 && tahmin == 2) {
            sonucMesajiniYazdir("TAŞ", "MAKAS", "Kaybettiniz");
        } else if (tkm == 1 && tahmin == 2) {
            sonucMesajiniYazdir("KAĞIT", "MAKAS", "Kazandınız.Tebrikler.");
        } else if (tkm == 2 && tahmin == 1) {
            sonucMesajiniYazdir("MAKAS", "KAĞIT", "Kaybettiniz.");
        }
    }

    public static void sonucMesajiniYazdir(String pc, String siz, String mesaj) {
        System.out.println("PC: " + pc + "\n" + "Siz: " + siz + "\n" + mesaj);
    }
}
