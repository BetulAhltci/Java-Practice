package day6;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
//Kullanıcı tarafından girilen string ifadenin içindeki sayısal değerleri toplayan metodu yazınız;

        String str= "1-10 of 202 results for \"nutella\"";

        String str1= str.substring(2,4);
        String str2= str.substring(8,10);

        int str3= Integer.parseInt(str1);
        int str4= Integer.parseInt(str2);

        System.out.println(str3+str4);


        System.out.println("=============================================================");

        Scanner scan= new Scanner(System.in);
        System.out.println("cümle giriniz");
        String cümle=scan.nextLine();

        System.out.println(SayısalIfadeleriTopla(cümle));


    }

    public static int SayısalIfadeleriTopla(String cumle){
        int toplam=0;
        String cumleArr[]=cumle.split("");
        /*

        for (String each:cumleArr) {
            if (Character.isDigit()){
                toplam+=Integer.valueOf(each),
            }

        }*/
        for (int i = 0; i <cumleArr.length ; i++) {
            if (Character.isDigit(cumleArr[i].charAt(0))){
                toplam+=Integer.valueOf(cumleArr[i]);
            }
        }

        return toplam;
    }

}
