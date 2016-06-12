package pl.euler.problem05;

public class Euler05 {

    public int findNumber() {
        int i = 1;

        while (!evenlyDivisible(i)){
            i++;
        }

        return i;
    }


    public boolean evenlyDivisible (int number) {
        boolean divisible = true;
        for (int i=2; i<=20; i++) {
            if (number % i != 0) {
                divisible = false;
                break;
            }
        }
        if (divisible) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
