package day4_ForLoop;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Bir sayinin mükemmel olup olmadiğini bulan bir method yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamı, kendisine eşitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                 1+2+3 = 6 = 6 (Mükemmel)
         */

        System.out.println("bir sayı giriniz");
        Scanner scan=new Scanner(System.in);
        int sayı= scan.nextInt();

        if (mukemmelSayı((sayı))){
            System.out.println(sayı+" mükemmel sayı");
        }else{
            System.out.println("mükemmel sayı değil");
        }


    }

    public static boolean mukemmelSayı(int sayı){
        int toplam=0;
        for (int i = 1; i < sayı; i++) {
            if (sayı%i==0){
                toplam++;
            }
        }
        if (toplam==sayı){
            return true;
        }else {
            return false;
        }
    }
}
