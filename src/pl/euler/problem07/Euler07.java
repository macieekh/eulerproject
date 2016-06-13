package pl.euler.problem07;

import static java.lang.Math.sqrt;

public class Euler07 {
    public int findPrime (long number) {
        int counter = 0;
        int i = 2;

        while (counter < number) {
            if (isPrime(i)) {
                counter++;
                i++;
            }
            else
            {
                i++;
            }

        }
        return i-1;
    }


    public boolean isPrime(long number) {
        boolean isPrimeNumber = true;

        for (int i = 2; i<=sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }

        return isPrimeNumber;
    }
}

