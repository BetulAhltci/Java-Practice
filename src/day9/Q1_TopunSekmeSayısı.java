package day9;

public class Q1_TopunSekmeSayısı {
    public static void main(String[] args) {
        //Bir top belirli yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do
        // while code blogu create ediniz.

        double yukseklik=2.00;
        double topunToplamYolu=0;
        int yereVurmaSayisi=0;

        do {
            topunToplamYolu+=yukseklik;
            yereVurmaSayisi++;
            yukseklik*=0.75;
            topunToplamYolu+=yukseklik;

        }while (yukseklik>=1);

        System.out.println("Topun aldığı toplam yol: "+topunToplamYolu+"\nTopun yere vurma sayısı: "+yereVurmaSayisi);




    }
}
