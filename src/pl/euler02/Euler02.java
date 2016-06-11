package pl.euler02;

public class Euler02 {
    long fib1 = 1;
    long fib2 = 2;
    long fibonacci = 0;
    long sum = 2;

    public long findEvenFib(long x) {

            while (fibonacci <= x) {

                fibonacci = fib1 + fib2;
                fib1 = fib2;
                fib2 = fibonacci;

                if (fibonacci % 2 == 0) {
                    sum += fibonacci;
                }


            }

        return sum;

    }
}
