package day4_ForLoop;

public class Soru2 {
    public static void main(String[] args) {
        // 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.


        for (int i = 0; 255 >= i; i++) {
            System.out.println(i + " " + (char) i);


        }

    }
}

