package day10;

public class Q01_EBOB_EKOK {
    public static void main(String[] args) {
        // Take 2 integers from user and find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)
        // Kullanicidan 2 adet tamsayi alip, EBOB ve EKOK'larini bulan program yaziniz.

        int sayi1=125;
        int sayi2=75;
        int kucuksayi=0;
        int buyuksayi=0;

        if (sayi1<sayi2){
            kucuksayi=sayi1;
            buyuksayi=sayi2;
        }else {
            kucuksayi=sayi2;
            buyuksayi=sayi1;
        }
        int flag=0;
        for (int i = kucuksayi; i >1; i--) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                System.out.println("EBOB= " + i);
                flag++;
                break;
            }
        }
        if (flag==0) System.out.println("bu sayıların EBOB'u yoktur");

        flag=0;

        for (int i = buyuksayi; i <=sayi1*sayi2 ; i+=buyuksayi) {
            if (i%sayi1==0 && i%sayi2==0){
                System.out.println("EKOK= "+i);
                break;

            }
        }

















    }
}
