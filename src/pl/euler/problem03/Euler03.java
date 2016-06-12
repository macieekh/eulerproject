package pl.euler.problem03;

import static java.lang.Math.sqrt;

public class Euler03 {

    public long findPrimes (long number) {
        long div = 2;
        while (div <= sqrt(number)) {
            if (number % div == 0) {
                System.out.println(div);
                number = number / div;
            }
            else
            {
                div = div +1;
            }
        }
        return number;
    }
}
