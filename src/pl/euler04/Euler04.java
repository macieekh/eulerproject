package pl.euler04;


public class Euler04 {

    public int generateMultiples() {
        int max = 1;
            for (int i = 999; i > 0; i--) {
                for (int y = 999; y >= 0; y--) {
                    if (isPalindrome(i*y)) {
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
}
