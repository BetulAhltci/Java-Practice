package day9;

import java.util.Random;
import java.util.Scanner;

public class Q2_TasKagıtMaakas {
    public static void main(String[] args) {
        //Bilgisayara karşı tas kağıt makas oyunu oynayın
        //5 puana ilk ulasan oyunu kazanır

        Scanner scan=new Scanner(System.in);
        Random random= new Random();

        int useChoise=0;
        int compChoise=0;
        int user=0;
        int comp=0;

        do {

            System.out.println("Asağıdakilerden birini seciniz\n" +
                    "1- Taş\n"+
                    "2- kağıt\n"+
                    "3- Makas");
            useChoise=scan.nextInt();//Kullanıcının seçimi

            compChoise=random.nextInt(3)+1;//Bilgisayarın secimi

            if (useChoise==1 && compChoise==2){
                System.out.println("Kagıt tası sarar!--Bilgisayar +1--");
                comp++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else if (useChoise==1 && compChoise==3){
                System.out.println("Tas makası sarar!--Oyuncu +1--");
                user++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else if (useChoise==2 && compChoise==1){
                System.out.println("Kagıt tası sarar!--Oyuncu +1--");
                user++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else if (useChoise==2 && compChoise==3){
                System.out.println("Makas kağıdı keser!--Bilgisayar +1--");
                comp++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else if (useChoise==3 && compChoise==1){
                System.out.println("Makas tası kırar!--Oyuncu +1--");
                user++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else if (useChoise==3 && compChoise==2){
                System.out.println("Makas Kagıdı keser!--Oyuncu +1--");
                user++;
                System.out.println("oyuncu= "+user+" Bilgisayar= "+comp);
            } else {
                System.out.println("Berabere!");
                System.out.println("Oyuncu= "+user+" Bilgisayar= "+comp);

            }

        }while(user!=5 && comp!=5);{
            //kazananı göster
            if (user>comp)
                System.out.println("Sen Kazandın!!!!!!");
            else{
                System.out.println("Kybettiniz!!!!");
            }

            scan.close();
        }



    }
}
