package day2;

import java.util.Scanner;

public class Q1_IfTernaryRakamPozitifSayı {
    public static void main(String[] args) {

        //Kullanicidan bir sayi aliniz
        //Sayi 0 dan buyuk esit ise 10 dan kucuk olup olmadigini kontrol ediniz.
        //10 dan kucuk ise ekrana "Rakam" yazdiriniz degilse "Pozitif Sayi" yazdiriniz.
        //Sayi 0 dan kucuk ise ekrana "Negatif Sayi" yazdiriniz.

        Scanner scan= new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı= scan.nextInt();

        System.out.println("***************** if çözümü ***************");

        if(sayı>=0) {
            if (sayı < 10) {
                System.out.println("girdiğiniz sayı bir Rakamdır");
            } else
                System.out.println("pozitif sayı");
        } else {
            System.out.println("girdiğini sayı bir negatif sayı");
            }

        System.out.println("***************** Ternary çözümü ***************");

        String result = (sayı>=0?((sayı<10) ? "sayı bir rakam" : "pozitif sayı") : "negatif sayı");
        System.out.println(result);



        }
    }


