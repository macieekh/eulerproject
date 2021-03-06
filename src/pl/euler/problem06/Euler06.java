package pl.euler.problem06;

public class Euler06 {


    /* Solution #1 */
    public double findDiff(double number) {

        return squareOfSum(number)-sumoOfSquares(number);
    }

    public double sumoOfSquares(double number){
        double sum = 0;

        for (int i=1; i<=number; i++) {
            sum += Math.pow(i,2);
        }

        return sum;
    }

    public double squareOfSum (double number) {
        double sum = 0;

        for (int i=1; i<=number; i++) {
            sum += i;
        }

        return Math.pow(sum, 2);
    }

    /* Solution #2 - refactored and shortened */
    public long findDiffShort (long number) {
        long sum = 0;
        long sumOfSquares = 0;

        for (int i=1; i<=number; i++) {
            sum += i;
            sumOfSquares += i*i;
        }

        return sum*sum - sumOfSquares;
    }

}
