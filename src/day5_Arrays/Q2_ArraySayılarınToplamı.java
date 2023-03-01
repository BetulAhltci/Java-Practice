package day5_Arrays;

public class Q2_ArraySayılarınToplamı {
    public static void main(String[] args) {
        //Create an array of 5 floats and calculate their sum.

       //float[] numbers=new float[5];

        float[]numbers={1.1f,2.2f,3.0f,5.0f,7.5f};

       float toplam=0;

        System.out.println("+++++++++++++++for Loop çözümü+++++++++++++");

        for (int i = 0; i <numbers.length ; i++) {

            toplam+=numbers[i];

        }
        System.out.println(toplam);

        System.out.println("++++++++++++++++While Loop Çözümü 1++++++++++++++++++");

        toplam=0;
        int index=0;
        while (index<numbers.length){
            toplam+=numbers[index];
            index++;

        }
        System.out.println(toplam);

        System.out.println("++++++++++++++++While Loop Çözümü 2++++++++++++++++++");

        toplam=0;
        int indexx=numbers.length-1;
        while (indexx>=numbers.length){
            toplam+=numbers[indexx];
            indexx--;

        }
        System.out.println(toplam);




    }
}
