package day1;

public class Q2_Print {
    public static void main(String[] args) {
        /*   \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
               \ işareti yukarıdakı ifadeli komut halıne getirir. */

       /*
        ************************************
                "ATM'ye Hosgeldiniz"
             1- Bakiye Sorgulama
             2- Para Yatirma
             3- Para Cekme
             4- Menu'den Cikis
        *************************************
         */

        System.out.print("************************************\n\t\t\"ATM'ye Hosgeldiniz\"\n\t");
        System.out.print("1- Bakiye Sorgulama\n\t");
        System.out.print("2- Para Yatırma\n\t");
        System.out.print("3- Para Çekme\n\t");
        System.out.print("4- Menu'den Çıkış\n************************************");

        System.out.println();


        System.out.println("************************************\n\t\t"+"\"ATM'ye Hoşgeldiniz\"\n\t"+
                "1- Bakiye sorgulama\n\t"+"2- Para Yatırma\n\t"+"3- Para Çekme\n\t"+
                "4- Menu'den Çıkış\n************************************"
                );


    }
}