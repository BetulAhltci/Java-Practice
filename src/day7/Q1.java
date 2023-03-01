package day7;

import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {

        char[][]harfler=new char[3][4];

        //
        harfler [0][0]='A';
        harfler [0][1]='B';
        harfler [0][2]='C';
        harfler [0][3]='D';

        System.out.println(Arrays.deepToString(harfler));
        //katmanlı arraylerin içleri yazılmak istendiği zaman deepToString kullanıır

        System.out.println(Arrays.toString(harfler[0]));//[A, B, C, D]

        System.out.println(harfler[0][2]);//C


        harfler [1][0]='E';
        harfler [1][1]='F';
        harfler [1][2]='G';
        harfler [1][3]='H';

        harfler [2][0]='I';
        harfler [2][1]='J';
        harfler [2][2]='K';
        harfler [2][3]='L';

        System.out.println(Arrays.deepToString(harfler));//[[A, B, C, D], [E, F, G, H], [I, J, K, L]]

        //tüm atamalları index ler üzerinden tek tek yaoabileceğimiz gibi tel seferdede yapbiliriz

        int [][] sayılar={{10,20,30},{1,2,3},{100,200,300}};
        System.out.println(sayılar[2][1]);//200
        System.out.println(sayılar[0][0]);//10
        System.out.println(sayılar[1][2]);//3





    }
}
