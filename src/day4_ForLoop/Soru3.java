package day4_ForLoop;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        //Girilen bir stringdeki a harfi sayısını bulunuz. ama c harfine gelirse
        // döngüden çıkılsın
        // Bugün hava oldukca güzel.-> 2

        Scanner scan=new Scanner(System.in);
        System.out.println("lütfen bir metin giriniz");
        String str=scan.nextLine().toUpperCase();
        int toplama=0;

        for (int i = 0; i <str.length(); i++) {
            if (str.charAt(i)=='A'){
                toplama++;
            }if (str.charAt(i)=='C'){
                break;
            }

        }
        System.out.println(toplama+" adet a var");

    }
}
