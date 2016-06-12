package pl.euler.problem04;

public class Euler04 {

    public int generateMultiples() {
        int max = 1;
            for (int i = 999; i > 0; i--) {
                for (int y = 999; y >= 0; y--) {
                    if (isPalindromeManual(i*y)) {
                        if (i*y > max) {
                            max = i*y;
                        }
                        break;

                    }
                }
            }
        return max;
    }

    public boolean isPalindrome(long number) {

        String str = Long.toString(number);
        String rev = new StringBuffer(str).reverse().toString();

        if ( str.equals(rev)) {
            return true;
        }
        else
        {
            return false;
        }
    }

    public boolean isPalindromeManual(long number) {
        String str = Long.toString(number);
        String rev = "";

        for (int i = str.length()-1; i>=0; i--) {
            rev = rev + str.charAt(i);
        }

        if (str.equals(rev)) {
            return true;
        }
        else
        {
            return false;
        }
    }
}
