package day4_ForLoop;

public class Soru5 {
    public static void main(String[] args) {
        //1 den 100 e kadar olan sayıların içinde mükemmel olanları yazdıran bir metod oluşturun
         int sayı=0;
        mukemmelsayılar(sayı);
    }
    public static void mukemmelsayılar (int sayı){
        int toplam=0;
        for (int i = 1; i <=100 ; i++) {
            if (sayı%i==0){
               toplam++;
            }
        }
        if (toplam==sayı){
            System.out.println(sayı);
        }
    }
}
