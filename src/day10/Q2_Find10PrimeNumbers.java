package day10;

import java.util.ArrayList;
import java.util.List;

public class Q2_Find10PrimeNumbers {
    public static void main(String[] args) {
        /*
         * Write a program that accepts an integer as input and prints first 10 prime
         * numbers greater than input
         *
         * Check numbers if they are even or not in a return method
         */

        int input = 5;
        int count = 0;
        List<Integer> firt10Primes = new ArrayList<>();

        while (count < 10) {
            input++;
            if (isPirime(input)){
                firt10Primes.add(input);
                count++;
            }

            }
        System.out.println(firt10Primes);

    }
        private static boolean isPirime ( int number){

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


