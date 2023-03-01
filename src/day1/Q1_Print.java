package day1;

public class Q1_Print {
    public static void main(String[] args) {
        /* konsolda:
        "Hello "\
        / 'World'"
        yazdırın
         */
        /*   \n (or \r)  : Starts from a new line : Metni bir alt satırdan itibaren yazdırır.
              \t  : Horizontal tab         : Metni yatayda 1 tab miktarı kaydırır.
              \\  : Prints a back slash    : \  Ters slash yazdırır
              \'  : Prints single quote    : '  Tek tırnak yazdırır.
              \"  : Prints double quote    : "  Çift tırnak yazdırır.
               \ işareti yukarıdakı ifadeli komut halıne getirir. */


        System.out.println("\"Hello \"\\\n/ \'World\'\"");
    }
}
