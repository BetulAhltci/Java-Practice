package day5_Arrays;

import java.util.ArrayList;

public class Q1_ArraylerinOrtakElemanınıBulma {
    public static void main(String[] args) {
        /*
         * iki array arasinda ayni olan elemanlari bir liste ekleyen program yazin
         * (buyuk kucuk harf onemsiz)
         *
         * Input1 : {John,Brad,Ange,Sofia,Emily} Input2 : {sofia,brad,grace,emily,hazel}
         *
         * Output : [sofia,brad,emily]
         */


     String[] array1=new String[5];
     array1[0]="John";
     array1[1]="Brad";
     array1[2]="Angel";
     array1[3]="Sofia";
     array1[4]="Emily";

     String[] array2={"sofia","brad","grace","emily","hazel"};

     ortakElemanlar(array1,array2);




    }

    private static void ortakElemanlar(String[]arr1,String[]arr2) {

        ArrayList <String> arrList=new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {

            for (int j = 0; j < arr2.length ; j++) {

                if (arr1[i].equalsIgnoreCase(arr2[j])){

                    arrList.add(arr1[i]);
                }

            }

        }
        System.out.println(arrList);

    }


}
