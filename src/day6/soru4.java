package day6;

public class soru4 {
    public static void main(String[] args) {
        /*
        String' lerden oluşan bir arrayde öğeler 'n' veya 'k' ile bitiyorsa,
        o öğelerin baş harflerini ekrana yazdıran metodu yazınız.
        Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JMJ
         */

        String[] str={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        System.out.println("ilk harfler:"+harfKontrolü(str));



    }
    public static String harfKontrolü(String[] str){
        String ilkharfler="";
        for (int i = 0; i <str.length ; i++) {
            if (str[i].endsWith("n")||str[i].endsWith("k")){
                ilkharfler+=str[i].charAt(0);
            }
        }
        return ilkharfler;
    }

}
