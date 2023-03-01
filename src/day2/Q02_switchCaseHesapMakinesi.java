package day2;

import java.util.Scanner;

public class Q02_switchCaseHesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki tamsayi sayi ve islem cinsini alin

         * ve sayilari kullanicinin belirledigi isleme tabii tutup sonucu yazdirin.

         * islem cinsi icin 1:toplama 2:cikarma 3:carpma 4: bolme

         * Ornek : Inputs : sayilar : 18 , 10  islem : 3
         *         Output : 18 X 10 = 180 */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen iki tam sayı girin");
        int a = scan.nextInt();
        int b = scan.nextInt();


        System.out.println("işlem türünü seçiniz:\n\t1:Toplama\n\t2:Çıkarma\n\t3:Çarpma\n\t4:Bölme");
        int islem = scan.nextInt();

        System.out.println("*************** if Çözümü ****************");

        if (islem == 1) System.out.println(a + b);
        else if (islem == 2) System.out.println(a - b);
        else if (islem == 3) System.out.println(a * b);
        else if (islem == 4) {
            if (b == 0) System.out.println("0 a bölüm tanımsızdır");
            else System.out.println(a / b);
        } else System.out.println("yanliş giriş yaptınız");

        System.out.println("*************** Switch Çözümü ****************");

        switch (islem) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) System.out.println("0 a bölüm tanımsızdır");
                else System.out.println(a / b);
                System.out.println(a / b);
                break;
            default:
                System.out.println("yanliş giriş yaptınız");


                System.out.println("lütfen işlem türünü seçiniz\n\t" +
                        "toplama\n\t" +
                        "çıkarma\n\t" +
                        "çarpma\n\t" +
                        "bölme");

                char isaret=scan.next().charAt(0);

                switch (isaret){
                    case '+':
                        System.out.println(a + b);
                        break;
                    case '-':
                        System.out.println(a - b);
                        break;
                    case '*':
                        System.out.println(a * b);
                        break;
                    case '/':
                        if (b == 0) System.out.println("0 a bölüm tanımsızdır");
                        else System.out.println(a / b);
                        break;
                    default:
                        System.out.println("yanliş giriş yaptınız");


                }
        }
    }
}

