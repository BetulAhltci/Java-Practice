package day4_ForLoop;

public class Soru1 {
    public static void main(String[] args) {
        //100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).

        int toplam=0;

        for (int i =100; i>=0 ; i--) {
            if (i%13==0){
                System.out.println(i);
                toplam+=i;
            }

        }
        System.out.println("toplm="+ toplam);
    }
}
