package pl.euler.problem01;

import pl.euler.problem02.Euler02;
import pl.euler.problem03.Euler03;
import pl.euler.problem04.Euler04;
import pl.euler.problem05.Euler05;
import pl.euler.problem06.Euler06;
import pl.euler.problem07.Euler07;
import pl.euler.problem08.Euler08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);
        /*long number = -1;

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

        Euler04 euler04 = new Euler04();
        System.out.println(euler04.generateMultiples());

        Euler05 euler05 = new Euler05();
        System.out.println(euler05.findNumber());

        Euler06 euler06 = new Euler06();
        System.out.println(euler06.findDiff(100));
        System.out.println(euler06.findDiffShort(100));

        Euler07 euler07 = new Euler07();
        System.out.println(euler07.findPrime(10001));

        Euler08 euler08 = new Euler08();
        System.out.println(euler08.calculate());
        System.out.println(euler08.getMaxA());
        System.out.println(euler08.getMaxB());
        System.out.println(euler08.getMaxC());
        System.out.println(euler08.getMaxD()); */


        List a1 = new ArrayList();
        a1.add("One");
        a1.add("Two");
        a1.add("Three");

        System.out.println(" ArrayList Elements");
        System.out.print("\t" + a1);
        System.out.println(a1.get(1));
        a1.add(2, "xxxx");
        System.out.print("\t" + a1);
        a1.remove(1);
        System.out.print("\t" + a1);
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
