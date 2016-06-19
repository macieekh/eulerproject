package pl.euler.problem09;


public class Euler09 {
    int a = 0;
    int b = 0;
    int c = 0;
    int max = 1000;
    boolean x = false;

    public boolean findNumber(){
        for (a = 1; a < 1000; a++) {
            for (b = a; b < 1000; b++) {
                c = max -  a - b;
                if ( a*a + b*b == c*c) {
                    System.out.println(a);
                    System.out.println(b);
                    System.out.println(c);
                    x = true;
                }

            }

        }
        return x;
    }

}
