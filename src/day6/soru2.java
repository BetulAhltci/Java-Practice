package day6;

import java.util.ArrayList;
import java.util.List;

public class soru2 {
    public static void main(String[] args) {
        //Elinizde bir miktar farklı boylarda somun ve bu somunlara uyacak civatalar olsun.
        // Civataları somunlara eşlemek için nasıl bir algoritma yazarsınız.

        int[] civata={ 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int[] somun= { 3, 6, 5, 7, 79, 9, 3, 1, 33 };



        for (int i = 0; i < civata.length; i++) {
            for (int j = 0; j <somun.length ; j++) {
                if (civata[i]==somun[j]){
                    System.out.println(somun[i]+" somunu "+ civata[j]+" ile eşleşti");
                }

            }

        }





    }


}
