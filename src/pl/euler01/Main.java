package pl.euler01;

import pl.euler02.Euler02;
import pl.euler03.Euler03;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        long number = -1;

        while (number < 0) {
            System.out.println("Enter number: ");
            number = console.nextLong();
        }

        double time = System.nanoTime();
        System.out.println(findSum(number));
        time = System.nanoTime() - time;
        System.out.println(time/1.0e9);

        time = System.nanoTime();
        System.out.println(findSumFast(number));
        time = System.nanoTime() - time;
        System.out.println(time/1.0e9);

        number = 0;
        while (number < 1) {
            System.out.println("Enter the amount of first fibonacci numbers you are looking for: ");
            number = console.nextLong();
        }
        Euler02 obiekt = new Euler02();
        System.out.println(obiekt.findEvenFib(number));

        number = 1;
        while (number < 2) {
            System.out.println("Enter the number for which you are looking for primes: ");
            number = console.nextLong();
        }
        Euler03 euler03 = new Euler03();
        System.out.println(euler03.findPrimes(number));





    }

    public static long findSum(long number) {
        long sum = 0;
        for (long i=1; i<number; i++) {
            if ((i % 3 == 0) || (i % 5 == 0)) {
                sum += i;
            }
        }
        return sum;
    }

    public static long findSumFast(long number) {
        long sum = 0;
        for (long i=0; i<number; i+=3) {
            sum += i;
        }

        for (long i=0; i<number; i+=5) {
            sum += i;
        }

        for (long i=0; i<number; i+=15) {
            sum -= i;
        }

        return sum;
    }

}
