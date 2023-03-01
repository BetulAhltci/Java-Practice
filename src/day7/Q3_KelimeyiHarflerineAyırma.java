package day7;

import java.util.Arrays;

public class Q3_KelimeyiHarflerineAyırma {
    public static void main(String[] args) {
        /*
        * create a custom return type method accepts a name as parameter
         * and prints the name as a char array
         *
         * (do not use toCharArray() method)
         *
         * Input : John
         * Output : [J, o, h, n]
         *
         Parametre olarak String bir isim girdiginiz, size o ismin harflerini
         bir char Array olarak yazdiran bir method olusturunuz.
         toCharArray() methodunu kullanmayiniz!
         * Input : John
         * Output : [J, o, h, n]
         */

        String ısım="Zafer";

        kelimeninHarfleriniayırma(ısım);

    }

    private static void kelimeninHarfleriniayırma(String ısım) {

        char[] harfler = new char[ısım.length()];

        for (int i = 0; i < ısım.length(); i++) {
            harfler[i]=ısım.charAt(i);
        }
        System.out.println("Kelimenin harflerinin array'i: "+ Arrays.toString(harfler));
    }
}
